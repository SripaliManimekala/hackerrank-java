import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean flag=true;
        char[]  arrayA=A.toCharArray();
        for(int i=0;i<=A.length()/2;i++){
            if(arrayA[i]!=arrayA[A.length()-1-i]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}



