import java.util.*;

public class circumference{
    public static double Circum(int r){
        double circum= 2*3.14*r;
        return circum;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius:");
        int r = sc.nextInt();
        System.out.println("circumference of the circle is " + Circum(r));
        
        
    }
}