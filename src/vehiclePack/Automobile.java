package vehiclePack;

public class Automobile extends Vehicle{
	Make Automake;
	Model Automodel;
	String owner;
	String title;
	boolean trunk;
	boolean airConditioning;
	boolean tint;
	
	public int getNumWheels() {
		return 0;
	}
	public int getNumDoors1() {
		return 0;
	}
	
	Automobile(){
		super();
		trunk = true;
		airConditioning = true;
		tint = false;
		owner = "Charles";
		title = "My Title";
		Automake = new Make(owner, owner, owner, owner, null, null);
		Automodel =	new Model();	
	}
	
	Automobile(int p, int f, int m, Make a, Model b){
		super(p, f, m); // This is making a call to the constructor with 3 vars. in the Vehicle class
		
		Automake = a;
		Automodel = b;
		trunk = true;
		airConditioning = true;
		tint = false;
		owner = "Charles";
		title = "My Title";
	}
	Automobile(int p, int f, int m, int d, int t, int w, int y, int tm, String c, boolean tr, boolean ac, boolean tn, String cs, String tt, Make a, Model b){
		super(p, f, m, d, t,  w,  y, tm, c);
		
		trunk = true;
		ac = true;
		tint = false;
		owner = cs;
		title = tt;
		Automake = a;
		Automodel = b;
		}
	
	public Make getAutoMaker() {
		return Automake;
	}
	public void setAutoMaker(Make autoMaker) {
		this.Automake = autoMaker;
	}
	public Model getAutoModel() {
		return Automodel;
	}
	public void setAutoModel(Model autoModel) {
		this.Automodel = autoModel;
	}
	public boolean isTrunk() {
		return trunk;
	}
	public void setTrunk(boolean trunk) {
		this.trunk = trunk;
	}

	public boolean isAc() {
		return airConditioning;
	}
	public void setAc(boolean ac) {
		this.airConditioning = ac;
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
	
	public int getNumWheels1() {
		String[] TrimPack = Automodel.getTrimPackage();
		int wheelCount = 0;
		try {
			wheelCount = Integer.parseInt(TrimPack[1]);
		}
			catch(Exception e) {
				System.out.println("BAD TRIM PACKAGE");
			}
		return wheelCount;
	}
	
	public int getNumDoors() {
		return super.doors; //this is pulling the door count from the Vehicle class. 
	}
	
	void getMakeAndModel() {
		
	}
	@Override
	public void getMakeModel() {
		// TODO Auto-generated method stub
		
	}

	
}

