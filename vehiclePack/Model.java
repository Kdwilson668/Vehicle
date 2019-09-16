package vehiclePack;

import java.util.Arrays;

import javax.swing.ImageIcon;

public class Model {
	
	private String bodyType;
	private String modelName;
	private String[] trimPackage;
	ImageIcon carimg = new ImageIcon("GM.png");

	Model(){
		bodyType = "Sedan";
		modelName = "Corolla";
		trimPackage = new String[] {"wheels","4", "MPG", "35", "color", "Blue", "seats", "5", "fuelcap", "14", "tonage", "2"};
	}
	
	Model(String bt, String mn, String[] tp){
		bodyType = bt;
		modelName = mn;
		trimPackage = tp;
	}
	
	@Override
	public String toString() {
		return "Model [bodyType=" + bodyType + ", modelName=" + modelName + ", trimPackage="
				+ Arrays.toString(trimPackage) + ", carimg=" + carimg + "]";
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

	public String[] getTrimPackage() {
		return trimPackage;
	}

	public void setTrimPackage(String[] trimPackage) {
		this.trimPackage = trimPackage;
	}

	public void getModel() {
		//new VehicleGUI(carimg);
		
	}

}
