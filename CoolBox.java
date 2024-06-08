 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
public class CoolBox extends WindowAdapter implements ActionListener
{
    static Frame f = new Frame("CoolBox");
   
    static int v =0,t =0;
    static Button to,go,sto;
    TextField t1,t2;
    Label n1,n2,n3,l1,l2,b,a;
    Label v1,v2,v3,v4,h1,h2,h3,h4;
    Label x1,x2,x3,x4,x5,x6,x7,x8,x9;
    static Label y1,y2,y3,y4,y5,y6,y7,y8,y9;
    Label c[] = new Label[144];
    static Button d1,d2,d3,d4,d5,d6,d7,d8,d9;
    String ce[] = {"COLA","PEPSI","FROOTI","COLA - ZERO","WATER","THUMPS UP","FIZZ","SPRITE","RED BULL"};
    static int de[] = {15,15,15,10,5,10,10,10,20};
    static int st[] = {16,16,16,16,16,16,16,16,16};
    static int q1,q2;
    static CoolBox o = new CoolBox();
    public void run()throws NumberFormatException,NullPointerException
    {
        f.addWindowListener(this);
        to = new Button("The    Cool    Box");
        to.setBounds(0,0,1200,640);
        to.setForeground(Color.cyan);
        to.setBackground(Color.black);
        to.setFont(new java.awt.Font("w",Font.BOLD+Font.ITALIC,115));
        to.addActionListener(this);
        f.add(to);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e)throws NumberFormatException
    {
        
        if(e.getSource()==to)
        {
            
            f.remove(to);
            
            sto = new Button("The    Cool    Box");   
            sto.setBounds(510,0,700,300);
            sto.setForeground(Color.cyan);
            sto.setBackground(Color.black);
            sto.setFont(new java.awt.Font("w",Font.BOLD+Font.ITALIC,60));
            f.add(sto);   
                         
            t1 = new TextField();
            t1.setBounds(800,550,220,40);
            
            t2 = new TextField();
            t2.setBounds(800,500,220,40);
           
            n1 = new Label("First Pay , Then Use");
            n1.setBounds(600,350,560,40);
            n1.setBackground(Color.yellow);
            n1.setForeground(Color.red);
            n1.setFont(new java.awt.Font("w",Font.ITALIC,40));
            
            n2 = new Label("One Brand a Time");
            n2.setBounds(600,400,560,40);
            n2.setBackground(Color.yellow);
            n2.setForeground(Color.red);
            n2.setFont(new java.awt.Font("w",Font.ITALIC,40));           
                       
            l1 = new Label("Amount Paid");
            l1.setBounds(540,550,240,40);
            l1.setFont(new java.awt.Font("w",Font.ITALIC,40));
            
            l2 = new Label("Quantity");
            l2.setBounds(620,500,200,40);
            l2.setFont(new java.awt.Font("w",Font.ITALIC,40));
            
            go = new Button("Go Ahead");
            go.setBounds(1020,540,100,60);
            go.setFont(new java.awt.Font("w",Font.BOLD,19));
            go.addActionListener(this);
            
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
            
            y1 = new Label("Rs . "+String.valueOf(de[0]));
            y1.setBounds(20,180,130,20);
            y1.setFont(new java.awt.Font("w",Font.BOLD,15));
            y2 = new Label("Rs . "+String.valueOf(de[1]));
            y2.setBounds(20,370,130,20);
            y2.setFont(new java.awt.Font("w",Font.BOLD,15));
            y3 = new Label("Rs . "+String.valueOf(de[2]));
            y3.setBounds(20,560,130,20);
            y3.setFont(new java.awt.Font("w",Font.BOLD,15));
            y4 = new Label("Rs . "+String.valueOf(de[3]));
            y4.setBounds(170,180,130,20);
            y4.setFont(new java.awt.Font("w",Font.BOLD,15));
            y5 = new Label("Rs . "+String.valueOf(de[4]));
            y5.setBounds(170,370,130,20);
            y5.setFont(new java.awt.Font("w",Font.BOLD,15));
            y6 = new Label("Rs . "+String.valueOf(de[5]));
            y6.setBounds(170,560,130,20);
            y6.setFont(new java.awt.Font("w",Font.BOLD,15));
            y7 = new Label("Rs . "+String.valueOf(de[6]));
            y7.setBounds(320,180,130,20);
            y7.setFont(new java.awt.Font("w",Font.BOLD,15));
            y8 = new Label("Rs . "+String.valueOf(de[7]));
            y8.setBounds(320,370,130,20);
            y8.setFont(new java.awt.Font("w",Font.BOLD,15));
            y9 = new Label("Rs . "+String.valueOf(de[8]));
            y9.setBounds(320,560,130,20);
            y9.setFont(new java.awt.Font("w",Font.BOLD,15));                        
            
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
               for(int j = 0;j<st[i];j++,a+=8,k2++)
               {
                   c[k2] = new Label();
                   c[k2].setBackground(Color.green);
                   c[k2].setBounds(a,b,6,20);
                   f.add(c[k2]);
                   
               }
            }
            
            f.add(v1);
            f.add(v2);
            f.add(v3);
            f.add(v4);
            f.add(h1);
            f.add(h2);
            f.add(h3);
            f.add(h4);
            f.add(go);
            f.add(t1);
            f.add(t2);
            f.add(n1);
            f.add(n2);
                        
            f.add(l1);
            f.add(l2);
            
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
                  
            f.add(y1);
            f.add(y2);
            f.add(y3);
            f.add(y4);
            f.add(y4);
            f.add(y5);
            f.add(y6);
            f.add(y7);
            f.add(y8);
            f.add(y9);    
              
        } 
        
        String w = t2.getText();
        String q3 = t1.getText();
        if(!(w.equals("")))
        q2 = Integer.parseInt(w);
        if(!(q3.equals("")))
        q1 = Integer.parseInt(q3);
        if(q1>0&&q2>0)
        {
            if(q1 <=((20*q2)+100)&&q1>=(5*q2))
            {            
                if(e.getSource()==go)
                {
                    v+=q2;
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
    
                    f.remove(go);
                    f.remove(t1);
                    f.remove(t2);
                    f.remove(n1);
                    f.remove(n2); 
                                   
                    f.remove(l1);
                    f.remove(l2);
                                   
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
                                             
                    d1.addActionListener(this);
                    d2.addActionListener(this);
                    d3.addActionListener(this);
                    d4.addActionListener(this);
                    d5.addActionListener(this);
                    d6.addActionListener(this);
                    d7.addActionListener(this);
                    d8.addActionListener(this);
                    d9.addActionListener(this);
                                   
                    f.add(d1);
                    f.add(d2);
                    f.add(d3);
                    f.add(d4);
                    f.add(d5);
                    f.add(d6);
                    f.add(d7);
                    f.add(d8);
                    f.add(d9);
                    
                }
            }
            else if(q2==963&&q1==487)
            
                Sales.main();
            
            else if(q2==45&&q1==89)
            {
                Stocker.main(); 
                
            }
            else if(q2==890&&q1==315)
            
                End.main();
            
            else
            {
                if(q2>16)
                JOptionPane.showMessageDialog(null,"Too Many Cans");
                else
                JOptionPane.showMessageDialog(null,"Enter an Amount Lesser than Rs."+((20*q2)+100)+" and Greater than Rs."+q2*5);
            }
        }
                              
        int z =0;
        
        for(int i =0;i<1;i++)
        {
            if(e.getSource()==d1)
            {
                t+=de[0]*q2;
                if(st[0]==0)
                {
                    JOptionPane.showMessageDialog(null,"Out of Stock");
                    i=0;continue;
                }
                if(st[0]<q2)
                {
                    JOptionPane.showMessageDialog(null,"Insufficient Cans");
                    i=0;continue;
                }
                if(q1<de[0]*q2)
                {                    
                    JOptionPane.showMessageDialog(null,"You have Paid only Rs."+q1+" \nChoose another Can");
                    i=0;continue;
                }
                
                st[0]-=q2;
                
                n2 = new Label("Your Drink    :   "+ce[0]+" (X "+q2+")");
                n2.setFont(new java.awt.Font("w",Font.BOLD,25)); 
                n2.setBounds(620,400,480,30);
                n2.setBackground(Color.cyan);
                f.add(n2);
                
                n3 = new Label("Price              :   Rs."+de[0]*q2);
                n3.setFont(new java.awt.Font("w",Font.BOLD,25)); 
                n3.setBounds(620,450,350,30);
                n3.setBackground(Color.cyan);
                f.add(n3);
                
                x1 = new Label("Balance         :   Rs."+(q1-(de[0]*q2)));
                x1.setBounds(620,500,350,30);
                x1.setFont(new java.awt.Font("w",Font.BOLD,25));
                x1.setBackground(Color.cyan);
                f.add(x1);
                try
                {
                o.remov();
                }
                catch(InterruptedException p)
                {
                    System.exit(0);
                }
                CoolBox.main();                                
            }
            
            if(e.getSource()==d2)
            {
                if(st[1]==0)
                {
                    JOptionPane.showMessageDialog(null,"Out of Stock");
                    i=0;continue;
                }
                if(st[1]<q2)
                {
                    JOptionPane.showMessageDialog(null,"Insufficient Cans");
                    i=0;continue;
                }
                if(q1<de[1]*q2)
                {
                    JOptionPane.showMessageDialog(null,"You have Paid only Rs."+q1+" \nChoose another Can");
                    i=0;continue;
                }
                
                st[1]-=q2;
                
                n2 = new Label("Your Drink    :   "+ce[1]+" (X "+q2+")");
                n2.setFont(new java.awt.Font("w",Font.BOLD,25)); 
                n2.setBounds(620,400,480,30);
                n2.setBackground(Color.cyan);
                f.add(n2);
                                
                n3 = new Label("Price              :   Rs."+de[1]*q2);
                n3.setFont(new java.awt.Font("w",Font.BOLD,25)); 
                n3.setBounds(620,450,350,30);
                n3.setBackground(Color.cyan);
                f.add(n3);
                
                x1 = new Label("Balance         :   Rs."+(q1-(de[1]*q2)));
                x1.setBounds(620,500,350,30);
                x1.setFont(new java.awt.Font("w",Font.BOLD,25));
                x1.setBackground(Color.cyan);
                f.add(x1);
                
                try
                {
                o.remov();
                }
                catch(InterruptedException p)
                {
                    System.exit(0);
                }
                t+=de[1]*q2;
                CoolBox.main();
            }
            
            if(e.getSource()==d3)
            {
                if(st[2]==0)
                {
                    JOptionPane.showMessageDialog(null,"Out of Stock");
                    i=0;continue;
                }
                if(st[2]<q2)
                {
                    JOptionPane.showMessageDialog(null,"Insufficient Cans");
                    i=0;continue;
                }
                if(q1<de[2]*q2)
                {                             
                    JOptionPane.showMessageDialog(null,"You have Paid only Rs."+q1+" \nChoose another Can");
                    i=0;continue;
                }
                
                st[2]-=q2;
                
                n2 = new Label("Your Drink    :   "+ce[2]+" (X "+q2+")");
                n2.setFont(new java.awt.Font("w",Font.BOLD,25)); 
                n2.setBounds(620,400,480,30);
                n2.setBackground(Color.cyan);
                f.add(n2);
                                                            
                n3 = new Label("Price              :   Rs."+de[2]*q2);
                n3.setFont(new java.awt.Font("w",Font.BOLD,25)); 
                n3.setBounds(620,450,350,30);
                n3.setBackground(Color.cyan);
                f.add(n3);
                
                x1 = new Label("Balance         :   Rs."+(q1-(de[2]*q2)));
                x1.setBounds(620,500,350,30);
                x1.setFont(new java.awt.Font("w",Font.BOLD,25));
                x1.setBackground(Color.cyan);
                f.add(x1);
                               
                try
                {
                o.remov();
                }
                catch(InterruptedException p)
                {
                    System.exit(0);
                }
                CoolBox.main();
            }
            
            if(e.getSource()==d4)
            {
                if(st[3]==0)
                {
                    JOptionPane.showMessageDialog(null,"Out of Stock");
                    i=0;continue;
                }
                if(st[3]<q2)
                {
                    JOptionPane.showMessageDialog(null,"Insufficient Cans");
                    i=0;continue;
                }
                if(q1<de[3]*q2)
                {           
                    JOptionPane.showMessageDialog(null,"You have Paid only Rs."+q1+" \nChoose another Can");
                    i=0;continue;
                }
                
                st[3]-=q2;
                
                n2 = new Label("Your Drink    :   "+ce[3]+" (X "+q2+")");
                n2.setFont(new java.awt.Font("w",Font.BOLD,25)); 
                n2.setBounds(620,400,480,30);
                n2.setBackground(Color.cyan);
                f.add(n2);
                                
                n3 = new Label("Price              :   Rs."+de[3]*q2);
                n3.setFont(new java.awt.Font("w",Font.BOLD,25)); 
                n3.setBounds(620,450,350,30);
                n3.setBackground(Color.cyan);
                f.add(n3);
                
                x1 = new Label("Balance         :   Rs."+(q1-(de[3]*q2)));
                x1.setBounds(620,500,350,30);
                x1.setFont(new java.awt.Font("w",Font.BOLD,25));
                x1.setBackground(Color.cyan);
                f.add(x1);
                
                try
                {
                o.remov();
                }
                catch(InterruptedException p)
                {
                    System.exit(0);
                }
                t+=de[3]*q2;
                CoolBox.main();
            }
            
            if(e.getSource()==d5)
            {
                if(st[4]==0)
                {
                    JOptionPane.showMessageDialog(null,"Out of Stock");
                    i=0;continue;
                }
                if(st[4]<q2)
                {
                    JOptionPane.showMessageDialog(null,"Insufficient Cans");
                    i=0;continue;
                }
                if(q1<de[4]*q2)
                {            
                    JOptionPane.showMessageDialog(null,"You have Paid only Rs."+q1+" \nChoose another Can");
                    i=0;continue;
                }
                
                st[4]-=q2;
                
                n2 = new Label("Your Drink    :   "+ce[4]+" (X "+q2+")");
                n2.setFont(new java.awt.Font("w",Font.BOLD,25)); 
                n2.setBounds(620,400,480,30);
                n2.setBackground(Color.cyan);
                f.add(n2);
                                
                n3 = new Label("Price              :   Rs."+de[4]*q2);
                n3.setFont(new java.awt.Font("w",Font.BOLD,25)); 
                n3.setBounds(620,450,350,30);
                n3.setBackground(Color.cyan);
                f.add(n3);
                
                x1 = new Label("Balance         :   Rs."+(q1-(de[4]*q2)));
                x1.setBounds(620,500,350,30);
                x1.setFont(new java.awt.Font("w",Font.BOLD,25));
                x1.setBackground(Color.cyan);
                f.add(x1);
                
                try
                {
                o.remov();
                }
                catch(InterruptedException p)
                {
                    System.exit(0);
                }
                t+=de[4]*q2;
                CoolBox.main();
            }
            
            if(e.getSource()==d6)
            {
                if(st[5]==0)
                {
                    JOptionPane.showMessageDialog(null,"Out of Stock");
                    i=0;continue;
                }
                if(st[5]<q2)
                {
                    JOptionPane.showMessageDialog(null,"Insufficient Cans");
                    i=0;continue;
                }
                if(q1<de[5]*q2)
                {              
                    JOptionPane.showMessageDialog(null,"You have Paid only Rs."+q1+" \nChoose another Can");
                    i=0;continue;
                } 
                
                st[5]-=q2;
                
                n2 = new Label("Your Drink    :   "+ce[5]+" (X "+q2+")");
                n2.setFont(new java.awt.Font("w",Font.BOLD,25)); 
                n2.setBounds(620,400,480,30);
                n2.setBackground(Color.cyan);
                f.add(n2);
                                
                n3 = new Label("Price              :   Rs."+de[5]*q2);
                n3.setFont(new java.awt.Font("w",Font.BOLD,25)); 
                n3.setBounds(620,450,350,30);
                n3.setBackground(Color.cyan);
                f.add(n3);
                
                x1 = new Label("Balance         :   Rs."+(q1-(de[6]*q2)));
                x1.setBounds(620,500,350,30);
                x1.setFont(new java.awt.Font("w",Font.BOLD,25));
                x1.setBackground(Color.cyan);
                f.add(x1);
                
                try
                {
                o.remov();
                }
                catch(InterruptedException p)
                {
                    System.exit(0);
                }
                t+=de[5]*q2;
                CoolBox.main();
            }
            
            if(e.getSource()==d7)
            {
                if(st[6]==0)
                {
                    JOptionPane.showMessageDialog(null,"Out of Stock");
                    i=0;continue;
                }
                if(st[6]<q2)
                {
                    JOptionPane.showMessageDialog(null,"Insufficient Cans");
                    i=0;continue;
                }
                if(q1<de[6]*q2)
                {              
                    JOptionPane.showMessageDialog(null,"You have Paid only Rs."+q1+" \nChoose another Can");
                    i=0;continue;
                }
                
                st[6]-=q2;
                
                n2 = new Label("Your Drink    :   "+ce[6]+" (X "+q2+")");
                n2.setFont(new java.awt.Font("w",Font.BOLD,25)); 
                n2.setBounds(620,400,480,30);
                n2.setBackground(Color.cyan);
                f.add(n2);
                                
                n3 = new Label("Price              :   Rs."+de[6]*q2);
                n3.setFont(new java.awt.Font("w",Font.BOLD,25)); 
                n3.setBounds(620,450,350,30);
                n3.setBackground(Color.cyan);
                f.add(n3);
                
                x1 = new Label("Balance         :   Rs."+(q1-(de[6]*q2)));
                x1.setBounds(620,500,350,30);
                x1.setFont(new java.awt.Font("w",Font.BOLD,25));
                x1.setBackground(Color.cyan);
                f.add(x1);
                
                try
                {
                o.remov();
                }
                catch(InterruptedException p)
                {
                    System.exit(0);
                }
                t+=de[6]*q2;
                CoolBox.main();
            }
            
            if(e.getSource()==d8)
            {
                if(st[7]==0)
                {
                    JOptionPane.showMessageDialog(null,"Out of Stock");
                    i=0;continue;
                }
                if(st[7]<q2)
                {
                    JOptionPane.showMessageDialog(null,"Insufficient Cans");
                    i=0;continue;
                }
                if(q1<de[7]*q2)
                {             
                    JOptionPane.showMessageDialog(null,"You have Paid only Rs."+q1+" \nChoose another Can");
                    i=0;continue;
                }
                
                st[7]-=q2;
                
                n2 = new Label("Your Drink    :   "+ce[7]+" (X "+q2+")");
                n2.setFont(new java.awt.Font("w",Font.BOLD,25)); 
                n2.setBounds(620,400,480,30);
                n2.setBackground(Color.cyan);
                f.add(n2);
                                
                n3 = new Label("Price              :   Rs."+de[7]*q2);
                n3.setFont(new java.awt.Font("w",Font.BOLD,25)); 
                n3.setBounds(620,450,350,30);
                n3.setBackground(Color.cyan);
                f.add(n3);
                
                x1 = new Label("Balance         :   Rs."+(q1-(de[7]*q2)));
                x1.setBounds(620,500,350,30);
                x1.setFont(new java.awt.Font("w",Font.BOLD,25));
                x1.setBackground(Color.cyan);
                f.add(x1);
                 
                try
                {
                o.remov();
                }
                catch(InterruptedException p)
                {
                    System.exit(0);
                }
                t+=de[7]*q2;
                CoolBox.main();
            }
            
            if(e.getSource()==d9)
            {
                if(st[8]==0)
                {
                    JOptionPane.showMessageDialog(null,"Out of Stock");
                    i=0;continue;
                }
                if(st[8]<q2)
                {
                    JOptionPane.showMessageDialog(null,"Insufficient Cans");
                    i=0;continue;
                }
                if(q1<de[8]*q2)
                {             
                    JOptionPane.showMessageDialog(null,"You have Paid only Rs."+q1+" \nChoose another Can");
                    i=0;continue;
                }
                             
                st[8]-=q2;
                
                n2 = new Label("Your Drink    :   "+ce[8]+" (X "+q2+")");
                n2.setFont(new java.awt.Font("w",Font.BOLD,25)); 
                n2.setBounds(620,400,480,30);
                n2.setBackground(Color.cyan);
                f.add(n2);
                                
                n3 = new Label("Price              :   Rs."+de[8]*q2);
                n3.setFont(new java.awt.Font("w",Font.BOLD,25)); 
                n3.setBounds(620,450,350,30);
                n3.setBackground(Color.cyan);
                f.add(n3);
                
                x1 = new Label("Balance         :   Rs."+(q1-(de[8]*q2)));
                x1.setBounds(620,500,350,30);
                x1.setFont(new java.awt.Font("w",Font.BOLD,25));
                x1.setBackground(Color.cyan);
                f.add(x1);
                try
                {
                o.remov();
                }
                catch(InterruptedException p)
                {
                    System.exit(0);
                }
                t+=de[8]*q2;                
                CoolBox.main();
            }
        }
                
    }
    public void remov()throws InterruptedException
    {
 
        b = new Label();
        b.setBounds(600,350,500,200);
        b.setBackground(Color.cyan);
        f.add(b);
        
        n1 = new Label("                     Bill");
        n1.setFont(new java.awt.Font("w",Font.BOLD,35)); 
        n1.setBounds(600,300,500,50);
        f.add(n1);
        Thread.sleep(5000);
        f.remove(x1);                                  
        f.remove(v1);
        f.remove(v2);
        f.remove(v3);
        f.remove(v4);
        f.remove(h1);
        f.remove(h2);
        f.remove(h3);
        f.remove(h4);
        f.remove(sto);
        f.remove(d1);
        f.remove(d2);
        f.remove(d3);
        f.remove(d4);
        f.remove(d5);
        f.remove(d6);
        f.remove(d7);
        f.remove(d8);
        f.remove(d9);
        f.remove(b);
        f.remove(n1);
        f.remove(n2);
        f.remove(n3);
        f.remove(y1);
        f.remove(y2);
        f.remove(y3);
        f.remove(y4);
        f.remove(y5);
        f.remove(y6);
        f.remove(y7);
        f.remove(y8);
        f.remove(y9);
        for(int q = 0;q<144;q++)
        f.remove(c[q]);    
    }
    
    public static void main()throws NumberFormatException
    {
        
        o.run();       
        
        f.dispose();
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(1200,640);
        
    }
}
