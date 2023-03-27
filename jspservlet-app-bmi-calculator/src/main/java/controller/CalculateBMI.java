package controller;

public class CalculateBMI {

	//Enter the code here....
	public static double calculate(double height,double weight){
		double bmi=weight/Math.pow(height,2);
		return bmi;
	}
	public static String description(double bmi){
		if(bmi<18.5){
			return "Under Weight";
		}
		else if(bmi>=18.5 && bmi<24.9){
			return "Over Weight";
		}
		else if(bmi>=30 && bmi<34.9){
			return "Obese";
		}
		else{
			return "Extremely Obese";
		}
	}
}
