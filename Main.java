import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("--nhap thong tin lop--");
        Classroom classroom = initForClassRoom();
        while(true){
            System.out.println("--nhap thong tin hs--");
            Student student = initForStudent();
            System.out.println("--thong tin--");
            System.out.println("ma hs: "+student.getMaHocSinh());
            System.out.println("ten hs: "+  student.getName());
            System.out.println("tuoi: "+(2022-student.getNamSinh()));
            System.out.println("dia chi: "+student.getDiaChi());
            if(student.getLopHoc().equals(classroom.getTenLop())){
                System.out.println("hoc sinh thuoc lop!");
            }else{
                System.out.println("hoc sinh ko thuoc lop!");
            }
        }
    }
    public static Student initForStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma hs: ");
        int maHocSinh = sc.nextInt(); sc.nextLine();
        System.out.println("nhap ten: ");
        String name = sc.nextLine(); sc.nextLine();
        System.out.println("nhap gioi tinh: ");
        String gioiTinh = sc.nextLine();
        System.out.println("nhap dia chi: ");
        String diaChi = sc.nextLine();
        System.out.println("nhap nam sinh: ");
        int namSinh = sc.nextInt(); sc.nextLine();
        System.out.println("nhap lop: ");
        String lopHoc = sc.nextLine();
        Student student = new Student(maHocSinh,name,gioiTinh,diaChi,namSinh,lopHoc);
        return student;
    }
    public static Classroom initForClassRoom(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nahp ma lop hoc: ");
        int maLopHoc = sc.nextInt(); sc.nextLine();
        System.out.println("nhap ten lop: ");
        String tenLop = sc.nextLine();
        System.out.println("nhap so hs: ");
        int soHocSinh = sc.nextInt();
        Classroom classroom = new Classroom(maLopHoc,tenLop,soHocSinh);
        return classroom;
    }
}
