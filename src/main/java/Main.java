import entity.Student;
import javax.swing.*;
import java.util.Scanner;

public class Main {

    static Menu menu = new Menu();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String str = new String();
//        //add more students with array
//        str = JOptionPane.showInputDialog(null, "Please type the number of students to enroll",
//                "Welcome", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Welcome new student! ", "Greeting", JOptionPane.PLAIN_MESSAGE);

        System.out.println("Hello, please enter number of new students to enroll: ");
        int numOfStudents = scanner.nextInt();
        Student[] students = new Student[numOfStudents];

        //creating i number of students
        for (int i = 0; i < numOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payForStudies();

        }

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println(students[i].toString());

        }

        System.out.println("=========================================\n");
        menu.showHomeScreen();

    }

}