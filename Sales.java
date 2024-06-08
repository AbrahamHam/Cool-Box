
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
public class Sales extends WindowAdapter 
{
    static Frame f = new Frame("Sales");
    Sales()
    {
        f.addWindowListener(this);
        
        Label j = new Label("Sales");
        j.setBackground(Color.yellow);
        j.setForeground(Color.black);
        j.setBounds(100,40,1000,100);
        j.setFont(new java.awt.Font("w",Font.BOLD+Font.ITALIC,35));
        f.add(j);
        
        String cs = Integer.toString(CoolBox.v);
        Label c = new Label("No. of Cans Sold         :   "+cs);
        c.setBackground(Color.yellow);
        c.setForeground(Color.black);
        c.setFont(new java.awt.Font("w",Font.BOLD+Font.ITALIC,25));
        c.setBounds(100,200,1000,60);
        f.add(c);
        
        String ts = Integer.toString(CoolBox.t);
        Label t = new Label("Total Amount Recieved   :   "+ts);
        t.setBackground(Color.yellow);
        t.setForeground(Color.black);
        t.setFont(new java.awt.Font("w",Font.BOLD+Font.ITALIC,25));
        t.setBounds(100,300,1000,60);
        f.add(t);
                
    }
    
    public void windowClosing(WindowEvent e)
    {
        f.dispose();
    }
    
    public static void main()
    {
        new Sales();             
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(1200,640);
    }
}