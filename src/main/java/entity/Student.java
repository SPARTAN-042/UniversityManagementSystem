package entity;

import types.UserType;

import java.time.LocalDate;
import java.util.Scanner;

public class Student {
    private static String name;
    private  String surname;
    private  int gradeYear;
    /*constructor will ask for name ,year
    generate ID
    enroll in classes
    view balance
    pay for classes
    show status
     */

    private  String courses = "";
    //static means value is not specific to object,but to class
    private  int costOfCoursesBalance = 0;
    private static  int  tuitionFees = 400;

    public Student(String name, String email, float balance, UserType userType, LocalDate createdAt) {
    }

    public static <One> One getOneStudent(int studentID) {
        return null;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public int getCostOfCoursesBalance() {
        return costOfCoursesBalance;
    }

    public void setCostOfCoursesBalance(int costOfCoursesBalance) {
        this.costOfCoursesBalance = costOfCoursesBalance;
    }

    public static int getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(int tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGradeYear() {
        return gradeYear;
    }

    public void setGradeYear(int gradeYear) {
        this.gradeYear = gradeYear;
    }

    public Student(String surname, int gradeYear, String courses, int costOfCoursesBalance) {
        this.surname = surname;
        this.gradeYear = gradeYear;
        this.courses = courses;
        this.costOfCoursesBalance = costOfCoursesBalance;
    }

    public Student(){

        System.out.println("Hello, welcome to new year at school!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        this.name = scanner.nextLine();

        System.out.print("Please enter your surname: ");
        this.surname = scanner.nextLine();

        System.out.println("What year are you at? ");
        System.out.print("1 - 1st year\n2 - 2nd year\n3 - 3rd year\n4 - 4th year ");
        this.gradeYear = scanner.nextInt();


        // every next students id will be 1 greater than previous

    }

    //join the classes
    public void enroll(){
        //make a loop
        do {
            System.out.print("Enter class you want to join( x to quit): ");
            Scanner scanner = new Scanner(System.in);
            String course = scanner.nextLine();
            if (!course.equals("x")) {
                course = course + "\n " +course;
                costOfCoursesBalance = costOfCoursesBalance + tuitionFees;
            }
            else {
                break;
            }
        }while (1 != 0);

    }
    //view balance
    public void viewBalance(){
        System.out.println("Your balance is £" + costOfCoursesBalance);
    }
    //study fees
    public void payForStudies(){
        viewBalance();
        System.out.println("How much would you like to pay? ");
        Scanner scanner = new Scanner(System.in);
        int payment = scanner.nextInt();
        costOfCoursesBalance = costOfCoursesBalance - payment;
        System.out.println("Thank you for your payment of £" + payment);
        viewBalance();
    }
    //view status
    public String toString(){
        return "Name: " + name + " " + surname +
                "\nGrade Level: " + gradeYear +
                "\nClasses enrolled: " + courses +
                "\nBalance: £" + costOfCoursesBalance;
    }

    public boolean createStudent(Student student) {

        return false;
    }
}