import java.util.Scanner;

public class bai3buoi1 {
    public static int kiemTra(int n){
        if(n<2){
            return 0;
        }
        for(int i=2; i<n-1; i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap 1 so nguyen: ");
        int n = scanner.nextInt();
        while(n>=1000){
            System.out.println("nhap lai: ");
            n = scanner.nextInt();
        }
        System.out.println("cac so tu 0 den n: ");
        for(int i =0; i <=n; i++){
            if(kiemTra(i)==1){
                System.out.println(i);
            }
        }
    }
}