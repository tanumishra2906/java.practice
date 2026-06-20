import java.util.*;

public class factorial{
    public static int calcFact(int n){
        if(n<0){
            System.out.println("invalid number");
            return;// returns from here itself, wont even check the next line
        }
        int fact=1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int a = sc.nextInt();
        
        int fact = calcFact(a);
        System.out.println("factorial is "+fact);
    }
}
