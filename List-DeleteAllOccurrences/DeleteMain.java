import java.util.*;
public class DeleteMain{
    public static void main (String[] args) {
        LinkedList<Integer> llist=new LinkedList<Integer>();
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        obj.nextLine();
        for(int i=0;i<n;i++){
            int k=obj.nextInt();
            llist.add(k);
        }
        System.out.print("Enter the element to be deleted: ");
        int search=obj.nextInt();
        obj.nextLine();
        while(llist.contains(search)){
        llist.removeLastOccurrence(search);
        }
        System.out.print("The list after deletion: ");
        for(int i=0;i<llist.size();i++){
            System.out.print(llist.get(i)+" ");
        }
    }
}