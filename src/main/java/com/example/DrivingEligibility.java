package com.example;

import java.util.Scanner;

public class DrivingEligibility {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your name: ");
        String name=sc.nextLine();
        System.out.println("do you have lisence(yes/no): ");
        String lisence=sc.nextLine();
        System.out.println("are you above 18(yes/no): ");
        String age=sc.nextLine();
        if(lisence.equals("yes") && age.equals("yes")){
            System.out.println(name+" you are eligible to drive");
        }
        else {
            System.out.println("you are not eligible to drive");
        }
        sc.close();
    }


}