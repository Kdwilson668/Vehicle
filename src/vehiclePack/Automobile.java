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
	public int getNumDoors() {
		return 0;
	}
	
	Automobile(){
		super();
		owner = "Keith";
		title = "Keith's Car";
		trunk = true;
		airConditioning = true;
		tint = true;
	}
	Automobile(String own, String tit, boolean tr, boolean ac, boolean tnt){
		super();
		owner = own;
		title = tit;
		trunk = tr;
		airConditioning = ac;
		tint = tnt;
	}
	
	public Make getAutomake() {
		return Automake;
	}
	public void setAutomake(Make automake) {
		Automake = automake;
	}
	public Model getAutomodel() {
		return Automodel;
	}
	public void setAutomodel(Model automodel) {
		Automodel = automodel;
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
	public boolean isTrunk() {
		return trunk;
	}
	public void setTrunk(boolean trunk) {
		this.trunk = trunk;
	}
	public boolean isAirConditioning() {
		return airConditioning;
	}
	public void setAirConditioning(boolean airConditioning) {
		this.airConditioning = airConditioning;
	}
	public boolean isTint() {
		return tint;
	}
	public void setTint(boolean tint) {
		this.tint = tint;
	}
	public void getMakeModel() {
	
	}
	
}

