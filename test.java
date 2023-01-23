
import java.util.*;
public class test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        if(num>0){
            System.out.println("+ve");
        }
        else if(num==0){
            System.out.println("Neutral");
        }
        else{
            System.out.println("-ve");
        }
        
    }
}