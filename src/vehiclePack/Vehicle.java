package vehiclePack;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.util.Date;

abstract class Vehicle
{
//Here we declare the variable for our Vehicle class	
	String vehicleName;
	String color;
	String hornSound;
	String key;
	int passengers;
	int fuelCap;
	int mpg;
	int doors;
	int tireSize;
	int tonage;
	int modelYear;
	int totalMiles;
	int dist;
	int topSpeed;
	int speed;
	int fuelLevel;
	double gallons;		
	//t1 = Camry();
	

	
	Vehicle()
	{	
		vehicleName = "Sedan";
		color = "Blue";
		passengers = 4;
		fuelCap = 16;
		mpg = 22;
		doors = 4;
		tireSize = 16;
		tonage = 5000;
		modelYear = 2010;
		dist = 500;
	}
	Vehicle(String vN, String c,int p, int fc, int m, int d, int ts, int t, int my, int dis)
	{
		vehicleName = vN;
		color = c;
		passengers = p;
		fuelCap = fc;
		mpg =  m;
		doors = d;
		tireSize = ts;
		tonage =  t;
		modelYear = my;
		dist = dis;
	}
	//Vehicle Camry = new Vehicle("Camry", null, 4, 19, 26, 16, 1500, );
	
	public Vehicle(int p, int f, int m) {
		// TODO Auto-generated constructor stub
	}
	public Vehicle(int p, int f, int m, int d, int t, int w, int y, int tm, String c) {
		// TODO Auto-generated constructor stub
	}
	public void setVehicle(String honk, String isKey, int tSp, int zoom, int fL)
	{
		hornSound = honk;
		key = isKey;
		topSpeed = tSp;
		speed = zoom;
		fuelLevel = fL;
	}
	
	int range() //int fuelCap int mpg
	{
		return mpg * fuelCap; 
	}
	int range(int m, int fC) //int fuelCap int mpg
	{
		return m * fC; 
	}
	
	
	double fuelNeeded(int dist) //int dist int mpg
	{
		return (double) dist / mpg;
	}
	double fuelNeeded(int d, int m) //int dist int mpg
	{
		return (double) d / m;
	}
	
	
	int refill(int dist) // int dist int range
	{
		int refuel = dist/mpg;
		return refuel/ fuelCap + 1;
	}
	int refill(int d, int m, int fC) // int dist int range
	{
		int refuel = d/m;
		return refuel/ fC + 1;
	}
	
	
	public String honkHorn()
	{
		String honking = "BEEP! BEEP!";
		return honking;
	}
	public String accelerate()
	{
		String motion = "Accelerating...";
		return motion;
	}
	
	
	public String brake()
	{
		String braking = "Brake check! Slowing down...";
		return braking;
	}
	
	
	public boolean start(String usedKey)
	{
		if (usedKey == key)
		{
			System.out.println("Starting engine...");
			return true;
		}
		else 
		{
			System.out.println("That's not the right key!");
			return false;
		}
	}
	public abstract void getMakeModel();
	


}
class Make{

	private String company;
	private String location;
	private String companyWebsite;
	private String contactNum;
	private Date mintDate;
	private ImageIcon companyLogo;
	protected ImageIcon getLogo() {
		return null;
	}
	
Make(String cmp, String loc, String cmpW, String cntN, Date mntD, ImageIcon cmpL) {
		cmp = company;
		loc = location;
		cmpW = companyWebsite;
		cntN = contactNum;
		mntD = mintDate;
		cmpL = companyLogo;
	}
	
	Make Toyota = new Make("Toyota", "6565 Headquarters Dr, Plano, TX 75024", "www.toyota.com", "1 (800) 331-4331", new Date(8-28-1937), new ImageIcon("Toyota.png"));
	Make Ford = new Make("Ford", "1 American Road Dearborn, Michigan 48126-2798", "www.ford.com", "1 (313) 322-3000", new Date(), new ImageIcon("Ford.jpg"));
	Make GM = new Make("General Motors", "300 Renaissance Center, Detroit, MI, 48265", "www.gm.com", "", new Date(), new ImageIcon("GM.jpg"));
	
}