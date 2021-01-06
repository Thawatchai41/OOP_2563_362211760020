package Home_Work;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;

        while(count<3){
            System.out.print("Username : ");
            String usr = sc.nextLine();

            System.out.print("Password : ");
            String pwd = sc.nextLine();
            if(usr.equals("admin") && pwd.equals("saiyai"))
            {
                System.out.println("Welcome to MT Website.");
                break;
            }
            else {
                System.out.println("Username or Password not correct." );
                count++;
            }
            if(count==3)
            {
                System.out.println("Your account has been locked. Please, contact admin.");
            }
        }//while

    }//main

}//class
