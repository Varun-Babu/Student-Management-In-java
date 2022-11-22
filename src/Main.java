import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int flag = 0;
        ArrayList<Student> al = new ArrayList<Student>();
        while (flag ==0){
            System.out.println("1). Add Students to the DataBase\n" +
                    "2). Search for Student\n" +
                    "3). Delete Student Details\n" +
                    "4). Display all Students \n" +
                    "5). EXIT\n");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice : ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    Student.add(al);
                    break;
                case 2:
                    Student.search(al);
                    break;
                case 3:
                    Student.delete(al);
                    break;
                case 4:
                    Student.display(al);
                    break;
                case 5:
                    flag =1;
                    break;
            }


        }
    }}