package com.example.preaddress;

import java.util.ArrayList;
import java.util.Scanner;

public class Mainclass {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        People newpeople;

        //created an arraylist of type People and named it peoples
        ArrayList<People> peoples = new ArrayList<>();

        for (int i=1;i<=5;i++){
            newpeople = new People();

            System.out.println("Enter your First name");
            newpeople.setFirstname(scan.nextLine());
            System.out.println("Enter your Last name");
            newpeople.setLastname(scan.nextLine());
            System.out.println("Enter your Address");
            newpeople.setAddress(scan.nextLine());
            System.out.println("Enter your Phone Number");
            newpeople.setPhonenumber(scan.nextLine());
            System.out.println("Enter your email");
            newpeople.setEmail(scan.nextLine());

            peoples.add(newpeople);



        }

        System.out.print("Your first name is: ");
        for(People eachPeople:peoples){
            System.out.print(eachPeople.getFirstname()+ " ");
        }







    }
}
