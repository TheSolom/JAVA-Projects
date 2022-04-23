package javacurrencyformatter;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in).useLocale(Locale.US);;
         double payment = input.nextDouble();
        
      Locale indialocale = new Locale("en","in");
       String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
       String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
       String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
       String india = NumberFormat.getCurrencyInstance(indialocale).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
        
    }
    
}
