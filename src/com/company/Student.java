package com.company;

/**
 * Created by Champ on 6/19/2016.
 */
public class Student {
        public String datas[][] = new String[100][6];

        public void Inserts(String roll,String name, String semester,String section,String batch,String course,int number ){



            datas [0] = new String[6];

            datas[0][0] = "Roll #";
            datas[0][1] = "Name";
            datas[0][2] = "Semester";
            datas[0][3] = "Section";
            datas[0][4] = "Batch";
            datas[0][5] = "Course";

            datas[number] = new String[6];

            datas[number][0] = roll;
            datas[number][1] = name;
            datas[number][2] = semester;
            datas[number][3] = section;
            datas[number][4] = batch;
            datas[number][5] = course;


        }


        public void Views(int n){
            int i,j;
            for(i=0;i<n ;i++)
            {
                for(j=0;j<6;j++)
                {

                    System.out.printf("\t" +datas[i][j]);
                    System.out.printf("\t");


                }
                System.out.println();
            }


        }





}
