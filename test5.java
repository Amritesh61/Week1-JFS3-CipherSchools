import java.util.Scanner;

public class test5 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Speed: ");
        int speed=sc.nextInt();

        System.out.println("Today is your birthday:");
        boolean isbirthday=sc.nextBoolean();

        if(isbirthday==true)
        {
            speed-=5;
        }
        {
        if(speed>80)
        System.out.printf("High ticket");
       
        else if(speed>=60)
        System.out.printf("Mid ticket");
        else 
        System.out.printf("No ticket");
        }
    }

}