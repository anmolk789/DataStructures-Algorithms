import java.util.*;
public class ListDriver{
    public static void main (String[] args) {
        LinkedList<Integer> llist=new LinkedList<Integer>();
        Scanner obj=new Scanner(System.in);
        String first="";
        int n=obj.nextInt();
        obj.nextLine();
        for(int i=0;i<n;i++){
            String f=obj.next();
            first += f;
            llist.add(Integer.parseInt(f));
        }
        String res="";
        for(int j=llist.size()-1;j>=0;j--){
            res += llist.get(j);
        }
       // System.out.println(first);
       // System.out.println(res);
        if(first.equals(res)){
            System.out.println(1);
        }else
        {
            System.out.println(0);
        }
    }
}


