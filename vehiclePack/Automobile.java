package vehiclePack;

import javax.swing.ImageIcon;

public class Automobile extends Vehicle {

	private boolean trunk;
	private boolean aC;
	private boolean tint;
	private String owner;
	private String title;
	private boolean carRunning;
	private Model autoModel;
	private Maker autoMaker;
	
	static Model Corolla = new Model();
	static String[] packageOP = Corolla.getTrimPackage();

	
	Automobile(){
		super();
		autoModel = new Model();
		autoMaker = new Maker();
		//updateVehicle();
		trunk = true;
		aC = true;
		tint = false;
		owner = "Keith";
		title = "Keith's Car";
		carRunning = false;
		getMakeandModel();
	}
	


	Automobile(int mpg, int pass, int fc, Model model, Maker maker){
		super(mpg, pass, fc);
		autoModel = model;
		autoMaker = maker;
		updateVehicle();
		trunk = true;
		aC = true;
		tint = false;
		owner = "Keith";
		title = "Keith's second car";
		carRunning = false;
	}

	
	Automobile(Model mo, Maker ma, String name2, String colour, int ps, int mg, 
			int fc, int ds, double tons, int yr, int ts, int top){
		
		super(name2, colour, ps, mg, fc, ds, tons, yr, ts, top);
		autoModel = mo;
		autoMaker = ma;
		//updateVehicle();
		trunk = true;
		aC = true;
		tint = false;
		owner = "Keith";
		title = "Keith's third car";
		carRunning = false;
	}
	
	private void updateVehicle() {
		String error = "Error retrieving trim package";
		
		try {
		mpg = Integer.parseInt(packageOP[3]);
		}catch(Exception e) {
			System.out.println(error);
		}
		try {
		passengers = Integer.parseInt(packageOP[7]);
		}catch(Exception l) {
			System.out.println(error);
		}
		try {
		fuelcap = Integer.parseInt(packageOP[9]);
		}catch(Exception m) {
			System.out.println(error);
		}
		try {
		tonage = Double.parseDouble(packageOP[11]);
		}catch(Exception n) {
			System.out.println(error);
		}
		try {
		color = (packageOP[5]);
		}catch(Exception o) {
			System.out.println(error);
		}
	}
	
	@Override
	public String toString() {
		return "Automobile [trunk=" + trunk + ", aC=" + aC + ", tint=" + tint + ", owner=" + owner + ", title=" + title
				+ ", carRunning=" + carRunning + ", \n autoModel=" + autoModel + ",\n autoMaker=" + autoMaker + ", \n name="
				+ name + ", passengers=" + passengers + ", mpg=" + mpg + ", fuelcap=" + fuelcap + ", doors=" + doors
				+ ", color=" + color + ", \n tonage=" + tonage + ", year=" + year + ", topSpeed=" + topSpeed
				+ ", tiresize=" + tiresize + "]";
	}
	
	public boolean isCarRunning() {
		return carRunning;
	}

	public void setCarRunning(boolean carRunning) {
		this.carRunning = carRunning;
	}

	public boolean isTrunk() {
		return trunk;
	}

	public void setTrunk(boolean trunk) {
		this.trunk = trunk;
	}

	public boolean isAC() {
		return aC;
	}

	public void setAC(boolean aC) {
		this.aC = aC;
	}

	public boolean isTint() {
		return tint;
	}

	public void setTint(boolean tint) {
		this.tint = tint;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	void getMakeandModel() {
		autoMaker.getMake();
		autoModel.getModel();
	}

	public int getNumWheels() {
		String[] trimpack = autoModel.getTrimPackage();
		return Integer.parseInt(trimpack[1]);
	}

	public int getNumDoors() {
		return super.doors;
	}
	
}