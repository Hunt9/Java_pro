package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner s = new Scanner(System.in);

        Teacher t = new Teacher();

        String n,q,c;

        int i,sa,b;

        do

        {


            System.out.println("------------------------------------------------------------------------------------");

            System.out.println();

            System.out.println("\tPress 1 To Add A New Teacher , 2 To View Teacher & 3 For EXIT !!!");

            System.out.println();

            b = s.nextInt();


            switch (b) {
                case 1:
                    System.out.println("Enter Id Of Teacher : ");

                    i = s.nextInt();

                    System.out.println("Enter Name Of Teacher : ");

                    n = s.next();

                    System.out.println("Enter Qualification Of Teacher : ");

                    q = s.next();

                    System.out.println("Enter Contact Number Of Teacher : ");

                    c = s.next();

                    System.out.println("Enter Salary Of Teacher : ");

                    sa = s.nextInt();

                    t.Add(i, n, q, c, sa);

                    break;

                case  3:
                    break;

                case 2:

                    t.View();

                    break;


                default:

                    System.out.println("Invalid Input ! ");
                    break;


            }
        }while (b!=3);
    }
}
