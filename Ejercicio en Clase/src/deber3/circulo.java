package deber3;

public class circulo {

	private double radio;
	
	public circulo(){
		
	}
	
	public void setRadio(double radioParam){
		this.radio=radioParam;
	}
	
	public circulo(double radioParam){
		this.radio=radioParam;
		
	}
	
	public double getRadio(){
		return this.radio;
	}
	
	public double getArea(){

		return Math.PI*radio*radio;
	}
}
