 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
public class Stocker extends WindowAdapter implements ActionListener
{
    static Frame f = new Frame("Stocker");
    Button goo,sto;    
    JPasswordField p;
    Label l2,n1,n2,n3,o;
    Label x1,x2,x3,x4,x5,x6,x7,x8,x9;
    Label y1,y2,y3,y4,y5,y6,y7,y8,y9;
    Label v1,v2,v3,v4,h1,h2,h3,h4;
    Label c[] = new Label[145];
    Button d1,d2,d3,d4,d5,d6,d7,d8,d9;
    String ce[] = {"COLA","PEPSI","FROOTI","COLA - ZERO","WATER","THUMPS UP","FIZZ","SPRITE","RED BULL"};
    int de[] = {15,15,15,10,5,10,10,10,20};
    int u[] = new int[9];
    static Stocker s = new Stocker();
    public void label()
    {
        int a = 0,b = 0,k2 = 0;
    
        for(int i = 0;i<9;i++)
        {
           if(i==0)
           {
               a = 23;
               b = 63;
            }
           if(i==1)
           {
               a = 23;
               b = 253;
           }
           if(i==2)
           {
               a = 23;
               b = 443;
           }
           if(i==3)
           {
               a = 173;
               b = 63;
           }
           if(i==4)
           {
               a = 173;
               b = 253;
           }
           if(i==5)
           {
               a = 173;
               b = 443;
           }
           if(i==6)
           {
               a = 323;
               b = 63;
           }
           if(i==7)
           {
               a = 323;
               b = 253;
           }
           if(i==8)
           {
               a = 323;
               b = 443;
           }
           for(int j = 0;j<CoolBox.st[i];j++,a+=8,k2++)
           {
               c[k2] = new Label();
               c[k2].setBackground(Color.green);
               c[k2].setBounds(a,b,6,20);
               f.add(c[k2]);
               
           }
        }
    }
    
    public void run()
    {
        
        int ss =0;
        for(int i =0;i<9;i++)
        ss+=CoolBox.st[i];
        if(ss==144)
        f.dispose();
        
        
        
        f.addWindowListener(this);
        sto = new Button("The    Cool    Box");   
        sto.setBounds(510,0,700,300);
        sto.setForeground(Color.cyan);
        sto.setBackground(Color.black);
        sto.setFont(new java.awt.Font("w",Font.BOLD+Font.ITALIC,60));
        f.add(sto);   
        
        l2 = new Label("Quantity");
        l2.setBounds(620,500,200,40);
        l2.setFont(new java.awt.Font("w",Font.ITALIC,40));       
       
        p = new JPasswordField();
        p.setBounds(800,500,220,40);
       
        goo = new Button("Go Ahead");
        goo.setBounds(1020,540,100,60);
        goo.setFont(new java.awt.Font("w",Font.BOLD,19));
        goo.addActionListener(this);
        
        x1 = new Label(ce[0]);
        x1.setBounds(20,120,130,20);
        x1.setFont(new java.awt.Font("w",Font.BOLD,20));
        x2 = new Label(ce[1]);
        x2.setBounds(20,310,130,20);
        x2.setFont(new java.awt.Font("w",Font.BOLD,20));
        x3 = new Label(ce[2]);
        x3.setBounds(20,500,130,20);
        x3.setFont(new java.awt.Font("w",Font.BOLD,20));
        x4 = new Label(ce[3]);
        x4.setBounds(170,120,130,20);
        x4.setFont(new java.awt.Font("w",Font.BOLD,20));
        x5 = new Label(ce[4]);
        x5.setBounds(170,310,130,20);
        x5.setFont(new java.awt.Font("w",Font.BOLD,20));
        x6 = new Label(ce[5]);
        x6.setBounds(170,500,130,20);
        x6.setFont(new java.awt.Font("w",Font.BOLD,20));
        x7 = new Label(ce[6]);
        x7.setBounds(320,120,130,20);
        x7.setFont(new java.awt.Font("w",Font.BOLD,20));
        x8 = new Label(ce[7]);
        x8.setBounds(320,310,130,20);
        x8.setFont(new java.awt.Font("w",Font.BOLD,20));
        x9 = new Label(ce[8]);
        x9.setBounds(320,500,130,20);
        x9.setFont(new java.awt.Font("w",Font.BOLD,20));                        
            
        v1 = new Label();
        v1.setBackground(Color.red);
        v1.setBounds(0, 0, 20, 700);
        v2 = new Label();
        v2.setBackground(Color.red);
        v2.setBounds(150, 0, 20, 700);
        v3 = new Label();
        v3.setBackground(Color.red);
        v3.setBounds(300, 0, 20, 700);
        v4 = new Label();
        v4.setBackground(Color.red);
        v4.setBounds(450, 0, 60, 700);
        h1 = new Label();
        h1.setBackground(Color.red);
        h1.setBounds(0, 0, 500, 60);
        h2 = new Label();
        h2.setBackground(Color.red);
        h2.setBounds(0, 230, 500, 20);
        h3 = new Label();
        h3.setBackground(Color.red);
        h3.setBounds(0, 420, 500, 20);
        h4 = new Label();
        h4.setBackground(Color.red);
        h4.setBounds(0, 610, 500, 90); 
        
        f.add(x1);
        f.add(x2);
        f.add(x3);
        f.add(x4);
        f.add(x4);
        f.add(x5);
        f.add(x6);
        f.add(x7);
        f.add(x8);
        f.add(x9);

        f.add(v1);
        f.add(v2);
        f.add(v3);
        f.add(v4);
        f.add(h1);
        f.add(h2);
        f.add(h3);
        f.add(h4);
        f.add(goo);
        
        f.add(p);
        f.add(l2);
        
        s.label();
        
    }
    
    @Override
    public void windowClosing(WindowEvent e)
    {
        f.remove(d1);
        f.remove(d2);
        f.remove(d3);
        f.remove(d4);
        f.remove(d5);
        f.remove(d6);
        f.remove(d7);
        f.remove(d8);
        f.remove(d9);
        f.remove(v1);
        f.remove(v2);
        f.remove(v3);
        f.remove(v4);
        f.remove(h1);
        f.remove(h2);
        f.remove(h3);
        f.remove(h4);
        f.removeAll();
        f.validate();
        
        f.dispose();
        
    }
    public void sleep()throws InterruptedException
    {
        Thread.sleep(3000);
        f.remove(o);
    }
    @Override
    public void actionPerformed(ActionEvent e)throws NumberFormatException
    {
                
        String w = new String(p.getPassword());
        
        if(w.equals("Sip"))
        {
                      
            d1 = new Button(ce[0]);
            d1.setFont(new java.awt.Font("w",Font.BOLD,20));
            d1.setBounds(20, 60, 130, 170);
            d2 = new Button(ce[1]);
            d2.setFont(new java.awt.Font("w",Font.BOLD,20));
            d2.setBounds(20, 250, 130, 170);
            d3 = new Button(ce[2]);
            d3.setFont(new java.awt.Font("w",Font.BOLD,20));
            d3.setBounds(20, 440, 130, 170);
            d4 = new Button(ce[3]);
            d4.setFont(new java.awt.Font("w",Font.BOLD,20));
            d4.setBounds(170, 60, 130, 170);
            d5 = new Button(ce[4]);
            d5.setFont(new java.awt.Font("w",Font.BOLD,20));
            d5.setBounds(170, 250, 130, 170);
            d6 = new Button(ce[5]);
            d6.setFont(new java.awt.Font("w",Font.BOLD,20));
            d6.setBounds(170, 440, 130, 170);
            d7 = new Button(ce[6]);
            d7.setFont(new java.awt.Font("w",Font.BOLD,20));
            d7.setBounds(320, 60, 130, 170);
            d8 = new Button(ce[7]);
            d8.setFont(new java.awt.Font("w",Font.BOLD,20));
            d8.setBounds(320, 250, 130, 170);
            d9 = new Button(ce[8]);
            d9.setFont(new java.awt.Font("w",Font.BOLD,20));
            d9.setBounds(320, 440, 130, 170);
            
            f.remove(sto);
            f.remove(x1);
            f.remove(x2);
            f.remove(x3);
            f.remove(x4);
            f.remove(x4);
            f.remove(x5);
            f.remove(x6);
            f.remove(x7);
            f.remove(x8);
            f.remove(x9);
            f.remove(p);
            f.remove(goo);
            f.remove(l2);              
            
            f.add(d1);
            f.add(d2);
            f.add(d3);
            f.add(d4);
            f.add(d5);
            f.add(d6);
            f.add(d7);
            f.add(d8);
            f.add(d9); 
            
            d1.addActionListener(this);
            d2.addActionListener(this);
            d3.addActionListener(this);
            d4.addActionListener(this);
            d5.addActionListener(this);
            d6.addActionListener(this);
            d7.addActionListener(this);
            d8.addActionListener(this);
            d9.addActionListener(this);
            
            for(int i= 0;i<9;i++)
            u[i]=CoolBox.st[i];
            
            int sy =0;  
            int i=0;
            for(;i<1;i++)
            {
                
                if(e.getActionCommand().equals("COLA"))
                {                     
                    sy = 16-u[0];
                    if(sy==0)
                    continue;
                    
                    o = new Label(sy+" Slots Remaining,Click Exit after Refill");
                    o.setBounds(900,500,300,20);
                    f.add(o);      
                    CoolBox.st[0] = 16;
                    
                    
                    try{s.sleep();}catch(InterruptedException v){}
                    break;
                }
                
                if(e.getActionCommand().equals("PEPSI"))
                {                   
                    sy = 16-u[1];
                    if(sy==0)
                    continue;
                    
                    o = new Label(sy+" Slots Remaining,Click Exit after Refill");
                    o.setBounds(900,500,300,20);
                    f.add(o);                   
                    CoolBox.st[1] = 16; 
                    
                    
                    try{s.sleep();}catch(InterruptedException v){}
                    break;
                }
                
                if(e.getActionCommand().equals("FROOTI"))
                {
                    sy = 16-u[2];
                    if(sy==0)
                    continue;
                    
                    o = new Label(sy+" Slots Remaining,Click Exit after Refill");
                    o.setBounds(900,500,300,20);
                    f.add(o);                   
                    CoolBox.st[2] = 16; 
                    
                    try{s.sleep();}catch(InterruptedException v){}
                    break;                 
                }
                
                if(e.getActionCommand().equals("COLA - ZERO"))
                {
                    sy = 16-u[3];
                    if(sy==0)
                    continue;
                    
                    o = new Label(sy+" Slots Remaining,Click Exit after Refill");
                    o.setBounds(900,500,300,20);
                    f.add(o);                   
                    CoolBox.st[3] = 16; 
                    
                    try{s.sleep();}catch(InterruptedException v){}
                    break;
                }
                
                if(e.getActionCommand().equals("WATER"))
                {
                    sy = 16-u[4];
                    if(sy==0)
                    continue;
                    
                    o = new Label(sy+" Slots Remaining,Click Exit after Refill");
                    o.setBounds(900,500,300,20);
                    f.add(o);                   
                    CoolBox.st[4] = 16; 
                    
                    try{s.sleep();}catch(InterruptedException v){}
                    break;
                }
                
                if(e.getActionCommand().equals("THUMPS UP"))
                {
                    sy = 16-u[5];
                    if(sy==0)
                    continue;
                    
                    o = new Label(sy+" Slots Remaining,Click Exit after Refill");
                    o.setBounds(900,500,300,20);
                    f.add(o);                   
                    CoolBox.st[5] = 16;  
                    
                    try{s.sleep();}catch(InterruptedException v){}
                    break;
                }
                
                if(e.getActionCommand().equals("FIZZ"))
                {
                    sy = 16-u[6];  
                    if(sy==0)
                    continue;
                    
                    o = new Label(sy+" Slots Remaining,Click Exit after Refill");
                    o.setBounds(900,500,300,20);
                    f.add(o);                   
                    CoolBox.st[6] = 16; 
                    
                    try{s.sleep();}catch(InterruptedException v){}
                    break;
                }
                
                if(e.getActionCommand().equals("SPRITE"))
                {
                    sy = 16-u[7];
                    if(sy==0)
                    continue;
                    
                    o = new Label(sy+" Slots Remaining,Click Exit after Refill");
                    o.setBounds(900,500,300,20);
                    f.add(o);                   
                    CoolBox.st[7] = 16;  
                    
                    try{s.sleep();}catch(InterruptedException v){}
                    break;
                }
                
                if(e.getActionCommand().equals("RED BULL"))
                {
                    sy = 16-u[8];
                    if(sy==0)
                    continue;
                    
                    o = new Label(sy+" Slots Remaining,Click Exit after Refill");
                    o.setBounds(900,500,300,20);
                    f.add(o);                   
                    CoolBox.st[8] = 16;  
                    
                    try{s.sleep();}catch(InterruptedException v){}
                    break;       
                }
                
            }    
            System.out.println('\f');
            
        }  
        
    }        
    
    public static void main()
    {
        
        s.run();
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(1200,640);      
    }

}

