import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<Student> listStudent = new LinkedList<Student>();
        for(int i=0; i<3; i++){
            Student student  = new Student();
            Scanner sc = new Scanner(System.in);
            int id = sc.nextInt(); sc.nextLine();
            student.setMaHocSinh(id);
            String ten = sc.nextLine();
            student.setName(ten);
            listStudent.add(student);
        }
        for(int i=0; i<listStudent.size(); i++){
            System.out.println("phan tu thu "+(i+1));
            System.out.println(listStudent.get(i).getMaHocSinh());
            System.out.println(listStudent.get(i).getName());
        }
    }
}
