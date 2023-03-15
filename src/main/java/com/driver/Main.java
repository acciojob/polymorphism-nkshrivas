package com.driver;



/*
 * Task 1:
 * create a class Product inside Main class
 *
 * Task 2:
 * create object of Product in Main function called p
 *
 * Task 3:
 * create a method of following defination
 * public int product(int x, int y) {}
 *
 * call this method from Main using Product class object p
 *
 * Task 4:
 * create a Overloaded method product of following defination
 * public int product(int x, int y, int z) {}
 *
 * call this method also from Main using Product class object p
 *
 * Task 5:
 * create a Overloaded method product of following defination
 * public double product(double x, double y) {}
 *
 * call this method also from Main using Product class object p
 *
 * Observations:
 * This class contains 3 classes with same name, but it complie & run successfully
 *
 */


public class Main {

    public static class Product{
        public int product(int x, int y) {
//            System.out.println(x+" "+y);
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }

        public double product(double x, double y) {
            return x*y;
        }

    }

    public static void main(String args[]){
        Product p = new Product();
        int pro = p.product(4,5);
//        System.out.println("pro " +pro );
        int pro1 = p.product(4,5,6);
//        System.out.println("pro1 " +pro1 );

        double proD = p.product(4.98,5.65);
        System.out.println(pro+" "+pro1+" "+proD );




    }

}