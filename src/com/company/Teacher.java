package com.company;

/**
 * Created by Champ on 6/18/2016.
 */


    public class Teacher {




        private  int Id;
        private String name;
        private String qualification;
        private String contact;
        private int salary;

        public int getId() {
            return Id;
        }

        public void setId(int id) {
            Id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getQualification() {
            return qualification;
        }

        public void setQualification(String qualification) {
            this.qualification = qualification;
        }

        public String getContact() {
            return contact;
        }

        public void setContact(String contact) {
            this.contact = contact;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public void Add(int Id,String name, String qualification,String contact,int salary ){

            setId(Id);
            setName(name);
            setQualification(qualification);
            setContact(contact);
            setSalary(salary);
        }

        public void View(){

            System.out.println("Teacher Id Is : "+ getId());
            System.out.println("Teacher Name Is : "+getName());
            System.out.println("Teacher Qualification Is : "+getQualification());
            System.out.println("Teacher Contact Number Is : "+getContact());
            System.out.println("Teacher Salary Is : "+getSalary());

        }




    }
