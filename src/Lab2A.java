/*
Class:1321
Section: 51
Term: Spring '23
Instructor: Surya
Name: Nick Pettit
Lab#: J06
 */
import java.util.Scanner;
public class Lab2A {
    public static void main(String[] args){
        System.out.print("Enter a name: ");
            String N1;
                Scanner sc0 = new Scanner(System.in);
                    N1 = sc0.nextLine();
        System.out.print("Enter another name: ");
            String N2;
                Scanner sc1 = new Scanner(System.in);
                    N2 = sc1.nextLine();
        System.out.print("Enter a verb: ");
            String V;
                Scanner sc3 = new Scanner(System.in);
                    V = sc3.nextLine();
        System.out.print("Enter an adverb: ");
            String Adv;
                Scanner sc4 = new Scanner(System.in);
                    Adv = sc4.nextLine();
        System.out.println(" ");
        System.out.println("A long time ago, in a galaxy far far away, there was a master named "+ N1 +" with an apprentice named "+ N2 +".");
        System.out.println("They would "+ V +" "+ Adv +" for hours while sharing the most unbelievable stories.");
    }
}