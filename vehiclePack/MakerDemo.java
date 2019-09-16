package vehiclePack;

public class MakerDemo {

	public static void main(String[] args) {
		
		
		//String[] Key = {"wheels","4", "MPG", "35", "color", "Blue", "seats", "5", "fuelcap", "14", "tonage", "1.5"};
		/*(Model mo, Maker ma, String name2, String colour, int ps, int mg, 
				int fc, int ds, double tons, int yr, int ts, int top)*/

		
		Model model1 = new Model();
		Maker maker1 = new Maker();
		Automobile car = new Automobile();
		Automobile SuperCar = new Automobile(model1, maker1, "Keith's Cool Car", "Cool car color", 18, 500, 
				3000, 1000, 12.0, 2155, 25, 1500);
		/*
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
		*/
		/*
		System.out.println(car.name);
		System.out.println(car.color);
		System.out.println(car.passengers);
		System.out.println(car.mpg);
		System.out.println(car.fuelcap);
		System.out.println(car.doors);
		System.out.println(car.tonage);
		System.out.println(car.year);
		System.out.println(car.tiresize);
		System.out.println(car.topSpeed);
		*/
		System.out.println(SuperCar);
		
		
	}

}