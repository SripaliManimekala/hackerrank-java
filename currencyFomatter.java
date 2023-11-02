import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat cf = NumberFormat.getInstance();
        // Locale usLocale = new Locale("en", "US");
        // Locale inLocale = new Locale("en", "IN");
        // Locale chLocale = new Locale("zh", "CN");
        // Locale frLocale = new Locale("fr", "FR");
        
        NumberFormat cf1 = NumberFormat.getCurrencyInstance(usLocale);
        NumberFormat cf2 = NumberFormat.getCurrencyInstance(inLocale);
        NumberFormat cf3 = NumberFormat.getCurrencyInstance(chLocale);
        NumberFormat cf4 = NumberFormat.getCurrencyInstance(frLocale);
        String us = cf1.format(payment);
        String india = cf2.format(payment);
        String china = cf3.format(payment);
        String france = cf4.format(payment);
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}