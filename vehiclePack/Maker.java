package vehiclePack;

import java.util.Date;
import javax.swing.ImageIcon;
import java.text.SimpleDateFormat;

public class Maker {
	
	ImageIcon carimg = new ImageIcon("Toyota.png");
	
	String company;
	String plantLocal;
	String webSite;
	long phone;
	@Override
	public String toString() {
		return "Maker [carimg=" + carimg + ", company=" + company + ", plantLocal=" + plantLocal + ", webSite="
				+ webSite + ", phone=" + phone + ", mintDate=" + mintDate + ", logo=" + logo + "]";
	}

	Date mintDate;
	ImageIcon logo;
	
	Maker(){
		company = "Toyota";
		plantLocal = "Japan";
		webSite = "http://www.toyota.com";
		phone = 8675309;
		logo = carimg;
		try { mintDate = new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-01");
				}catch(Exception z) {;}
	}
	
	Maker(String co, String pl, String ws, long pn, Date md, ImageIcon lgo){
		company = co;
		plantLocal = pl;
		webSite = ws;
		phone = pn;
		mintDate = md;
		logo = lgo;
	}
	
	ImageIcon getLogo() {
		return logo;
	}

	public void getMake() {
		new VehicleGUI(logo);
	}
	

}
