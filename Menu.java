import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Menu {
	
	JFrame frame = new JFrame();
	Container con;
	JPanel textPanel, inputPanel;
	JLabel textLabel, mainTitle1;
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);
	JTextField jtf;
	JButton levelsB, instructionsB;
	JButton game = new JButton("Begin Game");
	
	Color green = new Color(43, 220, 20);

//	public static void main(String[] args)    {
//		new Menu();
//		
//	}
	
	public Menu() {

		frame.setSize(900,800);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setTitle("Whac-A-Mole"); 
		frame.setResizable(false);
		
		ImageIcon Backg = new ImageIcon("logo.jpg");
		frame.setIconImage(Backg.getImage());
		
		frame.getContentPane().setBackground(Color.black);
		con = frame.getContentPane();
		
		frame.setTitle("Whac-A-Mole"); 
		
		mainTitle1 = new JLabel();
		mainTitle1.setText("Game");
		mainTitle1.setFont(new Font("Times New Roman", Font.BOLD, 80));
		mainTitle1.setBounds(145,-190,650,650);
		mainTitle1.setForeground(green);
		
		inputPanel = new JPanel();
		inputPanel.setBounds(190, 550, 500, 50);
		inputPanel.setBackground(Color.black);
		inputPanel.setLayout(new GridLayout(1,2));
		
		
		levelsB = new JButton("Levels");
		levelsB.setBounds(50, 320, 300, 75);
		levelsB.setFocusable(false);
		levelsB.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		levelsB.setBackground(green);
		levelsB.setForeground(Color.white);
		
		instructionsB = new JButton("Instructions");
		instructionsB.setBounds(540, 320, 300, 75);
		instructionsB.setFocusable(false);
		instructionsB.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		instructionsB.setBackground(green);
		instructionsB.setForeground(Color.white);
		
		frame.add(levelsB);
		frame.add(instructionsB);
		frame.add(mainTitle1);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == game) {
			
			Game newGame = new Game();
			frame.dispose();
		}
		
	}


}

