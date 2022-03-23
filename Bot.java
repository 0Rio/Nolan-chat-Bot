import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Bot 
{
	
//public JPanel pane = new JPanel();
protected JTextArea chatarea = new JTextArea();
private JTextField chatbox = new JTextField();
chatFunctions chatU = new chatFunctions();
JScrollPane scrollableTextArea = new JScrollPane();  
protected JFrame frame = new JFrame();



//data types
String reply;
ImageIcon icon;
private static final int EXIT_ON_CLOSE = 1;


//fonts
Font vamp = new Font("Vampire", Font.BOLD, 15);




public Bot(){
  
 
    //Frame
   
    frame.setSize(700, 800);
    frame.setVisible(true);
    frame.setTitle("nolan");
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setResizable(false);
   
    
    //pane
    frame.add(chatarea);
    frame.add(chatbox);
    frame.add(scrollableTextArea);
   frame.setVisible(true);

    // text area
    chatarea.setSize(670, 670);
    chatarea.setLocation(4, 2);
     

    //icon 
    icon = new ImageIcon("Images/logo.jpeg");
    frame.setIconImage(icon.getImage());

    //background
    frame.getContentPane().setBackground(Color.GRAY);
   chatarea.setBackground(Color.BLACK);
  chatarea.setForeground(Color.WHITE);
  

 // optional
 //chatarea.setFont(vamp); 
 //chatbox.setBackground(new Color(153,153,153));
  //chatbox.setForeground(Color.WHITE);

    // text field
    chatbox.setSize(670, 30);
    chatbox.setLocation(2, 700);
    chatbox.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {
           String gtext = chatbox.getText();
           if(!(gtext.equals(" "))) {
           chatarea.append("YOU ==> "+gtext+"\n");

           chatbox.setText(" ");
         
          gtext.toLowerCase();
        
           try {
			reply =  chatU.chat(gtext);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
           
	
        reply(reply);
           }
           
        }
        
    });
   
}
public void reply(String st) {
           
    chatarea.append("Nolan==> "+st+"\n");
   
}


}
