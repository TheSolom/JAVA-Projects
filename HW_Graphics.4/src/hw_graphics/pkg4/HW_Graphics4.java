package hw_graphics.pkg4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.QuadCurve2D;
import javax.swing.JFrame;

class jframe extends JFrame
{
    @Override
    public void paint(Graphics g) 
    {
        super.paint(g);
        g.setColor(Color.BLUE);
        Graphics2D gg=(Graphics2D)g;
     
        g.fill3DRect(200, 400, 300, 253,true);
       
        int x[]={200,500,350};
        int y[]={300,300,200};
        g.fillPolygon(x, y, 3);
    
        g.setColor(Color.GREEN);

        int v[]={200,250,250,450,450,500};
    
        int z[]={400,450,650,650,450,400};
        g.drawPolyline(v, z, 6);
        
        gg.draw(new QuadCurve2D.Double(205, 300, 180, 330, 220, 330) );
        
        gg.draw(new QuadCurve2D.Double(500, 300, 525, 330, 485, 330) );
 
        gg.draw( new CubicCurve2D.Double(220, 330, 160, 350, 250,380 ,200 , 400));
        
        gg.draw( new CubicCurve2D.Double(485, 330, 540, 350, 450,380 ,500 , 400));
    }
}

public class HW_Graphics4
{
    public static void main(String[] args)
    {
        jframe jf = new jframe();
        jf.setVisible(true); 
        jf.getContentPane().setBackground(Color.black);
        jf.setSize(700, 700);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setTitle("اسلام اشرف رمضان - 5");
    }
    
}
