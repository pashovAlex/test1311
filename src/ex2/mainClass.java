package ex2;
import  java.util.Stack;
import java.util.Scanner;
import java.util.Iterator;
public class mainClass {
    public static Scanner kbs = new Scanner(System.in);
    public static void main(String[] args) {
        Stack<String> stack1 = new Stack<>();
        for(int i = 0; i < 5; i++) {
            System.out.println("Enter town " + (i + 1));
            stack1.add(kbs.nextLine());
        }
        System.out.println(stack1);
        System.out.println("Search town: ");
        String src = kbs.nextLine();
        boolean result = false;
        for(String i: stack1){
            if(i.equals(src))
                result = true;
        }
        if (result == true)
            System.out.println("The name " + src + "is in the list");
        else
            System.out.println("The name " + src + "isn't in the list");
        stack1.add("Plovdiv");
//        stack1.forEach(i -> System.out.println(i));

        Iterator<String> stackIterator = stack1.iterator();
        while (stackIterator.hasNext()) {
            String stack = stackIterator.next();
            System.out.println(stack);
        }
        for(String i: stack1){
            if(i.equals("Sofia"))
                result = true;
        }
        if (result == true)
            System.out.println("The name " + src + " is in the list");
        else
            System.out.println("The name " + src + " isn't in the list");
        int varna = stack1.search("Varna");
        if (varna == -1)
            System.out.println("Varna isn't in the list");
        else
            System.out.println("varna is at position " + varna);
    }
}
