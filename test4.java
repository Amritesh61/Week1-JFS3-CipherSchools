import java.util.Scanner;
public class test4 {
    public static void main(String args[])
    
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("How Long is your burp");
        int burplength = sc.nextInt();
        String msg="";
        for (int i=1;i <=burplength; i++){
            msg=msg+"r";//msg+="r"
        }
        System.out.println("Bu"+msg+"p");
    }
    
}