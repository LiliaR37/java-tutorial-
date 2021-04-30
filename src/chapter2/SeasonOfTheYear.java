package chapter2;

import java.util.Scanner;

public class SeasonOfTheYear {
    public static void main(String arg[]){

        //1.Enter an adjective
        System.out.println("Enter an adjective");
        Scanner scanner = new Scanner(System.in);
        String adjective = scanner.next();

        //2.Enter season of the year
        System.out.println("Enter favorite season of the year");
        String season = scanner.next();

        //3. Enter a number
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        scanner.close();

        //4. Display result
        System.out.println("on a" + " " + adjective + " " +  season + " " +  "day, I drink a minimum of"+ " " + number + " " + "cups of coffee");


    }}

   