import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("nhap 1 so: ");
            int number = sc.nextInt();
            for(int i=0; i<=9; i++){
                System.out.println(number+"*"+i+" = "+(number*i));
            }
        }while(true);
    }
}
