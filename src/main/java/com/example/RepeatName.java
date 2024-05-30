package com.example;
import java.util.Scanner;

/**
 * RepeatName
 */
public class RepeatName {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your name: ");
    String name=sc.nextLine();
    for(int i=1;i<=2;i++){
      System.out.println(name);
    }

    int j=0;
    while(j<2){
      System.out.println(name);
      j++;
    }

    int k=0;
    do{
      System.out.println(name);
      k++;
    }
      while(k<2);
    

  }
   
}