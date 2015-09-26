import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

class MemoryTracks extends JFrame{   
	MemoryTracks(){
		JFrame frame = new JFrame("MemoryTracks");
	   // Container track1 = MemoryTracks.getContentPane();
	   JPanel track1 = new JPanel();
	  track1.setLayout(new BoxLayout(track1, BoxLayout.Y_AXIS));
	  track1.setBackground(Color.blue);
	   JButton buttonNS = new JButton("New Set");
	   track1.add(buttonNS);
	   JLabel test = new JLabel("Testing");
	    track1.add(test);	
	   System.out.println("In MemoryTracks");
	   JPanel panel3 = new JPanel();
		panel3.setBackground(Color.red);
       	
		track1.add(panel3);
		
	   setSize(300,300);
	   setVisible(true);
	  
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[]args){
	     MemoryTracks memoryTracks1 = new MemoryTracks();
		
    }
}