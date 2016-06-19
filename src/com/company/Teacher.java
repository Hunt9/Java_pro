package com.company;

/**
 * Created by Champ on 6/18/2016.
 */


    public class Teacher {


        public String data[][] = new String[100][5];

    public void Insert(String Id,String name, String qualification,String contact,String salary,int number ){



        data [0] = new String[5];

        data[0][0] = "Id";
        data[0][1] = "Name";
        data[0][2] = "Qualifications";
        data[0][3] = "Contact #";
        data[0][4] = "Salary";

       data[number] = new String[5];

        data[number][0] = Id;
        data[number][1] = name;
        data[number][2] = qualification;
        data[number][3] = contact;
        data[number][4] = salary;


    }


        public void View(int n){
            int i,j;
            for(i=0;i<n ;i++)
            {
                for(j=0;j<5;j++)
                {

                    System.out.printf("\t" +data[i][j]);
                    System.out.printf("\t");


                }
                System.out.println();
            }


        }




    }
