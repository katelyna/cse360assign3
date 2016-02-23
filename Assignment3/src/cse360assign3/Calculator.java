
package cse360assign3;

public class Calculator {

	private int total;
	String output = "0";
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total = total + value;
		output = output + " + ";
		output = output + value;
	}
	
	public void subtract (int value) {
		total = total - value;
		output = output + " - ";
		output = output + value;
	}
	
	public void multiply (int value) {
		total = total * value;
		output = output + " * ";
		output = output + value;
	}
	
	public void divide (int value) {
		if (value == 0){
			total = 0;
			output = output + " / ";
			output = output + value;
		}
		else{
			total = total/value;
			output = output + " / ";
			output = output + value;
		}	
	}
	
	public String getHistory () {
		return output;
	}
}
