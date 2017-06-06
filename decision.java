import java.util.Random;
import java.util.Scanner;

class decision {
	
	public static void main (String [] args) {

		//guiSetup();
        //threeDecision();
        twoDecision();
	
        
        
	}
    
    public static void twoDecision() {
        boolean loopVar = true;
        
        while (loopVar = true) {
            
            Scanner keyboard = new Scanner (System.in);
            System.out.println("Welcome to the decision maker! Enter two options.");
            String op1 = keyboard.nextLine();
            String op2 = keyboard.nextLine();
            
            System.out.println("Option 1 is: " + op1 + "\nOption 2 is: " + op2);
            
            Random rand = new Random();
            int x = rand.nextInt(6);
            
            if (x > 2) {
                System.out.println("You should do option 1: " + op1 + " -- " + x);
            } else {
                System.out.println("You should do option 2: " + op2 + " -- " + x);
            }
            
            System.out.println("Would you like to make another decision? y/n");
            String resp = keyboard.nextLine();
            
            if ( !resp.equals("n") ) {
                loopVar = true;
            } else {
                loopVar = false;
                break;
            }
            
        }
    }
    
    /*
    public static void threeDecision() {
        boolean loopVar = true;
        
        while (loopVar = true) {
            
            Scanner keyboard = new Scanner (System.in);
            System.out.println("Welcome to the decision maker! Enter three options.");
            String op1 = keyboard.nextLine();
            String op2 = keyboard.nextLine();
            String op3 = keyboard.nextLine();
            
            System.out.println("Option 1 is: " + op1 + "\nOption 2 is: " + op2 + "\nOption 3 is: " + op3);
            
            Random rand = new Random();
            int x = rand.nextInt(9);
            
            // 0 1 2 - 3 4 5 - 6 7 8 - 9
            if (x < 3) {
                System.out.println("You should do option 1: " + op1 + " -- " + x);
                
            } else if(x > 2 && x < 6) {
                
                System.out.println("You should do option 2: " + op2 + " -- " + x);
            } else {
                System.out.println("You should do option 3: " + op3 + " -- " + x);
            }
            
            System.out.println("Would you like to make another decision? y/n");
            String resp = keyboard.nextLine();
            
            if ( !resp.equals("n") ) {
                loopVar = true;
            } else {
                loopVar = false;
                break;
            }
            
        }
        
    }
	
	
	public static void guiSetup() {
		// Create the frame
		JFrame frame = new JFrame("Decision Maker");
		frame.setSize(500, 200);
		frame.setLocation(200, 200);
		frame.setContentPane(new HighLow());
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		greeting = new JLabel("Welcome to the decision maker!");
		greeting.setHorizontalAlignment(JLabel.CENTER);
		add(greeting, BorderLayout.CENTER);
		greeting.setForeground(Color.blue);
		greeting.setFont(new Font("Arial Black", Font.PLAIN, 60));
	}
*/
}
