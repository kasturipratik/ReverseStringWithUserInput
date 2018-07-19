import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class ReverseString {

    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String [] a = input.split(" ");

        int c = Integer.parseInt((a[a.length - 1]));
        String reversed = reverse(a[c-1]);
        a[c-1] = reversed;
        for (int i = 0; i < a.length-1; i++ ){
            System.out.print(a[i]+" ");
        }

    }
    public static String reverse(String text){
        String reverse = "";
        int count = text.length();
        for(int i =0;i < text.length();i++){
            reverse += text.substring(count-1,count);
            count --;
        }
        return reverse;
    }

    }


