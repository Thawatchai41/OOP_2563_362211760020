package LAB2;

import java.util.Scanner;

public class Exercise_STD_Profile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("ชื่อ-สกุล: ");
        String std_name = scanner.nextLine();


        System.out.print("รหัสนักศึกษา: ");
        String std_id = scanner.nextLine();


        System.out.print("อายุ: ");
        int std_age = Integer.parseInt(scanner.nextLine());


        System.out.print("เบอร์โทรศัพท์: ");
        String std_phone = scanner.nextLine();


        System.out.print("อีเมล์: ");
        String std_email = scanner.nextLine();


        System.out.println("-------------------------------");
        System.out.println("ชื่อ-สกุล: "+std_name);
        System.out.println("รหัสนักศึกษา: "+std_id);
        System.out.println("อายุ: "+std_age);
        System.out.println("เบอร์โทรศัพท์[: "+std_phone);
        System.out.println("อีเมล์: "+std_email);
        System.out.println("-------------------------------");




    }//main


}//class
