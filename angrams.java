import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        String A = a.toLowerCase();
        String B = b.toLowerCase();
        if(A.length()!=B.length()){
            return false;
        }
        int[] countA = new int[26];
        int[] countB = new int[26];
        for(char c: A.toCharArray()){
            countA[c-'a']++;
        }
        for(char c: B.toCharArray()){
            countB[c-'a']++;
        }
        for(int i=0;i<26;i++){
            if(countA[i]!=countB[i]){
                return false;
            }
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
