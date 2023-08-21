package QUESTION_1;

import java.util.*;

public class QUESTION_1 {

    public static void main(String[] args) {

        int instances = 0;

        while (instances>=0){
            instances++;
            System.out.println("Enter the number of students in the competition (1=<n<=100)");
            int number_of_inputs = inputsValidation();
            System.out.println("Enter the data of each student on the format: name grade(0 ~ 10)");
            List<String> students_dates = textInputs(number_of_inputs);
            Collections.sort(students_dates);
            System.out.println("Result: ");
            System.out.println("Instance "+instances);
            System.out.println(rank(students_dates));

        }
    }


    public static int inputsValidation() {

        Scanner instance = new Scanner(System.in);
        boolean status = false;
        int number = 0;

        while (!status) {
            number = instance.nextInt();
            if (number >= 1 && number <= 100) {
                status = true;
            } else {
                System.out.println("Enter a valid range");
            }
        }
        return number;
    }


    public static List<String> textInputs(int quantity){
        Scanner input = new Scanner(System.in);
        List <String> total_list_students = new ArrayList<>(quantity);

        for (int student = 0; student < quantity; student++) {
            total_list_students.add(input.nextLine());
        }
        return total_list_students;
    }


    public static String rank(List<String> students){

        String unfortunate = "";
        int lowest_grade =10;

        for (String student : students) {
            int valor = 0;
            Scanner student_scan = new Scanner(student);

            while (student_scan.hasNext()) {
                if (student_scan.hasNextInt()) {
                   valor = student_scan.nextInt();
                }
                else {
                    student_scan.next();
                }
            }

            student_scan.close();
            if(valor <= lowest_grade){
                unfortunate = student;
                lowest_grade = valor;
            }
        }
        return unfortunate.substring(0, unfortunate.indexOf(" "));
    }
}
