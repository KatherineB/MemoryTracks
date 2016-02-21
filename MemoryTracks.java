import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.text.*;
import java.io.*;

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
	  	  
	  track1.setLayout(new BoxLayout(track1, BoxLayout.LINE_AXIS));
	  track1.setBackground(Color.decode("#3f48cc"));
	
	  track2.setBackground(Color.decode("#22b14c"));

	  track3.setBackground(Color.decode("#aa001a"));

	
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
	   trackNo1.setForeground(Color.decode("#ffffff"));
	   JLabel trackNo2 = new JLabel("2");
	   trackNo2.setForeground(Color.decode("#ffffff"));
	   JLabel trackNo3 = new JLabel("3");
	   trackNo3.setForeground(Color.decode("#ffffff"));
	   
	   JPanel panel = new JPanel();
	   panel.setSize(200,200);  // seems to have no effect
	   panel.setBackground(Color.decode("#ffce41"));  //just test to make area show up
	  //  BufferedImage img;
	/*	Graphics g;

       try {
		  
          BufferedImage img = ImageIO.read(new File("image1.jpg"));
		  g.drawImage(img, 0, 0, null);
       } catch (IOException e) {
		  System.out.println(e);
       }
     */
        
    
  
	  /* JLayeredPane layeredPane = new JLayeredPane();
       layeredPane.setPreferredSize(new Dimension(50, 50));*/
	   
	 // System.out.println("In MemoryTracks");
	    paneMT.add(topMT);
		
		topMT.add(track1);
		track1.add(trackNo1);
		track1.add(buttonNS1);
		track1.add(buttonH1);
		track1.add(buttonR1);
		track1.add(panel);
				
		topMT.add(track2);
		track2.add(trackNo2);
		track2.add(buttonNS2);
		track2.add(buttonH2);
		track2.add(buttonR2);
	//	track1.add(layeredPane);
		
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