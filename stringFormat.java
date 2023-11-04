import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length()+B.length());
        
        // int lexicograpResult = A.compareTo(B);
        // if (lexicograpResult>0){
        //     System.out.println("Yes");
        // }
        // else if(lexicograpResult<0){
        //     System.out.println("No");
        // }

        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

        String capA = capitalizeFirstLetter(A);
        String capB = capitalizeFirstLetter(B);
        System.out.println(capA+" "+capB);
    }
    public static String capitalizeFirstLetter(String input){
            return input.substring(0,1).toUpperCase()+input.substring(1);
    }     
      
}




