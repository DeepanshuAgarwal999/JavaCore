package JavaCore.Autoboxing;
import java.io.*;
import java.util.*;
public class autoboxing {

public static void main(String[] args) {
    //    autoboxing
//    int i=100;
//    Integer iob= new Integer(i);
    // It convert primitive datatype to non primitive datatype
//    Integer obj= (int)i;
//    System.out.println(obj);

//    unboxing
//    int k =obj;
//    intValue();
//    System.out.println(k);
    ArrayList<Integer> list = new ArrayList<>();

    // Adding the int primitives type values by
    //  converting them into Integer wrapper object
    for (int i = 0; i < 10; i++)

//        System.out.println(list.add(Integer.valueOf(i))); //boxing
        System.out.println(list.add(i)); //autoboxing

}
}
