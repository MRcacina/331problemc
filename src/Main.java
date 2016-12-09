import javax.swing.*;
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
	    lblOut.setLineWrap(true);
	    p.add(lblOut, BorderLayout.NORTH);
	    tfIn = new JTextField();
	    tfIn.addActionListener(this);
	    p.add(tfIn, BorderLayout.SOUTH);
	    
	    add(p);
	    
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		setSize(250, 300);
		
	    new SwingWorker<Void, String>() { 
	         protected Void doInBackground() throws Exception { 
	            Scanner s = new Scanner(outPipe);
	            while (s.hasNextLine()) {
	            		 String line = s.nextLine();
		            	 publish(line);
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
}
