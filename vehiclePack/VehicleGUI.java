package vehiclePack;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VehicleGUI extends JFrame {

	private JPanel pnl;
	public VehicleGUI(ImageIcon pic) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 898, 694);
		pnl= new JPanel();
		JLabel lblNewLabel = new JLabel("");
		add(pnl);
		lblNewLabel.setBounds(236, 103, 366, 318);
		lblNewLabel.setIcon(pic);
		pnl.add(lblNewLabel);
		setVisible(true);
		//JLabel lblNewLabel1 = new JLabel("");
		//lblNewLabel1.setBounds(236, 103, 366, 318);
		//lblNewLabel1.setIcon("corollaBlue.jpg");
		//pnl.add(lblNewLabel1);
	}
}
