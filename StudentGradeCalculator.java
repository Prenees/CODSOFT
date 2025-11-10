import java.util.Scanner;

class StudentGradeCalculator
{
    public static void main(String[]args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.println("Enter how many subjects");
        int num=scn.nextInt();

        int[]marks=new int[num];
        int total=0;

        for(int i=0;i < num; i++)
        {
            System.out.println("Enter your marks "+(i+1)+" out of(100)");
             int mark =scn.nextInt();

            if(mark<0 || mark>100)
            {
                System.out.println("! invalid marks..pls enter valid marks out of 0 to 100");
                i--;
                continue;
            }
            marks[i]=mark;
            total+=mark;
        }
        // average
        double avg=total/num;
        System.out.println("Total marks ="+total);
        System.out.println("Average ="+avg);
    }
}
