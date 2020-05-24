import java.util.Scanner;
class List{
    static Node head;
    private static class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    public void append(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=new Node(data);
            return;
        }
        newnode.next=null;
        Node last=head;
        while(last.next!=null){
           last=last.next;
        }
        last.next=newnode;
        return;
    }
    public Node reverse(){
        Node prev=null;
        Node current=head;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
        return head;
    }
    public void display(){
        Node disp=head;
        while(disp!=null){
            System.out.print(disp.data+" ");
            disp=disp.next;
        }
    }
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        List llist=new List();
        String res="Yes";
        String ans;
        do{
            System.out.println("Enter the value:");
            int num=obj.nextInt();
            obj.nextLine();
            llist.append(num);
            System.out.println("Do you want to add another node? Type Yes/No");
            ans=obj.nextLine();
        }while(ans.equalsIgnoreCase(res));
        System.out.print("The elements in the linked list are: ");
        llist.display();
        llist.reverse();
        System.out.print("\nThe elements in the reversed linked list are : ");
        llist.display();
        
    }
}