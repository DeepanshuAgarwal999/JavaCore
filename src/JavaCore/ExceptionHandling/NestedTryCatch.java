package JavaCore.ExceptionHandling;

import java.util.Arrays;
import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        try{
            System.out.println("trying to run code inside me!!");
            try {
                int[] arr ={1,2,3,4,5,6,7};
                System.out.println(Arrays.toString(arr));
                int x=arr[-1];

            } catch (ArithmeticException e) {
                System.out.println("Error :"+e);
            }
        }
        catch(Exception e){
            System.out.println("outer Catch handling Error index out of bound  :"+e);
        }
    }
}
