import javax.swing.*;
import javax.imageio.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.text.*;
import java.io.*;

class MemoryTracks extends JFrame{   
    String[] imageCards = {"image1.png","image2.png","image3.png","image4.png","image5.png","image6.png"};
	String[] numberCards = {"number1.png","number2.png","number3.png","number4.png","number5.png","number6.png"};
//	Image[] imagesChosen = new Image[4];
		
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
		buttonNS1.setPreferredSize(new Dimension(130,35));
		buttonNS1.setFont(new Font("Arial",Font.BOLD,23));
	    JButton buttonH1 = new JButton("Hide");
		buttonH1.setPreferredSize(new Dimension(130,35));
		buttonH1.setFont(new Font("Arial",Font.BOLD,23));
	    JButton buttonR1 = new JButton("Reveal");
		buttonR1.setPreferredSize(new Dimension(130,35));
		buttonR1.setFont(new Font("Arial",Font.BOLD,23));
	   
	    JButton buttonNS2 = new JButton("New Set");
		buttonNS2.setPreferredSize(new Dimension(130,35));
		buttonNS2.setFont(new Font("Arial",Font.BOLD,23));
	    JButton buttonH2 = new JButton("Hide");
		buttonH2.setPreferredSize(new Dimension(130,35));
		buttonH2.setFont(new Font("Arial",Font.BOLD,23));
	    JButton buttonR2 = new JButton("Reveal");
		buttonR2.setPreferredSize(new Dimension(130,35));
		buttonR2.setFont(new Font("Arial",Font.BOLD,23));
	   
	    JButton buttonNS3 = new JButton("New Set");
		buttonNS3.setPreferredSize(new Dimension(130,35));
		buttonNS3.setFont(new Font("Arial",Font.BOLD,23));
	    JButton buttonH3 = new JButton("Hide");
		buttonH3.setPreferredSize(new Dimension(130,35));
		buttonH3.setFont(new Font("Arial",Font.BOLD,23));
	    JButton buttonR3 = new JButton("Reveal");
		buttonR3.setPreferredSize(new Dimension(130,35));
		buttonR3.setFont(new Font("Arial",Font.BOLD,23));

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
		pictureBox1.setBackground(Color.decode("#dd7700"));
		pictureBox1.setLayout(new GridLayout(1,4));
	//	pictureBox1.setVgap(0);
		JPanel picture1a = new JPanel();
		//picture1a.setVgap(0);
	//	picture1a.setBackground(Color.decode("#dddddd"));
		picture1a.setBackground(Color.decode("#ddee00"));
		picture1a.setPreferredSize(new Dimension(100,100));
		JPanel picture1b = new JPanel();
		picture1b.setBackground(Color.decode("#dddddd"));
		picture1b.setPreferredSize(new Dimension(100,100));
		JPanel picture1c = new JPanel();
		picture1c.setBackground(Color.decode("#dddddd"));
		picture1c.setPreferredSize(new Dimension(100,100));
		JPanel picture1d = new JPanel();
		picture1d.setBackground(Color.decode("#dddddd"));
		picture1d.setPreferredSize(new Dimension(100,100));
		
		Icon picA; 	
        JLabel labelPicA;	
		double picNum1 = Math.random() * 6;
		int randNo1 = (int)picNum1;
	    picA = new ImageIcon("img/" + imageCards[randNo1]);
		labelPicA = new JLabel(picA);
		labelPicA.setPreferredSize(new Dimension(100,100));
		
		Icon picB; 	
        JLabel labelPicB;	
		double picNum2 = Math.random() * 6;
		int randNo2 = (int)picNum2;
	    picB = new ImageIcon("img/" + imageCards[randNo2]);
		labelPicB = new JLabel(picB);
		labelPicB.setPreferredSize(new Dimension(100,100));
		
		Icon picC; 	
        JLabel labelPicC;	
		double picNum3 = Math.random() * 6;
		int randNo3 = (int)picNum3;
	    picC = new ImageIcon("img/" + imageCards[randNo3]);
		labelPicC = new JLabel(picC);
		labelPicC.setPreferredSize(new Dimension(100,100));
		
		Icon picD; 	
        JLabel labelPicD;	
		double picNum4 = Math.random() * 6;
		int randNo4 = (int)picNum4;
	    picD = new ImageIcon("img/" + imageCards[randNo4]);
		labelPicD = new JLabel(picD);
		labelPicD.setPreferredSize(new Dimension(100,100));
	   
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
	//	track1.add(labelPicA);
		picture1a.add(labelPicA);
		picture1b.add(labelPicB);
		picture1c.add(labelPicC);
		picture1d.add(labelPicD);
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
		controlsLabel.setFont(new Font("Arial",Font.BOLD,34));
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
		startBtn.setPreferredSize(new Dimension(182,35));
		startBtn.setFont(new Font("Arial",Font.BOLD,23));
		JButton startoverBtn = new JButton("Start Over");
		startoverBtn.setPreferredSize(new Dimension(182,35));
		startoverBtn.setFont(new Font("Arial",Font.BOLD,23));  		
		controlsBtnsRow1.add(startBtn);
	    controlsBtnsRow1.add(startoverBtn);
		controls.add(controlsBtnsRow1);
		
		JPanel controlsBtnsRow2 = new JPanel();
		JButton optionsBtn = new JButton("Options");
		optionsBtn.setPreferredSize(new Dimension(182,35));
		optionsBtn.setFont(new Font("Arial",Font.BOLD,23));
	    JButton continueBtn = new JButton("Continue");
		continueBtn.setPreferredSize(new Dimension(182,35));
		continueBtn.setFont(new Font("Arial",Font.BOLD,23));	    
		controlsBtnsRow2.add(optionsBtn);
	    controlsBtnsRow2.add(continueBtn);
		controls.add(controlsBtnsRow2);
		
		JPanel controlsBtnsRow3 = new JPanel();
		JButton saveBtn = new JButton("Save");	
        saveBtn.setPreferredSize(new Dimension(182,35));
        saveBtn.setFont(new Font("Arial",Font.BOLD,23));
		JButton exitBtn = new JButton("Exit");
		exitBtn.setPreferredSize(new Dimension(182,35));
		exitBtn.setFont(new Font("Arial",Font.BOLD,23));
	    controlsBtnsRow3.add(saveBtn);
	    controlsBtnsRow3.add(exitBtn);
		controls.add(controlsBtnsRow3);
					
	    bottomMT.add(controls);
		
		JPanel pictures = new JPanel();
		pictures.setLayout(new BoxLayout(pictures, BoxLayout.PAGE_AXIS));
	    pictures.setBackground(Color.decode("#ffffaa"));
		
		JPanel picturesLabelStrip = new JPanel();
		picturesLabelStrip.setBackground(Color.decode("#bbbbbb"));
		
		JLabel picturesLabel = new JLabel("Pictures");
		picturesLabel.setFont(new Font("Arial",Font.BOLD,34));
				
		picturesLabelStrip.add(picturesLabel);
		pictures.add(picturesLabelStrip);
		
		JPanel picturesImageStripA = new JPanel();
		picturesImageStripA.setBackground(Color.decode("#bbbbbb"));
		
		JPanel pictureImage1 = new JPanel();
		pictureImage1.setBackground(Color.decode("#dddddd"));
		pictureImage1.setPreferredSize(new Dimension(60,60));
		Icon picImage1; 	
        JLabel picLabel1;	
	    picImage1 = new ImageIcon("img/" + imageCards[0]);
		picLabel1 = new JLabel(picImage1);
		picLabel1.setPreferredSize(new Dimension(60,60));
		pictureImage1.add(picLabel1);
		
		JPanel pictureImage2 = new JPanel();
		pictureImage2.setBackground(Color.decode("#dddddd"));
		pictureImage2.setPreferredSize(new Dimension(60,60));
		Icon picImage2; 	
        JLabel picLabel2;	
	    picImage2 = new ImageIcon("img/" + imageCards[1]);
		picLabel2 = new JLabel(picImage2);
		picLabel2.setPreferredSize(new Dimension(60,60));
		pictureImage2.add(picLabel2);
		
		JPanel picturesImageStripB = new JPanel();
		picturesImageStripB.setBackground(Color.decode("#bbbbbb"));
		
		JPanel pictureImage3 = new JPanel();
		pictureImage3.setBackground(Color.decode("#dddddd"));
		pictureImage3.setPreferredSize(new Dimension(60,60));
		Icon picImage3; 	
        JLabel picLabel3;	
	    picImage3 = new ImageIcon("img/" + imageCards[2]);
		picLabel3 = new JLabel(picImage3);
		picLabel3.setPreferredSize(new Dimension(60,60));
		pictureImage3.add(picLabel3);
		
		JPanel pictureImage4 = new JPanel();
		pictureImage4.setBackground(Color.decode("#dddddd"));
		pictureImage4.setPreferredSize(new Dimension(60,60));
		Icon picImage4; 	
        JLabel picLabel4;	
	    picImage4 = new ImageIcon("img/" + imageCards[3]);
		picLabel4 = new JLabel(picImage4);
		picLabel4.setPreferredSize(new Dimension(60,60));
		pictureImage4.add(picLabel4);
		
		JPanel picturesImageStripC = new JPanel();
		picturesImageStripC.setBackground(Color.decode("#bbbbbb"));
		
		JPanel pictureImage5 = new JPanel();
		pictureImage5.setBackground(Color.decode("#dddddd"));
		pictureImage5.setPreferredSize(new Dimension(60,60));
		Icon picImage5; 	
        JLabel picLabel5;	
	    picImage5 = new ImageIcon("img/" + imageCards[4]);
		picLabel5 = new JLabel(picImage5);
		picLabel5.setPreferredSize(new Dimension(60,60));
		pictureImage5.add(picLabel5);
		
		JPanel pictureImage6 = new JPanel();
		pictureImage6.setBackground(Color.decode("#dddddd"));
		pictureImage6.setPreferredSize(new Dimension(60,60));
		Icon picImage6; 	
        JLabel picLabel6;	
	    picImage6 = new ImageIcon("img/" + imageCards[5]);
		picLabel6 = new JLabel(picImage6);
		picLabel6.setPreferredSize(new Dimension(60,60));
		pictureImage6.add(picLabel6);
		
		picturesImageStripA.add(pictureImage1);
		picturesImageStripA.add(pictureImage2);
		picturesImageStripB.add(pictureImage3);
		picturesImageStripB.add(pictureImage4);
		picturesImageStripC.add(pictureImage5);
		picturesImageStripC.add(pictureImage6);
		
		pictures.add(picturesImageStripA);
		pictures.add(picturesImageStripB);
		pictures.add(picturesImageStripC);
		
		JPanel numbers = new JPanel();
		numbers.setLayout(new BoxLayout(numbers, BoxLayout.PAGE_AXIS));
	    numbers.setBackground(Color.decode("#ffffaa"));
		
		JPanel numbersLabelStrip = new JPanel();
		numbersLabelStrip.setBackground(Color.decode("#bbbbbb"));
		
		JLabel numbersLabel = new JLabel("Numbers");
		numbersLabel.setFont(new Font("Arial",Font.BOLD,34));
				
		numbersLabelStrip.add(numbersLabel);
		numbers.add(numbersLabelStrip);
		
		JPanel numbersImageStripA = new JPanel();
		numbersImageStripA.setBackground(Color.decode("#bbbbbb"));
		
		JPanel numberImage1 = new JPanel();
		numberImage1.setBackground(Color.decode("#dddddd"));
		numberImage1.setPreferredSize(new Dimension(60,60));
		Icon numImage1; 	
        JLabel numLabel1;	
	    numImage1 = new ImageIcon("img/" + numberCards[0]);
		numLabel1 = new JLabel(numImage1);
		numLabel1.setPreferredSize(new Dimension(60,60));
		numberImage1.add(numLabel1);
		
		JPanel numberImage2 = new JPanel();
		numberImage2.setBackground(Color.decode("#dddddd"));
		numberImage2.setPreferredSize(new Dimension(60,60));
		Icon numImage2; 	
        JLabel numLabel2;	
	    numImage2 = new ImageIcon("img/" + numberCards[1]);
		numLabel2 = new JLabel(numImage2);
		numLabel2.setPreferredSize(new Dimension(60,60));
		numberImage2.add(numLabel2);
		
		JPanel numbersImageStripB = new JPanel();
		numbersImageStripB.setBackground(Color.decode("#bbbbbb"));
		
		JPanel numberImage3 = new JPanel();
		numberImage3.setBackground(Color.decode("#dddddd"));
		numberImage3.setPreferredSize(new Dimension(60,60));
		Icon numImage3; 	
        JLabel numLabel3;	
	    numImage3 = new ImageIcon("img/" + numberCards[2]);
		numLabel3 = new JLabel(numImage3);
		numLabel3.setPreferredSize(new Dimension(60,60));
		numberImage3.add(numLabel3);
		
		JPanel numberImage4 = new JPanel();
		numberImage4.setBackground(Color.decode("#dddddd"));
		numberImage4.setPreferredSize(new Dimension(60,60));
		Icon numImage4; 	
        JLabel numLabel4;	
	    numImage4 = new ImageIcon("img/" + numberCards[3]);
		numLabel4 = new JLabel(numImage4);
		numLabel4.setPreferredSize(new Dimension(60,60));
		numberImage4.add(numLabel4);
		
		JPanel numbersImageStripC = new JPanel();
		numbersImageStripC.setBackground(Color.decode("#bbbbbb"));
		
		JPanel numberImage5 = new JPanel();
		numberImage5.setBackground(Color.decode("#dddddd"));
		numberImage5.setPreferredSize(new Dimension(60,60));
		Icon numImage5; 	
        JLabel numLabel5;	
	    numImage5 = new ImageIcon("img/" + numberCards[4]);
		numLabel5 = new JLabel(numImage5);
		numLabel5.setPreferredSize(new Dimension(60,60));
		numberImage5.add(numLabel5);
		
		JPanel numberImage6 = new JPanel();
		numberImage6.setBackground(Color.decode("#dddddd"));
		numberImage6.setPreferredSize(new Dimension(60,60));
		Icon numImage6; 	
        JLabel numLabel6;	
	    numImage6 = new ImageIcon("img/" + numberCards[5]);
		numLabel6 = new JLabel(numImage6);
		numLabel6.setPreferredSize(new Dimension(60,60));
		numberImage6.add(numLabel6);
		
		numbersImageStripA.add(numberImage1);
		numbersImageStripA.add(numberImage2);
		numbersImageStripB.add(numberImage3);
		numbersImageStripB.add(numberImage4);
		numbersImageStripC.add(numberImage5);
		numbersImageStripC.add(numberImage6);
		
		numbers.add(numbersImageStripA);
		numbers.add(numbersImageStripB);
		numbers.add(numbersImageStripC);
		
		bottomMT.add(pictures);
		bottomMT.add(numbers);
		
		paneMT.add(bottomMT);
	  	     		
	    setSize(1000,600);
	   
	    setVisible(true);
	  
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[]args){
	     MemoryTracks memoryTracks1 = new MemoryTracks();
		
    }
}