package LAB5;

public class ex_array {

    public static void main(String[] args) {
        // array คือ ตัวแปลที่สามารถเก็บข้อมูลได้หลายค่าที่เป็นชนิดเดียวกัน
        //เก็บจำนวนข้อมูลตามขนาดของ array
        //แต่ ขนาดของ array ต้องระบุขนาดตอนสร้าง array และไม่สามารถเปลี่ยนแปลงได้
        int x = 10;
        x = 20;

        int num[] = new  int[5]; // o-4 => last index n-1

        //add value to array
        num[4] = 10;
        num[2] = 20;
        num[4] = 100;

        num[1] = num[4] * 2;

        for (int val:num) {
            System.out.println(val);
        }

        //size array
        System.out.println(num.length);

        //System.out.println(num[4]);





    }//main

}//class
