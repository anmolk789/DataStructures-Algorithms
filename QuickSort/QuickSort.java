import java.util.Scanner;
public class QuickSort{
    public static void main (String[] args) {
        Scanner obj=new Scanner(System.in);
        int n;
        System.out.print("How many elements?");
        n=obj.nextInt();
        if(n<=0){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        int arr[]=new int[n];
        System.out.print("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
            System.out.println();
        }
        quicksort(arr,0,n-1);
        System.out.print("Array after sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void quicksort(int arr[],int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);
        }
    }
    public static int partition(int arr[],int low,int high){
        int pivotpoint=arr[high];
        int i=low-1;
        int j=0;
        for(j=low;j<=high-1;j++){
            if(arr[j]<=pivotpoint){
            i++;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }}
        int data=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=data;
        return i+1;
        
    }
}