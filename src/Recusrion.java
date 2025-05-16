import java.util.Scanner;
public class Recusrion {

    //printing 1 to n
    static void printing_1_to_n(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        printing_1_to_n(i+1,n);

    }

    //printing names
    static void fun(int i,int n){
        if(i>n)
            return;
        System.out.println("Allah Hu Akbar");
        fun(i+1,n);
    }

    //printing n to 1
    static void printingnto1(int i,int n){
        if(i>n)
            return;
        System.out.println(n);
        printingnto1(i,n-1);
    }

    //using backtracking n to 1
    static void nto1(int i,int n){
        if(i>n)
                return;
        nto1(i+1,n);
        System.out.println(i);

    }

    //reversing an array using rescusrion (two pointers)
    static void rev(int i,int j,int arr[]){
        if(i>j)
            return;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        rev(i+1,j-1,arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n");
//        int n=sc.nextInt();
//        nto1(1,n);
//        printingnto1(1,n);
//        printing_1_to_n(1,n);
//        fun(1,n);

        int arr[]={1,2,3,4,5};
        int i=0,j=arr.length-1;
        rev(i,j,arr);
        for(int k : arr)
                System.out.println(k);

    }
}
