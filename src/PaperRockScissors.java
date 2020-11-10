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
	String cpuChoice;
	int score = 0;
	int tie	= 0;
	int cpuScore = 0;
	JLabel playerChoiceText;
	JLabel cpuChoiceText;
	JLabel winnerText;
	JLabel userScore;
	JLabel comScore;
	JLabel tieScore;
	
	
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
		paperBtn.setIcon(paperIcon);
		
		rockBtn = new JButton();
		rockBtn.setBounds(240,130,120,120);
		rockBtn.addActionListener(this);
		rockBtn.setIcon(rockIcon);
		
		scissorsBtn = new JButton();
		scissorsBtn.setBounds(430,130,120,120);
		scissorsBtn.addActionListener(this);
		scissorsBtn.setIcon(scissorsIcon);
		
		
		//Add text inside frame
		JLabel callToAction = new JLabel();
		callToAction.setText("Choose Your Weapon");
		callToAction.setHorizontalAlignment(JLabel.CENTER);
		callToAction.setVerticalAlignment(JLabel.NORTH);
		callToAction.setForeground(Color.black);
		callToAction.setFont(new Font("Helvetica", Font.BOLD,35));
		callToAction.setBounds(0,30,600,100);
		
		//Display Choices in GUI
		
		playerChoiceText = new JLabel();
		playerChoiceText.setHorizontalAlignment(JLabel.CENTER);
		playerChoiceText.setVerticalAlignment(JLabel.BOTTOM);
		playerChoiceText.setForeground(Color.green);
		playerChoiceText.setFont(new Font("Helvetica", Font.BOLD,20));
		playerChoiceText.setBounds(0,200,300,100);
		
		cpuChoiceText = new JLabel();
		cpuChoiceText.setHorizontalAlignment(JLabel.CENTER);
		cpuChoiceText.setVerticalAlignment(JLabel.BOTTOM);
		cpuChoiceText.setForeground(Color.red);
		cpuChoiceText.setFont(new Font("Helvetica", Font.BOLD,20));
		cpuChoiceText.setBounds(250,200,300,100);
		
		//Display Winner 
		winnerText = new JLabel();
		winnerText.setHorizontalAlignment(JLabel.CENTER);
		winnerText.setVerticalAlignment(JLabel.BOTTOM);
		winnerText.setForeground(Color.black);
		winnerText.setFont(new Font("Helvetica", Font.BOLD,30));
		winnerText.setBounds(150,270,300,100);
		
		//Display Player Score
		userScore = new JLabel();
		userScore.setText("Player: 0");
		userScore.setHorizontalAlignment(JLabel.RIGHT);
		userScore.setVerticalAlignment(JLabel.BOTTOM);
		userScore.setForeground(Color.black);
		userScore.setFont(new Font("Helvetica", Font.BOLD,20));
		userScore.setBounds(-150,350,300,100);
		
		//Display Computer Score
		comScore = new JLabel();
		comScore.setText("CPU: 0");
		comScore.setHorizontalAlignment(JLabel.RIGHT);
		comScore.setVerticalAlignment(JLabel.BOTTOM);
		comScore.setForeground(Color.black);
		comScore.setFont(new Font("Helvetica", Font.BOLD,20));
		comScore.setBounds(35,350,300,100);
		
		//Display Tie
		tieScore = new JLabel();
		tieScore.setText("Tie: 0");
		tieScore.setHorizontalAlignment(JLabel.RIGHT);
		tieScore.setVerticalAlignment(JLabel.BOTTOM);
		tieScore.setForeground(Color.black);
		tieScore.setFont(new Font("Helvetica", Font.BOLD,20));
		tieScore.setBounds(220,350,300,100);
				
		
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
		frame.add(playerChoiceText);
		frame.add(cpuChoiceText);
		frame.add(winnerText);
		frame.add(userScore);
		frame.add(comScore);
		frame.add(tieScore);
		
		
	
		
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
		
		
	
	
}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==paperBtn) {
			playerChoice = "Paper";	
			playerChoiceText.setText("Player:  " + playerChoice);	
			System.out.println("Player: " + playerChoice);
			
		}
		if(e.getSource()==rockBtn) {
			playerChoice = "Rock";
			playerChoiceText.setText("Player:  " + playerChoice);
			System.out.println("Player: " + playerChoice);
		}
		if(e.getSource()==scissorsBtn) {
			playerChoice = "Scissors";
			playerChoiceText.setText("Player:  " + playerChoice);
			System.out.println("Player: " + playerChoice);
		}
		
		//get choice from Computer
		String[] choiceArray = {"Rock","Paper","Scissors"};
		
		Random random = new Random();
		
		int cpuChoice = random.nextInt(choiceArray.length);
		cpuChoiceText.setText("Computer: " + choiceArray[cpuChoice]);
		
		System.out.println("Computer: " + choiceArray[cpuChoice]);
		
		//check winner
		
		if(playerChoice.equals(choiceArray[cpuChoice])) {
			tie++;
			userScore.setText("Player: " + score);
			comScore.setText("Cpu: " + cpuScore);
			tieScore.setText("Tie: " + tie);
			winnerText.setText("Tie");
			System.out.println("Tie");
		}
		if(playerChoice.equals("Paper") && choiceArray[cpuChoice].equals("Rock")) {
			score++;
			userScore.setText("Player: " + score);
			comScore.setText("Cpu: " + cpuScore);
			tieScore.setText("Tie: " + tie);
			winnerText.setText("Player Wins");
			System.out.println("Player Wins");
		}
		if(playerChoice.equals("Rock") && choiceArray[cpuChoice].equals("Scissors")) {
			score++;
			userScore.setText("Player: " + score);
			comScore.setText("Cpu: " + cpuScore);
			tieScore.setText("Tie: " + tie);
			winnerText.setText("Player Wins");
			System.out.println("Player Wins");
		}
		if(playerChoice.equals("Scissors") && choiceArray[cpuChoice].equals("Paper")) {
			score++;
			userScore.setText("Player: " + score);
			comScore.setText("Cpu: " + cpuScore);
			tieScore.setText("Tie: " + tie);
			winnerText.setText("Player Wins");
			System.out.println("Player Wins");
		}
		if(playerChoice.equals("Rock") && choiceArray[cpuChoice].equals("Paper")) {
			cpuScore++;
			userScore.setText("Player: " + score);
			comScore.setText("Cpu: " + cpuScore);
			tieScore.setText("Tie: " + tie);
			winnerText.setText("Computer Wins");
			System.out.println("Computer Wins");
		}
		if(playerChoice.equals("Scissors") && choiceArray[cpuChoice].equals("Rock")) {
			cpuScore++;
			userScore.setText("Player: " + score);
			comScore.setText("Cpu: " + cpuScore);
			tieScore.setText("Tie: " + tie);
			winnerText.setText("Computer Wins");
			System.out.println("Computer Wins");
		}
		if(playerChoice.equals("Paper") && choiceArray[cpuChoice].equals("Scissors")) {
			cpuScore++;
			userScore.setText("Player: " + score);
			comScore.setText("Cpu: " + cpuScore);
			tieScore.setText("Tie: " + tie);
			winnerText.setText("Computer Wins");
			System.out.println("Computer Wins");
			
		}
		
	}
	
}

