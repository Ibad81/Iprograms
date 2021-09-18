import java.util.Scanner;

public class Paradrome {
    public static void main(String[] args) {
        int sum=0 ,temp,r;
        Scanner s= new Scanner(System.in);
        int n =s.nextInt();
        temp=n;
        while (n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if (temp==sum)
            System.out.println("It is a parodrome");
        else
            System.out.println("It is not a paradrome");

    }
}
