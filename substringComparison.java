import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        // String smallest = "";
        // String largest = "";
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
    for(int i=0;i<=s.length()-k;i++){
        String currentString=s.substring(i,i+k);
        if(currentString.compareTo(smallest)<0){
            smallest=currentString;
        }
        if(currentString.compareTo(largest)>0){
            largest=currentString;
        }
    }
    
        // 'largest' must be the lexicographically largest substring of length 'k'
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}