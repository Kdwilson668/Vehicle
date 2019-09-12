package vehiclePack;

public class Model {
	private static String bodyType;
	private static String modelName;
	private static String trimPackage[]; 
	
	Model(String Bt, String Mn, String[] trimPackage){
		bodyType = Bt;
		modelName = Mn;
		trimPackage = new String[] {"Wheels", "4", "Mpg", "22", "Color", "Blue", "Seats", "5", "FuelCap", "16", "Tonage", "1500"};
	}
		
	public String getBodyType() {
		return bodyType;
	}
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public static String[] getTrimPackage() {
		return trimPackage;
	}
	public void setTrimPackage(String[] trimPackage) {
		this.trimPackage = trimPackage;
	}
	

}
