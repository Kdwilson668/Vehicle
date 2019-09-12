package vehiclePack;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTabbedPane;
class VehicleDemo extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Vehicle userVehicle = new Vehicle();
	/*String vehicleName = vN;
		String color = c;
		passengers = p;
		fuelCap = fc;
		mpg =  m;
		doors = d;
		tireSize = ts;
		tonage =  t;
		modelYear = my;
		dist = dis;
		*/
	public VehicleDemo() {
		getContentPane().setLayout(null);
		
		String[] carColor = {"Blue", "Red", "White", "Black", "Green"};
		JComboBox comboBox = new JComboBox(carColor);
		comboBox.setEditable(false);
		comboBox.setBounds(94, 120, 62, 21);
		getContentPane().add(comboBox);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(24, 122, 73, 17);
		getContentPane().add(lblColor);
		
		JLabel lblMake = new JLabel("Make");
		lblMake.setBounds(25, 31, 46, 13);
		getContentPane().add(lblMake);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setBounds(25, 65, 46, 13);
		getContentPane().add(lblModel);
		
		JLabel lblPassengers = new JLabel("Passengers");
		lblPassengers.setBounds(24, 155, 46, 13);
		getContentPane().add(lblPassengers);
		
		JLabel lblStyle = new JLabel("Style");
		lblStyle.setBounds(25, 93, 46, 13);
		getContentPane().add(lblStyle);
		
		JLabel lblTireSize = new JLabel("Tire Size");
		lblTireSize.setBounds(24, 185, 46, 13);
		getContentPane().add(lblTireSize);
		
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(94, 27, 62, 21);
		getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(94, 58, 62, 21);
		getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(94, 89, 62, 21);
		getContentPane().add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(94, 151, 62, 21);
		getContentPane().add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(94, 181, 62, 21);
		getContentPane().add(comboBox_5);
		
		JTextArea txtrToyota = new JTextArea();
		txtrToyota.setLineWrap(true);
		txtrToyota.setWrapStyleWord(true);
		txtrToyota.setText("The company was founded by Kiichiro Toyoda in 1937, as a spinoff from his father's company Toyota Industries to create automobiles. Toyota Motor Corporation is a Japanese multinational automotive manufacturer headquartered in Toyota, Aichi, Japan. In 2017, Toyota's corporate structure consisted of 364,445 employees worldwide[4] and, as of September 2018, was the sixth-largest company in the world by revenue. As of 2017, Toyota is the largest automotive manufacturer. Toyota was the world's first automobile manufacturer to produce more than 10 million vehicles per year which it has done since 2012, when it also reported the production of its 200-millionth vehicle.");
		txtrToyota.setBounds(352, 56, 393, 269);
		getContentPane().add(txtrToyota);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(137, 295, 142, 132);
		getContentPane().add(tabbedPane);
	}
	public static void main (String[] args)
	{
	}
}