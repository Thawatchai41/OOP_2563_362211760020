package LAB8;

public class PersonApp {

    public static void main(String[] args) {

        //object
        Person p1 = new Person();
        p1.setName("Thawatchai Khamnoi");
        p1.setAge(22);

        Person p2 = new Teacher("RUTS");
        p2.setName("Anucha Seaton");
        p2.setAge(23);

        Person p3 = new Doctor("Thungsong");
        p3.setName("Aekkachai Bunnak");
        p3.setAge(24);

        //call introduce
        p1.introduce();
        p2.introduce();
        p3.introduce();


    }//main

}//class
