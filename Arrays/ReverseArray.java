import java.util.*;
class ReverseArray{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int itr=sc.nextInt();
        while(itr>0){
            int len=sc.nextInt();
            int arr[]=new int[len];
            for(int i=0;i<len;i++){
                arr[i]=sc.nextInt();
            }
            reverse(arr,0,len-1);
            printArr(arr);
            itr--;
        }
    }

    public static void reverse(int arr[], int s, int e){
        int temp=0;
        while(s<e){
            temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }

    public static void printArr(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

}