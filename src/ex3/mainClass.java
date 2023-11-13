package ex3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class mainClass {
    public static Scanner kbs = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
        System.out.println("Enter name " + (i + 1));
        list1.add(kbs.nextLine());
        }
        System.out.println(list1);
        list1.set(2, "Mitko");
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
        list1.size();
        Collections.sort(list1);
        System.out.println(list1);
    }
}
