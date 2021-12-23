package com.thoughtfocus.array.array2;

public class ProgrammingLanguages {
	private String [] languages = new String[15];
	private int index = 0;
	
	public void printAll() {
		for (int index = 0;index < languages.length;index++) {
			System.out.println (languages[index]);
		}
	}
	
	public boolean save(String language) {
		if (index <15) {
			languages[index]=language;
			index++;
			return true;
		}else {
			System.out.println ("not added");
			return false;
		}
	}   
	public String delete (String month) {
		for (int index =0;index<month.length();index++) {
			if (languages[index].equals(month)) {
				languages[index]= null;
				return "language deleted";
			}
		}
		return "month not deleted";
	}

}
