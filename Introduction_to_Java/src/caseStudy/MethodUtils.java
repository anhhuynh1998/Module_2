package caseStudy;

import java.util.Scanner;

public class MethodUtils {
    public static void printMenu(Information information){
        System.out.println(information.getTitle().toUpperCase());
        for (InformationDetail detail: information.getInformationDetails()){
            System.out.printf("%s. %s%n",detail.getNo(),detail.getDescription());
        }
    }
    public static int choice(Scanner input){
        System.out.println(" Enter Your Choice :");
        return Integer.parseInt(input.nextLine());
    }
}


