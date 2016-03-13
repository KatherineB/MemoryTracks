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
		buttonNS1.setPreferredSize(new Dimension(90,30));
	    JButton buttonH1 = new JButton("Hide");
		buttonH1.setPreferredSize(new Dimension(90,30));
	    JButton buttonR1 = new JButton("Reveal");
		buttonR1.setPreferredSize(new Dimension(90,30));
	   
	    JButton buttonNS2 = new JButton("New Set");
		buttonNS2.setPreferredSize(new Dimension(90,30));
	    JButton buttonH2 = new JButton("Hide");
		buttonH2.setPreferredSize(new Dimension(90,30));
	    JButton buttonR2 = new JButton("Reveal");
		buttonR2.setPreferredSize(new Dimension(90,30));
	   
	    JButton buttonNS3 = new JButton("New Set");
		buttonNS3.setPreferredSize(new Dimension(90,30));
	    JButton buttonH3 = new JButton("Hide");
		buttonH3.setPreferredSize(new Dimension(90,30));
	    JButton buttonR3 = new JButton("Reveal");
		buttonR3.setPreferredSize(new Dimension(90,30));

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
	 //   controls.setLayout(new GridLayout(4,3));
		controls.setLayout(new BoxLayout(controls, BoxLayout.PAGE_AXIS));
	    controls.setBackground(Color.decode("#ffffaa"));
	  
	    JPanel controlsLabelStrip = new JPanel();
		controlsLabelStrip.setBackground(Color.decode("#bbbbbb"));
		
		JLabel controlsLabel = new JLabel("Active Track");
		controlsLabelStrip.add(controlsLabel);
		controls.add(controlsLabelStrip);
		
	    JPanel controlsActiveStrip = new JPanel();
	    JButton active1 = new JButton("1");
		active1.setBackground(Color.decode("#3f48cc"));
		active1.setForeground(Color.decode("#ffffff"));
		active1.setPreferredSize(new Dimension(100,50));
	    JButton active2 = new JButton("2");
		active2.setBackground(Color.decode("#22b14c"));
		active2.setForeground(Color.decode("#ffffff"));
		active2.setPreferredSize(new Dimension(100,50));
	    JButton active3 = new JButton("3");
		active3.setBackground(Color.decode("#aa001a"));
		active3.setForeground(Color.decode("#ffffff"));	 
        active3.setPreferredSize(new Dimension(100,50));		
	    controlsActiveStrip.add(active1);
	    controlsActiveStrip.add(active2);
	    controlsActiveStrip.add(active3);
		controls.add(controlsActiveStrip);
			
	    JPanel controlsBtnsRow1 = new JPanel();
	    JButton startBtn = new JButton("Start");
		startBtn.setPreferredSize(new Dimension(100,40));
	    JButton optionsBtn = new JButton("Options");
		optionsBtn.setPreferredSize(new Dimension(100,40));
	    JButton saveBtn = new JButton("Save");	
        saveBtn.setPreferredSize(new Dimension(100,40));		
		controlsBtnsRow1.add(startBtn);
	    controlsBtnsRow1.add(optionsBtn);
	    controlsBtnsRow1.add(saveBtn);
		controls.add(controlsBtnsRow1);
		
		JPanel controlsBtnsRow2 = new JPanel();
		JButton startoverBtn = new JButton("Start Over");
		startoverBtn.setPreferredSize(new Dimension(100,40));
	    JButton continueBtn = new JButton("Continue");
		continueBtn.setPreferredSize(new Dimension(100,40));
	    JButton exitBtn = new JButton("Exit");
		exitBtn.setPreferredSize(new Dimension(100,40));
		controlsBtnsRow2.add(startoverBtn);
	    controlsBtnsRow2.add(continueBtn);
	    controlsBtnsRow2.add(exitBtn);
		controls.add(controlsBtnsRow2);
					
	    bottomMT.add(controls);
		paneMT.add(bottomMT);
	  	     		
	    setSize(1000,600);
	   
	    setVisible(true);
	  
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[]args){
	     MemoryTracks memoryTracks1 = new MemoryTracks();
		
    }
}