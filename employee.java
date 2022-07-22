
public class employee {
    int id;
    String name;
    String capbac;
    int tuoi;
    String gioitinh;

    public employee(int id, String name, String capbac, int tuoi, String gioitinh) {
        this.id = id;
        this.name = name;
        this.capbac = capbac;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;
    }


    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String getbac(){
        return capbac;
    }
    public int gettuoi(){
        return tuoi;
    }
    public String getgioitinh(){
        return gioitinh;
    }

    public static void main(String[] args) {
        employee st = new employee(2805,"cuong","nhanvien", 18,"nam");
        System.out.println(st.getid());
        System.out.println(st.getname());
        System.out.println(st.getbac());
        System.out.println(st.gettuoi());
        System.out.println(st.getgioitinh());
    }
}
