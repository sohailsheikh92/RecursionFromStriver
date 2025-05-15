import java.util.Scanner;
public class Recusrion {

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
        fun(1,n);
    }
}
