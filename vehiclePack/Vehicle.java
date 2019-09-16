package vehiclePack;

public abstract class Vehicle {
	
	protected String name;
	protected int passengers;
	protected int mpg; 
	protected int fuelcap;
	protected int doors;
	protected String color;
	protected double tonage; 
	protected int year;
	protected int topSpeed;
	protected int tiresize; 

	
	public Vehicle() {
		
		name = "Corolla";
		passengers = 5;
		mpg = 35;
		fuelcap = 14;
		doors = 4;
		color = "Blue";
		tonage = 2;
		year = 2017;
		topSpeed = 110;
		tiresize = 17;
	}
	
	public Vehicle(int mpg, int pass, int fc) {
		
		name = "Tacoma";
		passengers = pass;
		this.mpg = mpg;
		fuelcap = fc;
		doors = 4;
		color = "White";
		tonage = 3;
		year = 2009;
		tiresize = 18;
		topSpeed = 90;
	}
	
	public Vehicle(String name2, String colour, int ps, int mg, int fc, int ds, double tons, int yr, int ts, int top) {
		
		name = name2;
		color = colour;
		passengers = ps;
		mpg = mg;
		fuelcap = fc;
		doors = ds;
		tonage = tons;
		year = yr;
		tiresize = ts;
		topSpeed = top;
	}
	
	int range () {
		return fuelcap * mpg;
	}
	
	int range(int mpg, int fc) {
		return mpg + fc;
	}
	
	double fuelNeeded(int miles) {
		return miles/mpg;
	}
	
	double fuelNeeded(int miles, int mpg) {
		return miles/mpg;
	}
	
	int refillNeeded(int miles) {
		return miles/range()+1;
	}
	int refillNeeded(int miles, int mpg, int fc) {
		return miles/mpg*fc+1;
	}
	
	abstract void getMakeandModel();

}
