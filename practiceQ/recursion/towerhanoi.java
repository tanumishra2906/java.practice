import java.util.*;

public class towerhanoi {
    public static void towerOfHanoi(int n, String src,String helper , String dest){
        if(n==1){
            System.out.println(" transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper); //step 1 transfer all the disk except disk 1 from s to h here h acts as d and d acts as h as its empty
        System.out.println("transfer disk "+n+" from "+src+" to "+dest); //step 2
        towerOfHanoi(n-1, helper, src, dest); //step 3 transfer those n-1 disks from h to d...here s acts as h 
    }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter no of disks");
            int n = sc.nextInt();
            towerOfHanoi(n, "S", "H", "D");
        }
    
}
//here time complexity is o(2^n-1)===o(2^n)
