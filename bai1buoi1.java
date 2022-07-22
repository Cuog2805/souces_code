import java.util.Scanner;

public class bai1buoi1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap 3 do dai 3 canh: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        while(a<=0||b<=0||c<=0||(a+b<c)||(a+c<b)||(b+c<a)){
            System.out.println("nhap 3 do dai 3 canh: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
        }

        if((a*a==b*b+c*c)||(b*b==a*a+c*c)||(c*c==a*a+b*b)){
            System.out.println("tam giac vuong!");
        } else{
            System.out.println("tam giac ko vuong!");
        }
    }
    // phương thức khởi tạo ko tham số
    // như 1 cái hàm



}
