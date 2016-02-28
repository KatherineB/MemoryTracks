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
	  
	  //  track1.setLayout(new BoxLayout(track1, BoxLayout.LINE_AXIS));
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
	   
	    paneMT.add(topMT);
		
		topMT.add(track1);
		track1.add(trackNo1);
		track1.add(buttonNS1);
		track1.add(buttonH1);
		track1.add(buttonR1);
		//track1.add(panel);
		//track1.add(panel2);
				
		topMT.add(track2);
		track2.add(trackNo2);
		track2.add(buttonNS2);
		track2.add(buttonH2);
		track2.add(buttonR2);
	//	track1.add(layeredPane);
	 //   track2.add(panel);
	//	track2.add(panel2);
		
		topMT.add(track3);
		track3.add(trackNo3);
		track3.add(buttonNS3);
		track3.add(buttonH3);
		track3.add(buttonR3);
		
	    
	   
	 /*  JPanel panel = new JPanel();
	   panel.setSize(200,200);  
	   panel.setBackground(Color.decode("#ffce41")); 
	   JPanel panel2 = new JPanel();
	   panel2.setSize(200,200);  
	   panel2.setBackground(Color.decode("#dd77ff")); */
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
	   	  
	    JPanel bottomMT = new JPanel();
	    bottomMT.setBackground(Color.decode("#bbbbbb"));
			  
	    JPanel controls = new JPanel();
	    controls.setLayout(new BorderLayout());
	    controls.setBackground(Color.decode("#ffffaa"));
	  
	    JLabel controlsLabel = new JLabel("Active Track");
	    controlsLabel.setForeground(Color.decode("#000000"));
	  
	    JPanel controlsBtns = new JPanel();
	    controlsBtns.setLayout(new GridLayout(3,3));	
		
		paneMT.add(bottomMT);
	    bottomMT.add(controls);
	    controls.add(controlsLabel, BorderLayout.NORTH);
	    controls.add(controlsBtns, BorderLayout.SOUTH);
	  
	    JButton active1 = new JButton("1");
		active1.setBackground(Color.decode("#3f48cc"));
		active1.setForeground(Color.decode("#ffffff"));
	    JButton active2 = new JButton("2");
		active2.setBackground(Color.decode("#22b14c"));
		active2.setForeground(Color.decode("#ffffff"));
	    JButton active3 = new JButton("3");
		active3.setBackground(Color.decode("#aa001a"));
		active3.setForeground(Color.decode("#ffffff"));
			   	   
	    JButton startBtn = new JButton("Start");
	    JButton optionsBtn = new JButton("Options");
	    JButton saveBtn = new JButton("Save");
	   	   
	    JButton startoverBtn = new JButton("Start Over");
	    JButton continueBtn = new JButton("Continue");
	    JButton exitBtn = new JButton("Exit");
	  	  
	    controlsBtns.add(active1);
	    controlsBtns.add(active2);
	    controlsBtns.add(active3);
	   
	    controlsBtns.add(startBtn);
	    controlsBtns.add(optionsBtn);
	    controlsBtns.add(saveBtn);
	   
	    controlsBtns.add(startoverBtn);
	    controlsBtns.add(continueBtn);
	    controlsBtns.add(exitBtn);
	   		
	    setSize(1000,600);
	   
	    setVisible(true);
	  
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[]args){
	     MemoryTracks memoryTracks1 = new MemoryTracks();
		
    }
}