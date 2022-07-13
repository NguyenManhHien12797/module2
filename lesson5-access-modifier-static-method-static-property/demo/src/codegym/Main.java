package codegym;

public class Main {
    public static void main(String[] args) {
        Employee emp= new Employee();
        // Tính đa hình: Cơ chế cho phép một biến thuộc kiểu giữ liệu của class cha có thể trỏ đến đối tượng của class con
        Person p= new Employee();
        //kiểu giữ liệu class con k trỏ được đến class cha
//        Employee e = new Person();
        //setName() của class cha mà biến emp vẫn gọi được
        emp.setName("Hien");
        emp.setLuong(4.5);
        p.setName("Dung");

        System.out.println(emp.getName()+ emp.getLuong());
        // setLuong() nằm ở class con, biến p ở class cha k gọi đk
//        p.setLuong();
        emp.thongTin();
        p.thongTin();
        Person per = new Person();
        per.thongTin();

    }
}
