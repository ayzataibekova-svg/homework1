import java.util.Scanner;
public class TaskE {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int v=in.nextInt();
        int t=in.nextInt();
        int a=(v*t)%109;
        if (a<0) {
            a +=109;
        }

        System.out.println(a);
    }

}

