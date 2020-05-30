import java.util.Scanner;
class Queue{
    private int front,rear,size;
    private int qArray[];
    public Queue(int n){
        size=n;
        front=0;
        rear=0;
        qArray=new int[size];
    }
    public void insert(int d){
        if(rear==size){
            System.out.println("Queue Overflow");
            return;
        }else{
            qArray[rear++]=d;
        }
        return;
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
        for(int h=front;h<rear;h++){
            System.out.print(qArray[h]+" ");
        }
    }
    public void destroy(){
        int i,j,k;
        j=front;
        k=rear;
        for(i=j;i<k;i++){
            if(qArray[i]%2!=0){
                delete();
            }
        }
    }
    
}
public class Chocolate{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        int n;
        int data;
        System.out.print("Enter the no. of boxes:");
        n=obj.nextInt();
        obj.nextLine();
        System.out.println();
        if(n<=0 || n>10){
            System.out.println("Invalid input");
            System.exit(0);
        }
        Queue queue=new Queue(n);
        for(int i=1;i<=n;i++){
            System.out.print("Enter the no. of chocolates in box "+i+":");
            data=obj.nextInt();
            if(i==1){
                if(data<=0 || data%2!=0){
                    System.out.println("Sorry!!! First box always should contain positive even no. of chocolates");
                    return;
                }
            }
            queue.insert(data);
            System.out.println();
        }
        queue.destroy();
        System.out.print("No. of chocolates in each box: ");
        queue.display();
    }
}
