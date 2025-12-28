import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.println("Choose an option");

            int choice = sc.nextInt();

            if ( choice == 1){
                System.out.print("Enter roll number: ");
                int roll = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Marks: ");
                int marks = sc.nextInt();

                Student s = new Student(roll, name,marks);
                students.add(s);

                System.out.println("Student added successfully");
            } else if (choice == 2) {

                if (students.isEmpty()){
                    System.out.println(" No students to display");
                } else{
                    System.out.println("\n---Student List ---");

                    for (Student s : students){
                        System.out.println(
                                "Roll: " + s.roll+
                                        ", Name: "+ s.name+
                                        ", Marks: "+ s.marks

                        );
                    }
                }
            } else if (choice==3){
                System.out.print("Enter roll number to search: ");
                int searchRoll = sc.nextInt();

                boolean found = false;

                for (Student s: students ){
                    if (s.roll == searchRoll){
                        System.out.println(
                                "student found -> Roll: "+ s.roll+
                                        ", Name: " + s.name+
                                        ", Marks: " + s.marks
                        );
                        found = true;
                        break;
                    }
                }
                if (!found){
                    System.out.println("Student not found");
                }

            }
            else if (choice == 4){
                System.out.println("Exiting program");
                break;
            } else{
                System.out.println("Option selected: "+ choice);
            }
            System.out.println("thank you");


        }


    }
}
