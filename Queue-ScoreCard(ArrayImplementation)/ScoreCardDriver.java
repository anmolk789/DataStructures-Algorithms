import java.util.Scanner;
class Queue{
    private int front,rear,qArray[],size;
    public Queue(int s){
        front=0;
        rear=0;
        size=s;
        qArray=new int[size];
    }
    public void insert(int data){
        if(rear==size){
            System.out.println("Queue Overflow");
            System.exit(0);
        }else{
            qArray[rear++]=data;
        }
    }
    public void delete(){
        if(front==rear){
            System.out.println("Queue is empty");
            System.exit(0);
        }else{
            front++;
        }
    }
    public void display(){
        for(int i=front;i<rear;i++){
            System.out.print(qArray[i]+" ");
        }
    }
}
public class ScoreCardDriver{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the size of the score card:");
        int n=obj.nextInt();
        System.out.println();
        if(n<=0 || n>100){
            System.out.println("Invalid score card size");
            System.exit(0);
        }
        Queue queue=new Queue(n);
        for(int i=0;i<n;i++){
            System.out.print("Enter the hurdle race score "+(i+1)+":");
            int data=obj.nextInt();
            queue.insert(data);
            System.out.println();
        }
        int k=n-5;
        for(int i=0;i<k;i++){
            queue.delete();
        }
        System.out.print("Latest hurdle race scores are: ");
        queue.display();
        }
}