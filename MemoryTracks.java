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
		buttonNS1.setPreferredSize(new Dimension(120,30));
		buttonNS1.setFont(new Font("Arial",Font.BOLD,17));
	    JButton buttonH1 = new JButton("Hide");
		buttonH1.setPreferredSize(new Dimension(120,30));
		buttonH1.setFont(new Font("Arial",Font.BOLD,17));
	    JButton buttonR1 = new JButton("Reveal");
		buttonR1.setPreferredSize(new Dimension(120,30));
		buttonR1.setFont(new Font("Arial",Font.BOLD,17));
	   
	    JButton buttonNS2 = new JButton("New Set");
		buttonNS2.setPreferredSize(new Dimension(120,30));
		buttonNS2.setFont(new Font("Arial",Font.BOLD,17));
	    JButton buttonH2 = new JButton("Hide");
		buttonH2.setPreferredSize(new Dimension(120,30));
		buttonH2.setFont(new Font("Arial",Font.BOLD,17));
	    JButton buttonR2 = new JButton("Reveal");
		buttonR2.setPreferredSize(new Dimension(120,30));
		buttonR2.setFont(new Font("Arial",Font.BOLD,17));
	   
	    JButton buttonNS3 = new JButton("New Set");
		buttonNS3.setPreferredSize(new Dimension(120,30));
		buttonNS3.setFont(new Font("Arial",Font.BOLD,17));
	    JButton buttonH3 = new JButton("Hide");
		buttonH3.setPreferredSize(new Dimension(120,30));
		buttonH3.setFont(new Font("Arial",Font.BOLD,17));
	    JButton buttonR3 = new JButton("Reveal");
		buttonR3.setPreferredSize(new Dimension(120,30));
		buttonR3.setFont(new Font("Arial",Font.BOLD,17));

	    JLabel trackNo1 = new JLabel("1");
	    trackNo1.setForeground(Color.decode("#ffffff"));
		trackNo1.setFont(new Font("Arial",Font.BOLD,50));
	    JLabel trackNo2 = new JLabel("2");
	    trackNo2.setForeground(Color.decode("#ffffff"));
		trackNo2.setFont(new Font("Arial",Font.BOLD,50));
	    JLabel trackNo3 = new JLabel("3");
	    trackNo3.setForeground(Color.decode("#ffffff"));
		trackNo3.setFont(new Font("Arial",Font.BOLD,50));
		
		JPanel pictureBox1 = new JPanel();
		pictureBox1.setLayout(new GridLayout(1,4));
		JPanel picture1a = new JPanel();
		picture1a.setBackground(Color.decode("#dddddd"));
		picture1a.setPreferredSize(new Dimension(50,50));
		JPanel picture1b = new JPanel();
		picture1b.setBackground(Color.decode("#dddddd"));
		picture1b.setPreferredSize(new Dimension(50,50));
		JPanel picture1c = new JPanel();
		picture1c.setBackground(Color.decode("#dddddd"));
		picture1c.setPreferredSize(new Dimension(50,50));
		JPanel picture1d = new JPanel();
		picture1d.setBackground(Color.decode("#dddddd"));
		picture1d.setPreferredSize(new Dimension(50,50));
		
		Icon picA; 	
        JLabel labelPicA;	
		picA = new ImageIcon("img/image4.png");
		labelPicA = new JLabel(picA);
		labelPicA.setPreferredSize(new Dimension(50,50));
	   
	    paneMT.add(topMT);
		
		topMT.add(track1);
		track1.add(trackNo1);
		track1.add(buttonNS1);
		track1.add(buttonH1);
		track1.add(buttonR1);
		track1.add(pictureBox1);
		pictureBox1.add(picture1a);
		pictureBox1.add(picture1b);
		pictureBox1.add(picture1c);
		pictureBox1.add(picture1d);
		picture1a.add(labelPicA);
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
		controlsLabel.setFont(new Font("Arial",Font.BOLD,30));
		controlsLabelStrip.add(controlsLabel);
		controls.add(controlsLabelStrip);
		
	    JPanel controlsActiveStrip = new JPanel();
	    JButton active1 = new JButton("1");
		active1.setFont(new Font("Arial",Font.BOLD,40));
		active1.setBackground(Color.decode("#3f48cc"));
		active1.setForeground(Color.decode("#ffffff"));
		active1.setPreferredSize(new Dimension(120,50));
	    JButton active2 = new JButton("2");
		active2.setFont(new Font("Arial",Font.BOLD,40));
		active2.setBackground(Color.decode("#22b14c"));
		active2.setForeground(Color.decode("#ffffff"));
		active2.setPreferredSize(new Dimension(120,50));
	    JButton active3 = new JButton("3");
		active3.setFont(new Font("Arial",Font.BOLD,40));
		active3.setBackground(Color.decode("#aa001a"));
		active3.setForeground(Color.decode("#ffffff"));	 
        active3.setPreferredSize(new Dimension(120,50));		
	    controlsActiveStrip.add(active1);
	    controlsActiveStrip.add(active2);
	    controlsActiveStrip.add(active3);
		controls.add(controlsActiveStrip);
			
	    JPanel controlsBtnsRow1 = new JPanel();
	    JButton startBtn = new JButton("Start");
		startBtn.setPreferredSize(new Dimension(120,30));
		startBtn.setFont(new Font("Arial",Font.BOLD,17));
	    JButton optionsBtn = new JButton("Options");
		optionsBtn.setPreferredSize(new Dimension(120,30));
		optionsBtn.setFont(new Font("Arial",Font.BOLD,17));
	    JButton saveBtn = new JButton("Save");	
        saveBtn.setPreferredSize(new Dimension(120,30));
        saveBtn.setFont(new Font("Arial",Font.BOLD,17));		
		controlsBtnsRow1.add(startBtn);
	    controlsBtnsRow1.add(optionsBtn);
	    controlsBtnsRow1.add(saveBtn);
		controls.add(controlsBtnsRow1);
		
		JPanel controlsBtnsRow2 = new JPanel();
		JButton startoverBtn = new JButton("Start Over");
		startoverBtn.setPreferredSize(new Dimension(120,30));
		startoverBtn.setFont(new Font("Arial",Font.BOLD,17));
	    JButton continueBtn = new JButton("Continue");
		continueBtn.setPreferredSize(new Dimension(120,30));
		continueBtn.setFont(new Font("Arial",Font.BOLD,17));
	    JButton exitBtn = new JButton("Exit");
		exitBtn.setPreferredSize(new Dimension(120,30));
		exitBtn.setFont(new Font("Arial",Font.BOLD,17));
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