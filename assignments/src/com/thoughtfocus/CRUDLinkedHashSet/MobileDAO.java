package com.thoughtfocus.CRUDLinkedHashSet;

import java.util.LinkedHashSet;

import com.thoughtfocus.array.exception.encapsulationarray.crudOperationPractical.DeleteByMobileIDException;
import com.thoughtfocus.array.exception.encapsulationarray.crudOperationPractical.MobileDTO;
import com.thoughtfocus.array.exception.encapsulationarray.crudOperationPractical.UpdateBySerialNumber;

public class MobileDAO {
	LinkedHashSet<MobileDTO>mobiledto = new LinkedHashSet<MobileDTO>();
	
	@Override
	public void getAll() {
		for (MobileDTO mobileDTO2 : mobiledto) {
			
				System.out.println (mobileDTO2);
			}
		}
		
	
	@Override
	public void getAllByBrandName(String brandName)  {
		for (MobileDTO mobileDTO2 : mobiledto) {			
			if(brandName.equals(mobileDTO2.getBrandName())){
					System.out.println(mobileDTO2);	
								
				}
			}
	}
		
	
	public boolean add(MobileDTO dto) {
		if (dto!=null) {
			mobiledto.add(dto);
			return true;
			
		}
		return false;
	}
	public MobileDTO deleteByMobileID(long mobileid) {
		for (MobileDTO mobileDTO2 : mobiledto) {
			if (mobileDTO2.getMobileID()==mobileid) {
				System.out.println(mobileid);
				}
			}
		}
		DeleteByMobileIDException deleteexception = new DeleteByMobileIDException();
		throw deleteexception;
	
	public MobileDTO UpdateBySerialNumber(long oldserialnumber,long newserialnumber) {
		for (MobileDTO mobileDTO2 : mobiledto) {
			if(oldserialnumber==mobileDTO2.getSerialNumber()) {
				mobileDTO2.setSerialNumber(newserialnumber);
				System.out.println("updated");
			}
		}
		UpdateBySerialNumber updatebyserialnumber = new UpdateBySerialNumber();
		throw updatebyserialnumber;
	}

}
