package main;

public class SomeClass {
	String x;
	int y;	
	
	@Info ( name="Rod", date="17/03/2016", version=2.0, people={"Ana", "Kath"} )
	public String b_method(){
		return "one return";
	}
	
	@Info ( name="XPTO", date="03/11/2015", version=3.0, people={"A awesome", "name here"} )
	public String c_method(){
		return "other return";
	}
}
