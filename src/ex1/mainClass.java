package ex1;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;
public class mainClass {
    public static Scanner kbs = new Scanner(System.in);
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        for(int i = 0; i < 5; i++) {
            System.out.println("Enter name " + (i + 1));
            list1.add(kbs.nextLine());
        }
        System.out.println(list1);
        list1.set(4, "Alexander");
        list1.addFirst("Dimitar");
        list1.addLast("Plamen");
        for(String i: list1)
            System.out.println(i);
        System.out.println("Search name: ");
        String src = kbs.nextLine();
        boolean result = false;
        for(String i: list1){
            if(i.equals(src))
                result = true;
        }
        if (result == true)
            System.out.println("The name " + src + " is in the list");
        else
            System.out.println("The name " + src + " isn't in the list");
        System.out.println(list1.size());
        list1.remove(2);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

    }
}
