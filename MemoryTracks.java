import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

class MemoryTracks extends JFrame{   
	MemoryTracks(){
		//JFrame frameMT = new JFrame("MemoryTracks");
	  Container paneMT = getContentPane();
	  paneMT.setLayout(new GridLayout(2,1));
	  
	  JPanel topMT = new JPanel();
	  topMT.setLayout(new GridLayout(3,1));
	 
	  JPanel track1 = new JPanel();
	  JPanel track2 = new JPanel();
	  JPanel track3 = new JPanel();
	  JPanel controlsMT = new JPanel();
	  
	  track1.setBackground(Color.blue);
	
	  track2.setBackground(Color.green);

	  track3.setBackground(Color.red);

	
	   JButton buttonNS1 = new JButton("New Set");
	   JButton buttonH1 = new JButton("Hide");
	   JButton buttonR1 = new JButton("Reveal");
	   
	   JButton buttonNS2 = new JButton("New Set");
	   JButton buttonH2 = new JButton("Hide");
	   JButton buttonR2 = new JButton("Reveal");
	   
	   JButton buttonNS3 = new JButton("New Set");
	   JButton buttonH3 = new JButton("Hide");
	   JButton buttonR3 = new JButton("Reveal");

	   JLabel trackNo1 = new JLabel("1");
	   JLabel trackNo2 = new JLabel("2");
	   JLabel trackNo3 = new JLabel("3");
	   
	   System.out.println("In MemoryTracks");
	    paneMT.add(topMT);
		topMT.add(track1);
		track1.add(trackNo1);
		track1.add(buttonNS1);
		track1.add(buttonH1);
		track1.add(buttonR1);
		
		topMT.add(track2);
		track2.add(trackNo2);
		track2.add(buttonNS2);
		track2.add(buttonH2);
		track2.add(buttonR2);
		
		topMT.add(track3);
		track3.add(trackNo3);
		track3.add(buttonNS3);
		track3.add(buttonH3);
		track3.add(buttonR3);
		
	   setSize(1000,600);
	   setVisible(true);
	  
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[]args){
	     MemoryTracks memoryTracks1 = new MemoryTracks();
		
    }
}