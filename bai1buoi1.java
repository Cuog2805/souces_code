import java.util.Scanner;

public class bai1buoi1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap 3 do dai 3 canh: ");
        int a = scanner.nextInt();
        while(a<=0){
            System.out.println("nhap lai: ");
            a = scanner.nextInt();
        }
        int b = scanner.nextInt();
        while(b<=0){
            System.out.println("nhap lai: ");
            b = scanner.nextInt();
        }
        int c = scanner.nextInt();
        while(c<=0){
            System.out.println("nhap lai: ");
            c = scanner.nextInt();
        }
        if((a*a==b*b+c*c)||(b*b==a*a+c*c)||(c*c==a*a+b*b)){
            System.out.println("tam giac vuong!");
        } else{
            System.out.println("tam giac ko vuong!");
        }
    }
}
