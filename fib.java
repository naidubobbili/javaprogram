import java.util.*;
class Main{
    public static void main(String args []){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        int f1=1,f2=1,f3=0;
        System.out.print("0 1 ");
        for(int i = 2;i<n;i++){
            f3=f1+f2;
            f1=f2;
            f2=f3;
            System.out.print(f3+" ");
        }
    }
