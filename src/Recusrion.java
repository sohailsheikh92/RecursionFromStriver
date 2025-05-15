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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        printing_1_to_n(1,n);
//        fun(1,n);
    }
}
