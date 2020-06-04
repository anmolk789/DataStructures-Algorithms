import java.util.Scanner;
public class TowerTest{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of disks :");
        n=obj.nextInt();
        if(n<=0 || n>6){
            System.out.println("Invalid input");
            System.exit(0);
        }
        System.out.println("The sequence of moves involved in the Tower of Hanoi are :");
        String src="A";
        String aux="B";
        String des="C";
        toh(src,aux,des,n);
    }
    public static void toh(String src,String aux,String des,int n){
        if(n==0){
            return;
        }
        toh(src,des,aux,n-1);
        System.out.println("Move disk " +n+" from peg "+src+" to peg "+des);
        toh(aux,src,des,n-1);
    }
}