import controller.University;
import entity.Courses;
import entity.Student;
import types.UserType;

import java.time.LocalDate;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    University university = new University();
    private Object StudentEmail;

    public void showHomeScreen(){
        String choice = "";
        System.out.println("Welcome to the University"
                + "\n1. Add Student \t\t 4. Add entity.Courses"
                + "\n2. View All Students \t\t 5. View All entity.Courses"
                + "\n3. View Individual Student \t\t 6. View Exam Results"
                + "\n7. Exit University"
        );

        System.out.print("Choose one of the below options please: ");
        choice = scanner.nextLine();

        switch (choice){
            case "1":
                studentEnrollment();
                break;
            case "2":
                showAllStudents();
                break;
            case "3":
                showOneStudent();
            case "4":
                showAllCourses();
                break;
            case "5":
                sellProductToUser();
                break;
            case "6":
                return;
            default:
                break;
        }
        this.showHomeScreen();
    }

    private void showAllStudents() {
        for (Student currentStudent: university.getStudents()){
            System.out.println(Student.getName() +
                    " | " + currentStudent.getSurname() +
                    " | " + currentStudent.getGradeYear()); //+
//                    " | " + currentStudent.getQuantity() +
//                    " | " + currentStudent.getCreatedAt());
        }
    }

    private void showAllCourses() {
        for (Student currentCourses : university.getCourses()) {
            System.out.println(Courses.getName() +
                    " | " + currentCourses.getSurname() +
                    " | " + currentCourses.getGradeYear());
        }
    }

    private void showOneStudent() {
        System.out.println("View Car\n");
        System.out.println("Enter car ID:");

        int studentID = scanner.nextInt();
        One one = Student.getOneStudent(studentID);

        System.out.println("Car Name:" + one.name);
        System.out.println("Car Manufacturer:" + one.manufacturer);
        System.out.println("Car Number:" + one.id);
        System.out.println("Car Type:" + one.type);
    }

    private void studentEnrollment() {
        System.out.println("Enter User's Name:");
        String name = scanner.nextLine();
        System.out.println("Enter email:");
        String email = scanner.nextLine();
        System.out.println("Enter balance e.g 25.00:");

        //Float parseFloat are wrapper classes, help us to convert
        float balance = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter User Type (owner / buyer):");
        UserType userType = (scanner.nextLine().trim().toUpperCase().equals("ADMIN")) ? UserType.ADMIN : UserType.STUDENT;
        LocalDate createdAt = LocalDate.now();

        Student student = new Student(name, email, balance, userType, createdAt);
        System.out.println(student.createStudent(student));
    }

//    private void (){
//        for (student currentStudent: student.getStudent()){
//            System.out.println(Student.getName() +
//                    " | " + currentStudent.getEmail() +
//                    " | " + currentStudent.getBalance() +
//                    " | " + currentStudent.getType() +
//                    " | " + currentStudent.getCreatedAt());
//        }
//    }

    private void sellProductToUser() {
        /*
         * do we have enough product to sell
         * does user have enough balance
         * deduct users balance
         * deduct product from total available products
         * */
        System.out.println("Enter registered email address:");
        String userEmail = scanner.nextLine();
        System.out.println("Enter product name:");
        String nameOfProduct = scanner.nextLine();
        System.out.println("How many items:");
        Integer noOfItems = Integer.parseInt(scanner.nextLine());

        Object nameOfCourses = null;
        System.out.println(university.buyCourses(nameOfCourses, StudentEmail, noOfItems));
    }

}