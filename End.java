 
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
public class End extends WindowAdapter implements ActionListener
{
    static Frame f = new Frame("The End");
    Button y,n;
    End()
    {
        Label l = new Label("Are You Sure You Wanna Exit ?");
        l.setBackground(Color.black);
        l.setForeground(Color.yellow);
        l.setBounds(100,100,1000,200);
        l.setFont(new java.awt.Font("w",Font.BOLD+Font.ITALIC,65));
        f.add(l);
        
        y = new Button("YES");
        y.setBackground(Color.cyan);
        y.setForeground(Color.yellow);
        y.setBounds(100,300,200,100);
        y.setFont(new java.awt.Font("w",Font.BOLD+Font.ITALIC,45));
        f.add(y);
        y.addActionListener(this);
        
        n = new Button("NO");
        n.setBackground(Color.cyan);
        n.setForeground(Color.yellow);
        n.setBounds(900,300,200,100);
        n.setFont(new java.awt.Font("w",Font.BOLD+Font.ITALIC,45));
        f.add(n);
        n.addActionListener(this);
    }
    @Override
    public void windowClosing(WindowEvent e)
    {
        f.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e)throws NumberFormatException
    {
        if(e.getSource()==y)
        {
            CoolBox.f.dispose();
            f.dispose();
        }
        if(e.getSource()==n)
        f.dispose();
    }
    public static void main()throws NumberFormatException
    {
        new End();             
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(1200,640);
    }
    }
