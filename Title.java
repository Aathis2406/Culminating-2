import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class Title implements ActionListener {
	
	public static final String Title = null;
	JFrame frame = new JFrame();
	JButton next = new JButton("Start");
	JLabel title = new JLabel();
	JLabel light_title = new JLabel();
	Color green = new Color(0,0,255);
	
	public Title () throws MalformedURLException{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setTitle("Whac-A-Mole"); 
		frame.setResizable(false);
		
		ImageIcon logo = new ImageIcon("images.jpg");
		frame.setIconImage(logo.getImage());
		
		Icon gif = new ImageIcon("");
	
        ImageIcon backgroundImage = new ImageIcon("C:\\Users\\aathi\\Downloads\\images.jpg");
        JLabel background = new JLabel(backgroundImage);
        frame.add(background);;
	  


	    frame.pack();
	    
	    //gifLabel.setBounds(200,200,400,400);
	    
		frame.setSize(900,2000);

		
		next.setBounds(400, 600, 200, 75);
		next.setFocusable(false);
		next.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		next.addActionListener(this);
		next.setBackground(green);
	
		title.setText("Whac-A-Mole");
		title.setFont(new Font("Times New Roman", Font.BOLD, 80));
		title.setBounds(105,-190,650,650);
		title.setForeground(green);
	
		frame.add(next);
		frame.add(title);
		frame.add(light_title);
			
	}
	
	@SuppressWarnings("unused")
	@Override
	public void actionPerformed(ActionEvent e) {	
		if(e.getSource() == next) {
			Menu menuPage = new Menu();
			frame.dispose();
		}
		
	}

	public void runTitlePage() {
		// TODO Auto-generated method stub
		
	}
	
}
