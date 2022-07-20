import java.util.Scanner;

public class bai2buoi1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap 1 so nguyen: ");
        int a = scanner.nextInt();
        for(int i =1; i <=20; i++){
            System.out.println("tich cua "+a+" va "+i+" = "+ (a*i));
        }
    }
}
