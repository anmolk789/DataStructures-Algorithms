import java.util.Scanner;
class Queue{
    private static int front,rear,size;
    private static int qArray[];
    public Queue(int s){
        this.size=s;
        this.front=0;
        this.rear=0;
        qArray=new int[this.size];
    }
    public void insert(int data){
        if(rear==size){
            System.out.println("Queue Overflow");
            return;
        }else{
            qArray[rear]=data;
            rear++;
        }
    }
    public int delete(){
        int element=0;
        if(front==rear){
            System.out.println("Queue is Empty");
            System.exit(0);
        }
        else{
            element=qArray[front];
            front++;
        }
        return element;
    }
    public void traverse(){
        for(int i=front;i<rear;i++){
            System.out.print(qArray[i]+" ");
        }
    }
}
public class Ticket{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of customer takes the tickets:");
        n=obj.nextInt();
        obj.nextLine();
        if(n<1){
            System.out.println("Invalid Number");
            System.exit(0);
        }
        Queue queue=new Queue(n);
        for(int i=1;i<=n;i++){
            queue.insert(i);
        }
        System.out.println("The tickets in the system are:");
        queue.traverse();
        System.out.println();
        System.out.println("Enter the number of tickets served:");
        int tickets=obj.nextInt();
        obj.nextLine();
        if(tickets>n || tickets<1){
            System.out.println("Invalid Number");
            System.exit(0);
        }
        System.out.println("The served tickets are:");
        for(int i=1;i<=tickets;i++){
            System.out.print(queue.delete()+" ");
        }
        System.out.println();
        if(tickets==n){
            System.out.println("No more tickets to be served");
            System.exit(0);
        }else{
            System.out.println("The unserved tickets are:");
            for(int i=tickets+1;i<=n;i++){
                System.out.print(queue.delete()+" ");
            }
        }
        }
}