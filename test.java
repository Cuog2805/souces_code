import java.util.Scanner;

public class test {
    public static int chuVihcn(int dai, int rong){
        int chuvi = (dai+rong)*2;
        return chuvi;
    }
    public static int dienTichhcn(int dai, int rong){
        int dienTich = dai*rong;
        return dienTich;
    }

    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("nhap chieu rong: ");
        int a = st.nextInt();
        System.out.println("nhap chieu dai: ");
        int b = st.nextInt();
        System.out.println("tinh chu vi chon1 or tinh dien tich chon2");
        int chon = st.nextInt();
        while((chon!=1)&&(chon!=2)){
            System.out.println("chon lai:");
            chon = st.nextInt();
        }
        if(chon==1){
            System.out.println("chuvi: " + chuVihcn(a,b));
        }else if(chon==2){
            System.out.println("dientich: "+ dienTichhcn(a,b));
        }

    }
}
