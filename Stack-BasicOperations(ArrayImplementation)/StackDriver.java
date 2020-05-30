import java.util.Scanner;
class Stack{
    private int top,size,sArray[];
    public Stack(int s){
        this.size=s;
        top=-1;
        sArray=new int[size];
    }
    public void push(int data){
        if(top>=size-1){
            System.out.println("Stack Overflow");
            System.exit(0);
        }
        else{
            sArray[++top]=data;
        }
    }
    public int pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return -1;
        }else{
            int element=sArray[top--];
            return element;
        }
    }
    public int middle(){
        int pos;
        if(size%2==0){
            pos=size/2-1;
        }else{
            pos=Math.round(size/2);
        }
        return sArray[pos];
    }
    
}
public class StackDriver{
    public static void main (String[] args) {
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the number of elements to be pushed in the stack:");
       int n=obj.nextInt();
       if(n<=0){
           System.out.println("Invalid Input");
           System.exit(0);
       }
       Stack stack=new Stack(n);
       for(int i=0;i<n;i++){
           System.out.println("Enter the element "+(i+1)+":");
           int data=obj.nextInt();
           stack.push(data);
       }
       System.out.println("The middle element is: "+stack.middle());
       System.out.println("The popped element is: "+stack.pop());
    }
}