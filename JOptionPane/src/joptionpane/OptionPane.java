package joptionpane;
import javax.swing.JOptionPane;
public class OptionPane 
{
    public static void main(String[] args) 
    {
     int x = JOptionPane.showConfirmDialog(null, "Fuck you ?");
     
     if(x == JOptionPane.YES_OPTION)
     System.out.println("Selcted Yes");
     
     else if(x==JOptionPane.NO_OPTION)
     System.out.println("Selected No");
     
     else if(x==JOptionPane.CANCEL_OPTION)
     System.out.println("Selected Cancel");
     
    }
}