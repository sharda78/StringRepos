package com.stringHandlings;

import java.util.Objects;

public class Laptop {

	private String modelname;
	private double modelprice;
	
	
	public Laptop()
	{
		super();
	}
	
	
	public Laptop(String modelname, double modelprice) {
		super();
		this.modelname = modelname;
		this.modelprice = modelprice;
	}
	





	public String getModelname() {
		return modelname;
	}


	public void setModelname(String modelname) {
		this.modelname = modelname;
	}


	public double getModelprice() {
		return modelprice;
	}


	public void setModelprice(double modelprice) {
		this.modelprice = modelprice;
	}


	@Override
	public String toString() {
		return "Laptop [modelname=" + modelname + ", modelprice=" + modelprice + "]";
	}

	

	


	@Override
	public boolean equals(Object obj) {
		
		Laptop other = (Laptop) obj;
		return Objects.equals(modelname, other.modelname)
				&& Double.doubleToLongBits(modelprice) == Double.doubleToLongBits(other.modelprice);
	}
	/*@Override
	public boolean equals(Object obj) {
		
		Laptop l1 = (Laptop) obj;
		returns this.modelname.equals(l1.modelname) && this.modelPrice==l1.modelprice;
	
	 */

	public static void main(String[] args) {
	
		Laptop l1 = new Laptop("Dell",50000);
		Laptop l2 = new Laptop("Lenovo",45000);
		Laptop l3 = new Laptop("Dell",50000);
		
		System.out.println(l1 == l2);
		System.out.println(l1 == l3);
		System.out.println(l1.equals(l3));// true....In String class equals method is overriden
		
		
				
	}

}
