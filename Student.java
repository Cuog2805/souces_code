public class Student {
    int maHocSinh;
    String name;
    String gioiTinh;
    String diaChi;
    int namSinh;
    String lopHoc;

    public Student(int maHocSinh, String name, String gioiTinh, String diaChi, int namSinh, String lopHoc) {
        this.maHocSinh = maHocSinh;
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
        this.lopHoc = lopHoc;
    }
    public Student() {
        this.maHocSinh = maHocSinh;
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
        this.lopHoc = lopHoc;
    }

    public int getMaHocSinh() {
        return maHocSinh;
    }

    public String getName() {
        return name;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String getLopHoc() {
        return lopHoc;
    }

    public void setMaHocSinh(int maHocSinh) {
        this.maHocSinh = maHocSinh;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setLopHoc(String lopHoc) {
        this.lopHoc = lopHoc;
    }
}
