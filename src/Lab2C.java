/*
Class:1321
Section: 51
Term: Spring '23
Instructor: Surya
Name: Nick Pettit
Lab#: J06
 */
import java.util.Scanner;
public class Lab2C {
    public static void main(String[] args){
        System.out.print("Enter a width: ");
            Scanner sc1 = new Scanner(System.in);
                int w = sc1.nextInt();
        System.out.print("Enter a height: ");
            Scanner sc2 = new Scanner(System.in);
                int h = sc2.nextInt();
        System.out.println(" ");
        //math
        int A = w * h;
        int P = 2 * (w + h);
        System.out.println("The area is "+ A);
        System.out.println("The perimeter is "+ P);
    }
}
