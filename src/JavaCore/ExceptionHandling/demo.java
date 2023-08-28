package JavaCore.ExceptionHandling;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        try {
            Scanner read = new Scanner(System.in);
            int x=20;
            System.out.printf("Enter a number for division of %d: ",x);
            int num= read.nextInt();
            int result=x/num;
        } catch (Exception e){
            System.out.println("Error "+e.getMessage());
        }
    }
}


