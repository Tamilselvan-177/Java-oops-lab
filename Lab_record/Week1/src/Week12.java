import java.util.Scanner;

class Week12{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        a = (a>=0)?a:(-1*a);
        System.out.printf("%d",a%10);
    }
}