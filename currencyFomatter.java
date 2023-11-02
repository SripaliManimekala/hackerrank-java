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
        Locale[] locales = {
            new Locale("en", "US"),
            new Locale("en", "IN"),
            new Locale("zh", "CN"),
            new Locale("fr", "FR")
        };
        
        // NumberFormat cf1 = NumberFormat.getCurrencyInstance(usLocale);
        // NumberFormat cf2 = NumberFormat.getCurrencyInstance(inLocale);
        // NumberFormat cf3 = NumberFormat.getCurrencyInstance(chLocale);
        // NumberFormat cf4 = NumberFormat.getCurrencyInstance(frLocale);
        NumberFormat[] cfs = new NumberFormat[locales.length];
        for(int i=0;i<locales.length;i++){
            cfs[i]= NumberFormat.getCurrencyInstance(locales[i]);
        }
        // String us = cf1.format(payment);
        // String india = cf2.format(payment);
        // String china = cf3.format(payment);
        // String france = cf4.format(payment);
        
        String[] formattedCur = new String[locales.length];
        for(int i=0;i<locales.length;i++){
            formattedCur[i] = cfs[i].format(payment);
        }
        
        System.out.println("US: " + formattedCur[0]);
        System.out.println("India: " + formattedCur[1]);
        System.out.println("China: " + formattedCur[2]);
        System.out.println("France: " + formattedCur[3]);
        // for(int i=0;i<locales.length;i++){
        //     String localeName = locales[i].getDisplayName();
        //     System.out.println(localeName + ": " + formattedCur[i]);
        // }
    }
}