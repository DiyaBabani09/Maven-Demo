package Collections;

import java.util.LinkedList;

public class ListExample2 {
    public static void main(String[] args) {
        LinkedList<String>str=new LinkedList<>();
        str.add("diya");
        str.add("moni");
        str.add("diya");
        str.add("priya");
        int i=str.indexOf("moni");
        System.out.println("index is " + i);
        int k=str.lastIndexOf("diya");
        System.out.println("index is" + k);
    }
}
