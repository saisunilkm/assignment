package com.thoughtfocus.array.exception.encapsulationarray.crudOperationPractical;

public class MobileDAO extends MobileMethods {
	MobileDTO [] mobiledto = new MobileDTO[5];
	private int index = 0;
	@Override
	public void getAll() {
		for (int index = 0; index < mobiledto.length; index++) {
			if (mobiledto[index]!=null) {
				System.out.println (mobiledto[index]);
			}
		}
		
	}
	@Override
	public void getAllByBrandName(String brandName)  {
		for (int index = 0; index < mobiledto.length; index++) {
			if (mobiledto[index]!=null) {
				if (mobiledto[index].getBrandName().equals(brandName)){
					System.out.println(mobiledto[index]);	
								
				}
			}
		}
		
	}
	boolean add(MobileDTO dto) {
		if (dto!=null) {
			mobiledto[index]=dto;
			index++;
			return true;
			
		}
		return false;
	}
	public MobileDTO deleteByMobileID(long mobileid) {
		for (int index = 0; index < mobiledto.length; index++) {
			if(mobiledto[index]!=null) {
				if (mobiledto[index].getMobileID() == mobileid) {
					MobileDTO obj = mobiledto[index];
					mobiledto[index]=null;
					return obj;
				}
			}
		}
		DeleteByMobileIDException deleteexception = new DeleteByMobileIDException();
		throw deleteexception;
	}
	public MobileDTO UpdateBySerialNumber(long oldserialnumber,long newserialnumber) {
		for (int index = 0; index < mobiledto.length; index++) {
			if(oldserialnumber==mobiledto[index].getSerialNumber()) {
				mobiledto[index].setSerialNumber(newserialnumber);
				return updated;
			}
		}
		UpdateBySerialNumber updatebyserialnumber = new UpdateBySerialNumber();
		throw updatebyserialnumber;
	}
	

}
