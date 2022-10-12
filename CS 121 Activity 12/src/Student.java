public class Student
{
    //declare instance variables
    private double GPA;
    private int graduationYear;
    private String major;
    private boolean livesOnCampus;

    //create constructor
    public Student(double studentGPA , int gradYear , String studentMajor , boolean studentLivesOnCampus)
    {
        GPA = studentGPA;
        graduationYear = gradYear;
        major = studentMajor;
        livesOnCampus = studentLivesOnCampus;
    }
    //prints if student is on academic probation using their GPA
    public void onAcademicProbation()
    {
        if (GPA <= 2.0)
        {
            System.out.println("The student is on academic probation\n");
        }
        else
        {
            System.out.println("The student is not on academic probation\n");
        }
    }
}
