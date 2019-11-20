package hadia;

import java.awt.*;
public class get extends Panel{
        get(){
            setBackground(Color.PINK);
        }
    public void paint(Graphics g) {
        //buat badan
        g.drawLine(175, 280, 175, 160);
        //buatkaki
        g.drawLine(155, 280,175,250 );
        g.drawLine(195, 280,175,250 );
        
        //buattangan
        g.drawLine(140, 210, 175, 200);
        g.drawLine(215, 210, 175, 200);
        
        //buat kepala 
        g.drawRoundRect(145, 103, 60 , 60,60, 60);
       
        
       
     
        
        
        //buat mata dan mulut dan kacamata
        
         g.drawRoundRect(160, 125, 12, 10,10, 10);
         g.drawRoundRect(177, 125, 12, 10,10, 10);
         g.drawLine(145, 130, 155, 130);
         g.drawLine(195, 130, 205, 130);
     
        
      
    }
    public static void main(String[] args) {
        Frame f = new Frame("diriku");
       get gp = new get();
       f.add(gp);
        f.setSize(900, 900);
        f.setVisible(true);
    }
}
