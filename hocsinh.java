import java.util.Scanner;

public class hocsinh {
    int maHocSinh;
    int tuoi;
    String name;
    String gioiTinh;
    String diaChi;
    int namSinh;
    String tenLop;
    public hocsinh(int maHocSinh, int tuoi,String name, String gioiTinh, String diaChi, int namSinh, String tenLop){
        this.maHocSinh = maHocSinh;
        this.tuoi = tuoi;
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
        this.tenLop = tenLop;
    }
    public int getMaHocSinh(){
        return maHocSinh;
    }
    public String getName(){
        return name;
    }
    public int getTuoi(){
        return tuoi;
    }
    public String getDiaChi(){
        return diaChi;
    }
    public String getTenLop(){
        return tenLop;
    }
    public void setMaHocSinh(int maHocSinh){
        System.out.println("nhap ma hoc sinh: ");
        Scanner sc = new Scanner(System.in);
        maHocSinh = sc.nextInt();
        this.maHocSinh = maHocSinh;
    }

    public void setTuoi(int tuoi) {
        System.out.println("nhap tuoi: ");
        Scanner sc = new Scanner(System.in);
        tuoi= sc.nextInt();
        this.tuoi = tuoi;
    }
    public void setName(String name) {
        System.out.println("nhap ten hs: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        this.name = name;
    }

    public void setGioiTinh(String gioiTinh) {
        System.out.println("nhap gioi tinh: ");
        Scanner sc = new Scanner(System.in);
        gioiTinh = sc.nextLine();
        this.gioiTinh = gioiTinh;
    }

    public void setDiaChi(String diaChi) {
        System.out.println("nhap dia chi: ");
        Scanner sc = new Scanner(System.in);
        diaChi = sc.nextLine();
        this.diaChi = diaChi;
    }

    public void setNamSinh(int namSinh) {
        System.out.println("nhap nam sinh: ");
        Scanner sc = new Scanner(System.in);
        namSinh = sc.nextInt();
        this.namSinh = namSinh;
    }

    public void setTenLop(String tenLop) {
        System.out.println("nhap ten lop: ");
        Scanner sc = new Scanner(System.in);
        tenLop = sc.nextLine();
        this.tenLop = tenLop;
    }

    public static void main(String[] args) {
        int maHocSinh = 0;
        int tuoi = 0;
        String name = "";
        String gioiTinh = "";
        String diaChi = "";
        int namSinh = 0;
        String tenLop = "";
        hocsinh hs = new hocsinh(maHocSinh,tuoi,name,gioiTinh,diaChi,namSinh,tenLop);

        hs.setMaHocSinh(maHocSinh);
        hs.setTuoi(tuoi);
        hs.setName(name);
        hs.setGioiTinh(gioiTinh);
        hs.setDiaChi(diaChi);
        hs.setNamSinh(namSinh);
        hs.setTenLop(tenLop);
    }
}
