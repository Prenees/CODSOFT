import java.util.Scanner;
class StudentGradeCalculator
{
    public static void main(String[]args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("---Student Grade Calculator----");
        System.out.println("Enter how many subject");
        int numofsub=scn.nextInt();

        // Stored marks
        int[] marks=new int[numofsub];
        int total=0;

        for(int i=0;i<numofsub;i++)
        {
            System.out.println("Enter your mark"+(i+1)+"out of(100)");
            int mark=scn.nextInt();

            if(mark<0 || mark>100)
            {
                System.out.println("Invalid mark..pls enter mark out of 0 to 100");
                i--;
                continue;
            }
            marks[i]=mark;
            total=total+mark;
        }
        calculate(total,numofsub);
    }
    public static void calculate(int total,int numofsub)
    {
        // Calculate average
        double avg=total/numofsub;
        char grade;
        // Grade Display
        if(avg>=90)
        {
            grade='A';
        }
        else if(avg>=80)
        {
            grade='B';
        }
        else if(avg>=70)
        {
            grade='C';
        }
        else if(avg>=60)
        {
            grade='D';
        }
        else
        {
            grade='F';
        }

        //Result
        System.out.println("-----Result Display------");
        System.out.println("Total marks ="+total);
        System.out.println("Average  ="+avg);
        System.out.println("Grade  ="+grade);

        if(grade=='F')
        {
            System.out.println("Fail");
        }
        else
        {
            System.out.println("Pass");
        }
    }
       
}
