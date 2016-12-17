import javax.swing.*;
import javax.swing.text.DefaultCaret;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Main extends JFrame implements ActionListener {

	JTextField tfIn;
	JTextArea lblOut;
	

	private final PipedInputStream inPipe = new PipedInputStream(); 
    private final PipedInputStream outPipe = new PipedInputStream(); 

	PrintWriter inWriter;
	
	
	Main(GUI gb) throws InterruptedException {
		super("Bus Operations");

	 
	    // 2. set the System.in and System.out streams 
	    System.setIn(inPipe); 
	    try {
	    	System.setOut(new PrintStream(new PipedOutputStream(outPipe), true)); 
	    	inWriter = new PrintWriter(new PipedOutputStream(inPipe), true); 
	    }
	    catch(IOException e) {
	    	System.out.println("Error: " + e);
	    	return;
	    }
	    
	    JPanel p = new JPanel(new BorderLayout());
	    lblOut = new JTextArea();
	    lblOut.setSize(p.getWidth(),200);
	    lblOut.setLineWrap(true);
	    DefaultCaret caret = (DefaultCaret)lblOut.getCaret();
	    caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
	    p.add(lblOut, BorderLayout.NORTH);
	    tfIn = new JTextField();
	    tfIn.addActionListener(this);
	    p.add(tfIn, BorderLayout.SOUTH);
	    
	    add(p);
	    
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		setSize(500, 900);
		
	    new SwingWorker<Void, String>() { 
	         protected Void doInBackground() throws Exception { 
	            Scanner s = new Scanner(outPipe);
	            String line="";
	            while (s.hasNextLine()) {
	            		 
	            		 line += "\n" + s.nextLine();
		            	 publish(line);
		            	 if(countLines(line) > 40){
		            		 line = line.substring(40,line.length()-1);
	            		 }
		            	 
	            }
	            return null; 
	        } 
	         @Override protected void process(java.util.List<String> chunks) { 
	             for (String line : chunks) lblOut.setText(line); 
	         } 

	    }.execute(); 

		gb.play();
		
	}
	
	public void actionPerformed(ActionEvent e) {
		String text = tfIn.getText();
		tfIn.setText("");
		inWriter.println(text); 
		

	}
	public static void main(String[] args) throws InterruptedException {
		GUI gb = new GUI();
		new Main(gb);
	}
	
	private static int countLines(String str){
		   String[] lines = str.split("\r\n|\r|\n");
		   return  lines.length;
		}
}
