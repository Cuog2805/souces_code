
public class baitapbuoi2 {
    public static void main(String[] args) {
//nhap thong tin lop
        String name_class = "";
        int maLopHoc = 0;
        int soLuongHocSinh=0;
        lophoc lh = new lophoc(maLopHoc, name_class,soLuongHocSinh);
        System.out.println("nhap thong tin lop: ");
        lh.setSoLuongHocSinh(soLuongHocSinh);
        lh.setMaLopHoc(maLopHoc);
        lh.setName_class(name_class);
//nhap thong tin hs
        int maHocSinh = 0;
        int tuoi = 0;
        String name = "";
        String gioiTinh = "";
        String diaChi = "";
        int namSinh = 0;
        String tenLop = "";
        hocsinh hs = new hocsinh(maHocSinh,tuoi,name,gioiTinh,diaChi,namSinh,tenLop);
        System.out.println("nhap thong tin hoc sinh: ");
        hs.setMaHocSinh(maHocSinh);
        hs.setTuoi(tuoi);
        hs.setName(name);
        hs.setGioiTinh(gioiTinh);
        hs.setDiaChi(diaChi);
        hs.setNamSinh(namSinh);
        hs.setTenLop(tenLop);

        System.out.println("ma hoc sinh: "+hs.getMaHocSinh());
        System.out.println("ten hs: "+hs.getName());
        System.out.println("tuoi: "+hs.getTuoi());
        System.out.println("ten lop: "+hs.getTenLop());

        String name_class1 = lh.getName_class();
        String tenLop1 = hs.getTenLop();

        if(name_class1.equals(tenLop1)){
            System.out.println("hoc sinh thuoc lop!");
        }else{
            System.out.println("hoc sinh ko thuoc lop!");
        }
    }

}
