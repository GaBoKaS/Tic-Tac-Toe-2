import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Display {

	private JFrame frame;
	private JButton Button1;
	private JButton Button2;
	private JButton Button3;
	private JButton Button4;
	private JButton Button5;
	private JButton Button6;
	private JButton Button7;
	private JButton Button8;
	private JButton Button9;
	private int[] Place=new int[9];
	private int Turn=0;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Display window = new Display();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	public Display() {
		initialize();
	}

		int Test(){
	    for(int i=1; i<=2;i++)
	    {
	        if(Place[0]==i && Place[1]==i && Place[2]==i ||
	           Place[3]==i && Place[4]==i && Place[5]==i ||
	           Place[6]==i && Place[7]==i && Place[8]==i ||
	           Place[0]==i && Place[3]==i && Place[6]==i ||
	           Place[1]==i && Place[4]==i && Place[7]==i ||
	           Place[2]==i && Place[5]==i && Place[8]==i ||
	           Place[0]==i && Place[4]==i && Place[8]==i ||
	           Place[2]==i && Place[4]==i && Place[6]==i )
	           return i;
	    }
	    return 0;
	}
		void Reset(){
			System.out.println("BUBU");
			Turn=0;
			for(int i=0;i<9;i++)
				Place[i]=0;
		}
	void Win(int winner){
		JFrame Won= new JFrame();
		Won.setVisible(true);
		Won.setBounds(420, 100, 500, 360);
		Won.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JLabel Title=new JLabel(((winner==1)? "O":"X")+" Player Won");
		Title.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 66));
		Title.setEnabled(true);
		Won.getContentPane().add(Title);
	}
	private void ImgReset(JButton Button){
		Icon img=new ImageIcon("icons\\icon.jpg");
		Button.setIcon(img);
		
	}
	private void Turn(JButton Button, int i){
		if(Place[i]==0){
			if(Turn%2!=0){
				Place[i]=1;
				Button.setIcon(new ImageIcon("icons\\Oicon.jpg"));
			}
			else{
				Place[i]=2;
				Button.setIcon(new ImageIcon("icons\\Xicon.jpg"));
			}
			//Button.setEnabled(false);
				System.out.println(Turn);
			Turn++;
			if(Test()==1){Win(Test());}
			else if(Test()==2) Win(Test());
		}
		if(Test()==1 || Test()==2 || Turn==9){
			Reset();
			ImgReset(Button1);
			ImgReset(Button2);
			ImgReset(Button3);
			ImgReset(Button4);
			ImgReset(Button5);
			ImgReset(Button6);
			ImgReset(Button7);
			ImgReset(Button8);
			ImgReset(Button9);
		}
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 335, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton Button1 = new JButton("");
		Button1.setEnabled(true);
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Turn(Button1,0);
			}
		});
		Button1.setIcon(new ImageIcon("icons\\icon.jpg"));
		Button1.setBounds(0, 0, 100, 100);
		frame.getContentPane().add(Button1);

		Button2 = new JButton("");
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Turn(Button2,1);
			}
		});
		Button2.setIcon(new ImageIcon("icons\\icon.jpg"));
		Button2.setBounds(110, 0, 100, 100);
		frame.getContentPane().add(Button2);


		Button3 = new JButton("");
		Button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Turn(Button3,2);
			}
		});
		Button3.setIcon(new ImageIcon("icons\\icon.jpg"));
		Button3.setBounds(220, 0, 100, 100);
		frame.getContentPane().add(Button3);

		Button4 = new JButton("");
		Button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Turn(Button4,3);
			}
		});
		Button4.setIcon(new ImageIcon("icons\\icon.jpg"));
		Button4.setBounds(0, 111, 100, 100);
		frame.getContentPane().add(Button4);

		Button5 = new JButton("");
		Button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Turn(Button5,4);
			}
		});
		Button5.setIcon(new ImageIcon("icons\\icon.jpg"));
		Button5.setBounds(110, 111, 100, 100);
		frame.getContentPane().add(Button5);

		Button6 = new JButton("");
		Button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Turn(Button6,5);
			}
		});
		Button6.setIcon(new ImageIcon("icons\\icon.jpg"));
		Button6.setBounds(220, 111, 100, 100);
		frame.getContentPane().add(Button6);

		Button7 = new JButton("");
		Button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Turn(Button7,6);
			}
		});
		Button7.setIcon(new ImageIcon("icons\\icon.jpg"));
		Button7.setBounds(0, 222, 100, 100);
		frame.getContentPane().add(Button7);

		Button8 = new JButton("");
		Button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Turn(Button8,7);
			}
		});
		Button8.setIcon(new ImageIcon("icons\\icon.jpg"));
		Button8.setBounds(110, 222, 100, 100);
		frame.getContentPane().add(Button8);

		Button9 = new JButton("");
		Button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Turn(Button9,8);
			}
		});
		Button9.setIcon(new ImageIcon("icons\\icon.jpg"));
		Button9.setBackground(new Color(244, 164, 96));
		Button9.setBounds(220, 222, 100, 100);
		frame.getContentPane().add(Button9);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("icons\\Background.jpg"));
		label.setBackground(new Color(255, 0, 255));
		label.setBounds(0, 0, 320, 322);
		frame.getContentPane().add(label);
	}
}
