import java.awt.*;        
import java.awt.event.*;  
import java.io.IOException;

 
public class AWTAccumulator extends Frame implements ActionListener, WindowListener {
   private Label lblInput;     
   private Label lblOutput;    
   private TextField tfInput;  
   private TextField tfOutput; 
   private int sum = 0;        
 
  
   public AWTAccumulator() {
      setLayout(new FlowLayout());
         
      lblInput = new Label("Enter an Integer: "); 
      add(lblInput);              
 
      tfInput = new TextField(10); 
      add(tfInput);                
 
      tfInput.addActionListener(this);
      addWindowListener(this);
         
      lblOutput = new Label("The Accumulated Sum is: ");  
      add(lblOutput);               
 
      tfOutput = new TextField(10); 
      tfOutput.setText(sum + "");
      tfOutput.setEditable(false);  
      add(tfOutput);                
 
      setTitle("AWT Accumulator"); 
      setSize(350, 120);  
      setLocation(850,500);
      setResizable(false);
      setVisible(true);   
   }
 
 
   public static void main(String[] args) {
       new AWTAccumulator();
   }
 
   @Override
   public void actionPerformed(ActionEvent evt) {
      int numberIn = Integer.parseInt(tfInput.getText());
      sum += numberIn;      
      tfInput.setText("");  
      tfOutput.setText(sum + ""); 
   }


@Override
public void windowActivated(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}


@Override
public void windowClosed(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}


@Override
public void windowClosing(WindowEvent arg0) {
	// TODO Auto-generated method stub
	dispose();
}


@Override
public void windowDeactivated(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}


@Override
public void windowDeiconified(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}


@Override
public void windowIconified(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}


@Override
public void windowOpened(WindowEvent arg0) {
	// TODO Auto-generated method stub
	
}
}