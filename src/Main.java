import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("c " + n + " is " + (n+1) + ".");
        System.out.println("v " + n + " is " + (n-1) + ".");
    }

}
