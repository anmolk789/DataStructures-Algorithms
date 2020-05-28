import java.util.*;
class Stack{
    int arr[]=new int[1000];
    private int top;
    Stack(){
        top=-1;
    }
    void push(int data){
        if(top>=arr.length-1){
            return;
        }else{
            arr[++top]=data;
        }
    }
    int pop(int pos){
        return arr[pos];
    }
    
}
public class ShopMain{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        int n;
        System.out.print("Enter the no. of users:");
        n=obj.nextInt();
        System.out.println();
        if(n<=0 || n>1000){
            System.out.println("Invalid no. of users");
            System.exit(0);
        }
        Stack s=new Stack();
        for(int i=0;i<n;i++){
            System.out.print("Enter the credit points for user "+(i+1)+": ");
            int data=obj.nextInt();
            obj.nextLine();
            s.push(data);
            System.out.println();
        }
        System.out.print("Enter the no. of users to serve: ");
        int servers=obj.nextInt();
        if(servers<=0 || servers>n){
            System.out.println("Invalid no.of users");
            System.exit(0);
        }
        if(servers==n){
            System.out.println("0 users to serve");
            System.exit(0);
        }
        System.out.print("The unserved user's credit points are:");
        for(int i=servers;i<n;i++){
            System.out.print(" "+s.pop(i));
        }
        
    }
}