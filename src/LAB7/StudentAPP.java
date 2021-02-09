package LAB7;

public class StudentAPP {
    public static void main(String[] args) {
        //create object of student class
        Student std1 = new Student(); //==> call constructor

        std1.introduce();
        //assign data to object
        std1.name = "Thawatchai Khamnoi";
        std1.age = 22;
        std1.major ="MIT221";
        std1.introduce();

        Student std2 = new Student();
        std2.name = "Lena Kosawa";
        std2.age = 23;
        std2.major ="AC221";
        std2.introduce();

        std1.changFalcuty("Engineer RUTS");
        std1. introduce();
        std2.introduce();









    }//main

}//class
