package JavaCore.CollectionFramework;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;


class Address{
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;
    Address(String n, String s, String c,
            String st, String cd) {
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }
    public String toString() {
        return name + "\n" + street + "\n" +
                city + " " + state + " " + code;
    }
}
public class collection {
    public static void main(String[] args) {

        LinkedList<Address> ml =new LinkedList<>();

        ml.add(new Address("J.W. West", "11 Oak Ave",
                "Urbana", "IL", "61801"));
        ml.add(new Address("Ralph Baker", "1142 Maple Lane",
                "Mahomet", "IL", "61853"));
        ml.add(new Address("Tom Carlton", "867 Elm St",
                "Champaign", "IL", "61820"));
        for(Address element : ml)
            System.out.println(element + "\n");
        System.out.println();
    }
//        ArrayList<Integer> al= new ArrayList<>();
//        al.add(1);
//        al.add(2);
//        al.add(3);
//        System.out.println(al);
//        ArrayList<String> sl= new ArrayList<>();
//        sl.add("dev");
//        sl.add("lop");
//        sl.add("er");
//        System.out.println(sl +" "+ sl.size());
//        Integer[] ia=new Integer[al.size()];
//        ia=al.toArray(ia);
//        int sum=0;
//        for (int i:ia)sum+=i;
//        System.out.println("\n"+sum);
//
    }


