import java.util.Scanner;

public class lophoc {
    int maLopHoc;
    String name_class;
    int soLuongHocSinh;
    public lophoc(int maLopHoc, String name_class, int soLuongHocSinh){
        this.maLopHoc = maLopHoc;
        this.name_class = name_class;
        this.soLuongHocSinh = soLuongHocSinh;
    }
    public String getName_class(){
        return name_class;
    }

    public int getMaLopHoc() {
        return maLopHoc;
    }

    public int getSoLuongHocSinh() {
        return soLuongHocSinh;
    }
    public void setSoLuongHocSinh(int soLuongHocSinh){
        System.out.println("nhap so hoc sinh: ");
        Scanner sc = new Scanner(System.in);
        soLuongHocSinh = sc.nextInt();
        this.soLuongHocSinh = soLuongHocSinh;
    }

    public void setMaLopHoc(int maLopHoc) {
        System.out.println("nhap ma lop hoc: ");
        Scanner sc = new Scanner(System.in);
        maLopHoc = sc.nextInt();
        this.maLopHoc = maLopHoc;
    }

    public void setName_class(String name_class) {
        System.out.println("nhap ten lop: ");
        Scanner sc = new Scanner(System.in);
        name_class = sc.nextLine();
        this.name_class = name_class;
    }

    public static void main(String[] args) {
        String name_class = "";
        int maLopHoc = 0;
        int soLuongHocSinh=0;

        lophoc lh = new lophoc(maLopHoc, name_class,soLuongHocSinh);

        lh.setSoLuongHocSinh(soLuongHocSinh);
        lh.setMaLopHoc(maLopHoc);
        lh.setName_class(name_class);

        System.out.println("thong tin: ");
        System.out.println(lh.getName_class());
        System.out.println(lh.maLopHoc);
        System.out.println(lh.getSoLuongHocSinh());
    }
}
