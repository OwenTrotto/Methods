package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//

        System.out.println("Hello World");

        printGreetings("Owen");


        int a = 3;
        int b = 4;
        System.out.println(multiply(a,b));

        int c = 71;
        int d = 6;
        System.out.println(divide(c,d));

        maxNumber();



        printSwitch("Home");




        }

        public static void printGreetings(String noun) {
        System.out.println("Hello "+ noun);

        }

        public static int multiply(int firstNumber, int secondNumber){

        int answer = firstNumber*secondNumber;

        return answer;
        }

        public static double divide(double firstNumber, double secondNumber){

        double answer = firstNumber/secondNumber;

        return answer;
        }

       public static void maxNumber() {
           String firstResponse = "The max number is 14";
           String secondResponse = "The max number is 15";
           int number = 14;
           int numberOne = 15;
           if (number > 0 && number < 10) {
               System.out.println(firstResponse);
           } else if (numberOne > 11 || numberOne < 20) {
               System.out.println(secondResponse);
           }

       }

        public static void printSwitch(String noun){
         System.out.print(" Work "+ noun);

    }


















    }










































