/*
 *******************************************************************
 * Activity 12
 * Name: Nicholas Newlin
 * Date of Submission (10/01/2022)
 * CS 121 Data Structures and Objects
 ******************** Program Documentation ************************
 *
 *
 *
 *
 *******************************************************************
 */
import java.util.Scanner;
public class test
{
    public static void main(String [] args)
    {
        //create scanner object
        Scanner keyboard = new Scanner(System.in);




        //testing the Student class
        //get info from user to use to construct a student object
        System.out.println("Enter the student's GPA: ");
        double GPA = keyboard.nextDouble();
        System.out.println("Enter the student's graduation year: ");
        int gradYear = keyboard.nextInt();
        System.out.println("Enter the students major: ");
        keyboard.nextLine();
        String major = keyboard.nextLine();
        System.out.println("Does the student live on campus? Enter true or false: ");
        boolean onCampus = keyboard.nextBoolean();
        //construct a student object using the info the user just gave
        Student student1 = new Student(GPA,gradYear,major,onCampus);

        //use a method of the student class to determine if the student is on academic probation
        student1.onAcademicProbation();




        //testing the Cars class
        //get info from user to construct a car object
        System.out.println("You are trying to guess my dream car");
        System.out.println("Enter the make: ");
        keyboard.nextLine();
        String make = keyboard.nextLine();
        System.out.print("Enter the model: ");
        String model = keyboard.nextLine();
        System.out.println("Enter the year: ");
        int year = keyboard.nextInt();
        System.out.print("Enter the miles: ");
        double miles = keyboard.nextDouble();
        //construct a car object using the info the user just gave
        Car car1 = new Car(make,model,year,miles);

        //use a method of the car class to determine if the user guessed my dream car
        car1.isMyDreamCar();

        //close keyboard object
        keyboard.close();
    }
}
