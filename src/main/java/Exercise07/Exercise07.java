/*
 *  UCF COP3330 Fall 2021 Exercise 7 Solution
 *  Copyright 2021 Patrick Iannini
 */
package Exercise07;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        System.out.println("What is the length of the room in feet?");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        System.out.println("What is the width of the room in feet?");
        Scanner sc1 = new Scanner(System.in);
        int width = sc1.nextInt();

        System.out.println("You entered dimensions of "+length+" feet by "+width+" feet.");

        int sqFeet = length*width;
        double cFactor = 0.09290304;
        double sqMeters = sqFeet*cFactor;

        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("The area is\n"+sqFeet+" square feet\n"+df.format(sqMeters)+" square meters");
    }
}
