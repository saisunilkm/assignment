package com.thoughtfocus.array.exception.encapsulationarray;

public class TraineeDetailsDAO {
	private TraineeDetails[]details = new TraineeDetails[11];
	private int index =0;
	
	public void PrintAll() {
		for (int index = 0; index < details.length; index++) {
			if (details[index]!=null) {
				System.out.println(details[index]);
			}
		}
	}
	public void save (TraineeDetails details) {
		if (details!=null) {
			this.details[index]=details;
			index++;
		}
	}
	public String updateName(String OldName,String NewName) {
		for (int index = 0; index < details.length; index++) {
			if (details[index]!=null) {
				if (details[index].getName().equals(OldName)) {
					details[index].setName(NewName);
					return "details are updated by name";
				}
			}
		}
		return "details not updated";
	}
	public String updateByTraineeId(String OldTraineeId,String NewTraineeId) {
		for (int index = 0; index < details.length; index++) {
			if (details[index]!=null) {
				if (OldTraineeId==details[index].getTraineeId()) {
					details[index].setTraineeId(NewTraineeId);
					return "details are updated by Id";
				}
			}
		}
		return "details not updated";
	}
	public String deleteByName(String name) {
		for (int index = 0; index < details.length; index++) {
			if (name.equals(details[index].getName())) {
				details[index]=null;
				return "Trainee details deleted by name"+name;
			}
		}
		return "details not deleted";
	}
	public String deleteByTraineeId(int TraineeId) {
		for (int index = 0; index < details.length; index++) {
			if (details[index]!=null) {
				if (TraineeId == details[index].getTraineeId()) {
					details[index]=null;
					return "Trainee details deleted by id"+TraineeId;
				}
			}
		}
		return "details not deleted";
	}
	public String deleteByContactNumber(long ContactNumber) {
		for (int index = 0; index < details.length; index++) {
			if (details[index]!=null) {
				if (ContactNumber == details[index].getContactNumber()) {
					details[index]=null;
					return "Trainee details deleted by id"+ContactNumber;
				}
			}
		}
		return "details not deleted";
	}
	

}
