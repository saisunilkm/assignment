package com.thoughtfocus.array.array2;

public class ProgrammingTester {
	public static void main (String[]args) {
		ProgrammingLanguages languages = new ProgrammingLanguages();
		
		languages.save("JAVA");
		languages.save("PYTHON");
		languages.save("JAVA SCRIPT");
		languages.save("PHP");
		languages.save("RUBY");
		languages.save("SWIFT");
		languages.save("PERL");
		languages.save("SCALA");
		languages.save("SQL");
		languages.save("KOTLIN");
		languages.save("RUST");
		languages.save("OBJECTIVE-C");
		languages.save("LISP");
		languages.save("DART");
		languages.save("ADA");
		languages.save("VISUAL BASIC");
		
		languages.printAll();
		
		System.out.println("---------------");
		String remove = languages.delete("RUST");
		languages.printAll();
		
	}

}
