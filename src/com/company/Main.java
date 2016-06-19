package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner s = new Scanner(System.in);

        Teacher t = new Teacher();

        Student obj = new Student();

        String i,n,q,c,sa,cou;

        int b,tch=0,std=0,no=1,no1=0;

        do

        {


            System.out.println("------------------------------------------------------------------------------------");

            System.out.println();

            System.out.println("\tWELCOME TO UNIVERSITY MANAGEMENT SYSTEM !!!");

            System.out.println("Press 1 For Teacher");

            System.out.println("Press 2 For Student");

            System.out.println("Press 3 For Exit");

            System.out.println();

            b = s.nextInt();


            switch (b) {
                case 1:

                    do

                    {

                        System.out.println("------------------------------------------------------------------------------------");

                        System.out.println();

                        System.out.println("\tTeacher !!!");

                        System.out.println("Press 1 To Insert A Teacher");

                        System.out.println("Press 2 To View All Teacher");

                        System.out.println("Press 3 For Exit");

                        System.out.println();

                        tch = s.nextInt();


                        switch (tch) {
                            case 1:
                                System.out.println("Enter Id Of Teacher : ");

                                i = s.next();

                                System.out.println("Enter Name Of Teacher : ");

                                n = s.next();

                                System.out.println("Enter Qualification Of Teacher : ");

                                q = s.next();

                                System.out.println("Enter Contact Number Of Teacher : ");

                                c = s.next();

                                System.out.println("Enter Salary Of Teacher : ");

                                sa = s.next();


                                t.Insert(i, n, q, c, sa, no);

                                no++;

                                break;

                            case 3:
                                break;

                            case 2:

                                t.View(no);

                                break;


                            default:

                                System.out.println("Invalid Input ! ");
                                break;

                        }
                        }
                        while (tch != 3) ;



                    break;


                case 2:

                    do

                    {

                        System.out.println("------------------------------------------------------------------------------------");

                        System.out.println();

                        System.out.println("\tStudents !!!");

                        System.out.println("Press 1 To Insert A Student");

                        System.out.println("Press 2 To View All Students");

                        System.out.println("Press 3 For Exit");

                        System.out.println();

                        std = s.nextInt();


                        switch (std) {
                            case 1:
                                System.out.println("Enter Roll# of Student : ");

                                i = s.next();

                                System.out.println("Enter Name Of Student : ");

                                n = s.next();

                                System.out.println("Enter Semester of Student : ");

                                q = s.next();

                                System.out.println("Enter Section of Student : ");

                                c = s.next();

                                System.out.println("Enter Batch of Student : ");

                                sa = s.next();

                                System.out.println("Enter Course Name of Student: ");

                                cou = s.next();

                                obj.Inserts(i, n, q, c, sa,cou, no1);

                                no1++;

                                break;

                            case 3:
                                break;

                            case 2:

                                obj.Views(no1);

                                break;


                            default:

                                System.out.println("Invalid Input ! ");
                                break;

                        }
                    }
                    while (std != 3) ;











                    break;


                        case  3:


                            break;

                default:

                    System.out.println("Invalid Input ! ");
                    break;


            }
        }while (b!=3);
    }
}
