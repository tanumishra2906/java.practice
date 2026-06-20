// Two numbers are entered by the user, x and y. Write a function to find the value of one number raised to the power of another i.e. x^y.
import java.util.*;

public class power{
    public static int power(int x,int y){
        int power = 1;
        for(int i=1;i<=y;i++){
            power=power*x;
        }
        return power;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base and exponent");
        int x = sc.nextInt();
        int y = sc.nextInt();

  
        System.out.println(power(x, y));
    }
}