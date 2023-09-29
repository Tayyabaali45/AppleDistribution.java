import java.util.*;
public class ApplesDistribution
{
public static void main String ([]args)
{
Scanner input = new Scanner(System.in);
System.out.print("Please input the number of students:");
int noOfStudents = input.nextInt();
System.out.print("Please input the number of apples:");
int noOfApples = input.nextInt();
int eachShare= noOfApples/noOfStudents;
System.out.print("Each student will get" +eachShare);
}
}