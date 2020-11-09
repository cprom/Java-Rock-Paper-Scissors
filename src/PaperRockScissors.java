import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PaperRockScissors extends JFrame implements ActionListener {

	JButton paperBtn;
	JButton rockBtn;
	JButton scissorsBtn;
	String playerChoice;
	
	PaperRockScissors(){
		
		ImageIcon paperIcon = new ImageIcon("paper.png");
		ImageIcon rockIcon = new ImageIcon("rock.png");
		ImageIcon scissorsIcon = new ImageIcon("scissors.png");
		
		JPanel title_panel = new JPanel();
		title_panel.setLayout(new BorderLayout());
		
		//Add buttons
		paperBtn = new JButton();
		paperBtn.setBounds(50,130,120,120);
		paperBtn.addActionListener(this);
		paperBtn.setFocusable(false);
		paperBtn.setIcon(paperIcon);
		
		rockBtn = new JButton();
		rockBtn.setBounds(240,130,120,120);
		rockBtn.addActionListener(this);
		rockBtn.setFocusable(false);
		rockBtn.setIcon(rockIcon);
		
		scissorsBtn = new JButton();
		scissorsBtn.setBounds(430,130,120,120);
		scissorsBtn.addActionListener(this);
		scissorsBtn.setFocusable(false);
		scissorsBtn.setIcon(scissorsIcon);
		
		
		//Add title inside frame
		JLabel callToAction = new JLabel();
		callToAction.setText("Choose Your Weapon");
		callToAction.setHorizontalAlignment(JLabel.CENTER);
		callToAction.setVerticalAlignment(JLabel.NORTH);
		callToAction.setForeground(new Color(0xFF0000));
		callToAction.setFont(new Font("Helvetica", Font.BOLD,35));
		callToAction.setBounds(0,30,600,100);
		
		
		
		//JFrame
		JFrame frame =  new JFrame();  //creates a frame
		frame.setTitle("Rock Paper Scissors");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //.HIDE_ON_CLOSE IS default.  Set to .EXIT_ON_CLOSE 
		frame.setResizable(false);//prevent frame from being resize
		frame.setSize(600, 500); //sets x and y dimension
		frame.setLayout(null);
		frame.setVisible(true); //make frame visible
		frame.add(callToAction);
		frame.add(paperBtn);
		frame.add(rockBtn);
		frame.add(scissorsBtn);
		
		
		ImageIcon image = new ImageIcon("fuzzi_logic_logo.png");
		frame.setIconImage(image.getImage());
	
		
//		//get choice from player
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Enter:\n \"P\" for Paper\n \"R\" for Rock\n \"S\" for Scissors");
//		String playerChoice = scanner.nextLine();
//		
//		if(playerChoice.equals("p")|| playerChoice.equals("P")) {
//			playerChoice = "Paper";
//		System.out.println("You chose " + playerChoice);
//	}
//		if(playerChoice.equals("r")|| playerChoice.equals("R")) {
//			playerChoice = "Rock";
//			System.out.println("You chose " + playerChoice);
//		}
//		if(playerChoice.equals("s")|| playerChoice.equals("S")) {
//			playerChoice = "Scissors";
//			System.out.println("You chose " + playerChoice);
//		}
//		
		//get choice from Computer
		
	
	
}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==paperBtn) {
			playerChoice = "Paper";
			System.out.println("Player chose " + playerChoice);
		}
		if(e.getSource()==rockBtn) {
			playerChoice = "Rock";
			System.out.println("Player chose " + playerChoice);
		}
		if(e.getSource()==scissorsBtn) {
			playerChoice = "Scissors";
			System.out.println("Player chose " + playerChoice);
		}
	String[] choiceArray = {"Rock","Paper","Scissors"};
		
		Random random = new Random();
		
		int cpuChoice = random.nextInt(choiceArray.length);
		
		System.out.println("Computer Chose " + choiceArray[cpuChoice]);
		
		//check winner
		
		if(playerChoice.equals(choiceArray[cpuChoice])) {
			System.out.println("It's a Tie");
		}
		if(playerChoice.equals("Paper") && choiceArray[cpuChoice].equals("Rock")) {
			System.out.println("Player Wins");
		}
		if(playerChoice.equals("Rock") && choiceArray[cpuChoice].equals("Scissors")) {
			System.out.println("Player Wins");
		}
		if(playerChoice.equals("Scissors") && choiceArray[cpuChoice].equals("Paper")) {
			System.out.println("Player Wins");
		}
		if(playerChoice.equals("Rock") && choiceArray[cpuChoice].equals("Paper")) {
			System.out.println("Computer Wins");
		}
		if(playerChoice.equals("Scissors") && choiceArray[cpuChoice].equals("Rock")) {
			System.out.println("Computer Wins");
		}
		if(playerChoice.equals("Paper") && choiceArray[cpuChoice].equals("Scissors")) {
			System.out.println("Computer Wins");
		}
	}
	
}
