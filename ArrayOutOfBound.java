4import java.util.Scanner;

public class ArrayOutOfBound
{

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        Student arr[]=new Student[10];

        arr[0]=new Student(1,"Nilesh");
        arr[1]=new Student(2,"Palkin");
        arr[2]=new Student(3,"Ishtpreet");
        arr[3]=new Student(4,"Robin");
        arr[4]=new Student(5,"Awdhesh");
        arr[5]=new Student(6,"Amrit");
        arr[6]=new Student(7,"Akshit");
        arr[7]=new Student(8,"Kabeer");
        arr[8]=new Student(9,"Mridul");
        arr[9]=new Student(10,"Aman");

        try {
            System.out.println("Enter Roll Number: ");
            int n=scan.nextInt();
            System.out.println("Roll no : "+arr[n-1].roll+" Name: "+arr[n-1].name);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter Roll Number under 10"+"\n"+e);
        }
        System.out.print("\n");

        System.out.println("Now it is time to perform some division!!");
        divide_exception.mystry();

    }

}

class Student
{
    int roll;
    String name;

    public Student(int roll, String name)
    {
        this.name = name;
        this.roll = roll;
    }
}

class divide_exception
{
    public static void mystry()
    {
        float a=0;
        Scanner b = new Scanner(System.in);
        System.out.println("Enter first Number");

        float operand1 = b.nextInt();
        System.out.println("Enter second Number");
        float operand2 = b.nextInt();

        try
        {
            a= (operand1/operand2);
            System.out.println("Answer is " +a);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Can not be divided by zero");
            System.out.println(e);
        }
    }

}