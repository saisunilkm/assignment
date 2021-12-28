package com.thoughtfocus.array.exception.CRUDCollection;

import java.util.ArrayList;
import java.util.List;

public class AHolderDAO {
	private List<AccountHolderDTO>dtos = new ArrayList <AccountHolderDTO>();
	
	public String save (AccountHolderDTO dto) {
		boolean issaved = dtos.add(dto);
		if (issaved) {
			return "Data Saved";
		}else {
			return "Data not saved";
		}
	}
	public AccountHolderDTO getByName(String name) {
		for (int index = 0; index < dtos.size(); index++) {
			if (dtos.get(index).getName().equals(name)) {
				return dtos.get(index);
			}
		}
		return null;
	}
	
	public AccountHolderDTO deleteByName(String name) {
		for (int index = 0; index < dtos.size(); index++) {
			if (dtos.get(index).getName().equals(name)) {
				dtos.remove(index);

			}
		}
		return null;
	}
	
	public AccountHolderDTO updateByName(String oldname,String newname) {
		for (int index = 0; index < dtos.size(); index++) {
			if (dtos.get(index).getName().equals(oldname)) {
				dtos.get(index).setName(newname);
				
			}
		}
		return null;
	}
	
	
	public AccountHolderDTO updatePinCodeByArea(String area, int pincode) {
		for (int index = 0; index < dtos.size(); index++) {
			if (dtos.get(index).getName().equals(area)) {
				dtos.get(index).getAddress().setPincode(pincode);
				
			}
		}
		return null;
	}
	
	public float balance(long accountNo) {
		for (int index = 0; index < dtos.size(); index++) {
			if(dtos.get(index).getBalance()==accountNo) {
				dtos.get(index).getBalance();
			}
			
		}
		return 0.0f;
   }
	
	public float deposit(float amount,long accountNo) {
		for (int index = 0; index < dtos.size(); index++) {
			if(dtos.get(index).getAccountNumber()==accountNo) {
				float oldbalance = dtos.get(index).getBalance();
				float newbalance = oldbalance+amount;
				dtos.get(index).setBalance(newbalance);
				return newbalance;
			}
			
		}
		return 0.0f;
	}
	
	public float withdraw(float amount,long accountNo) {
		for (int index = 0; index < dtos.size(); index++) {
			if(dtos.get(index).getAccountNumber()==accountNo) {
				float overallbalance = dtos.get(index).getBalance();
				float remainingbalance = overallbalance - amount;
				dtos.get(index).setBalance(remainingbalance);
				return remainingbalance;
			}
		}
	}
	
	public void printAll() {
		for (int index = 0; index < dtos.size(); index++) {
			if (dtos.get(index).getAccountNumber()!=0) {
				System.out.println(dtos.get(index));
			}
			
		}
	}
	
	
		
}


