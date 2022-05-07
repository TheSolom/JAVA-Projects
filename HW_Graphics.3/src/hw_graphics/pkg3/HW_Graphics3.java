package hw_graphics.pkg3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;
import javax.swing.JFrame;

class jframe extends JFrame
{
    @Override
    public void paint(Graphics g) 
    {
        super.paint(g);
        Graphics2D gg=(Graphics2D)g;

        Path2D.Double p= new Path2D.Double();
        gg.setColor(Color.green);
        p.moveTo(400, 200);
        p.lineTo(300, 200);
        p.lineTo(350, 150);
        p.lineTo(450, 150);
        p.quadTo(550, 230, 530, 260);
     
        p.lineTo(240, 260);
        p.quadTo(210, 225, 240, 200);

        p.closePath();
      
        gg.fill(p); 
        gg.setColor(Color.black);
        gg.draw(p);
    }
}

public class HW_Graphics3 {

    public static void main(String[] args)
    {    
        jframe jf = new jframe();
        jf.setVisible(true); 
        jf.getContentPane().setBackground(Color.white);
        jf.setSize(700, 700);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setTitle("اسلام اشرف رمضان - 5");
    }
    
}
