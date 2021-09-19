import java.util.Scanner;

//public class Paradrome {
//    public static void main(String[] args) {
//        int sum=0 ,temp,r;
//        Scanner s= new Scanner(System.in);
//        int n =s.nextInt();
//        temp=n;
//        while (n>0){
//            r=n%10;
//            sum=(sum*10)+r;
//            n=n/10;
//        }
//        if (temp==sum)
//            System.out.println("It is a parodrome");
//        else
//            System.out.println("It is not a paradrome");
//
//    }
//}

//OOP Method

public class Paradrome{
    private int num;
    public Paradrome(int num){
        this.num=num;

    }
    public void paradromeno(){
        int sum = 0, r, temp;
        temp = num;
        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }

        if (sum == temp)
            System.out.println("It is a paradrome");
        else
            System.out.println("It is not a paradrome");
    }
}
class Paradromeno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Paradrome obj=new Paradrome(sc.nextInt());
        obj.paradromeno();


    }
}