import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    int id;
    String name;
    long contactNo;
    String emailId;

    String college;


    public Student(int id, String name, long contact_no, String email_id, String college) {
        this.id = id;
        this.name = name;
        this.contactNo = contact_no;
        this.emailId = email_id;
        this.college = college;
    }

    static void add(ArrayList<Student> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the following details to ADD list:\n");
        System.out.println("Enter ID :");
        int id = sc.nextInt();
        System.out.println("Enter Name :");
        String name = sc.next();
        System.out.println("Enter Contact No :");
        long contactNo = sc.nextLong();
        System.out.println("Enter Email-ID :");
        String emailId = sc.next();
        System.out.println("Enter College :");
        String college = sc.next();
        al.add(new Student(id, name, contactNo, emailId, college));
    }
    static void display(ArrayList<Student> al) {
        System.out.println("\n--------------Students List---------------\n");
        for (Student e : al) {
            System.out.println(("ID:" + e.id));
            System.out.println(("Name:" + e.name));
            System.out.println(("Company:" + e.college));
            System.out.println(("Contact:" + e.contactNo));
            System.out.println(("Email id:" + e.emailId));
            System.out.println("   ");
        }
    }

    static void search(ArrayList<Student> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student ID to search :");
        int id = sc.nextInt();
        int i = 0;
        for (Student e : al) {
            if (id == e.id) {
                System.out.println("Name: " + e.name+"\n" + "College: " + e.college + "\n" + "Email ID "
                        + e.emailId + "\n" + "Contact " + e.contactNo + "\n");
                i++;
            }
        }
        if (i == 0) {
            System.out.println("\nStudent Details are not available, Please enter a valid ID!!");
        }
    }

    static void delete(ArrayList<Student> al) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Student ID to DELETE");
        int id = sc.nextInt();
        int k = 0;
        for (Student e : al) {
            if (id == e.id) {
                al.remove(e);
                Student.display(al);
                k++;
            }
        }
        if (k == 0) {
            System.out.println("\nStudent Details are not available, Please enter a valid ID!!");
        }
    }

}
