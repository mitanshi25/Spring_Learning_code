package com.springcore.ci;

public class Certificate {
	
	private String cTitleString;

	public Certificate(String cTitleString) {
		super();
		this.cTitleString = cTitleString;
	}

	@Override
	public String toString() {
		return "title is "+ this.cTitleString ;
	}
	
	

}
