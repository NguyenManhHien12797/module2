package miniTest2;


import java.util.Scanner;

public class MiniTest {
    private static int size;

    public static void setSize(int size) {
        MiniTest.size = size;
    }

    public static void main(String[] args) {
        setSize(5);
        Employee employee[]= new Employee[size];
        employee[0]= new EmployeeFullTime(1,"Dung", 18,"0123456789","nguyendung@gmail.com",1500000,5000000,9000000);
        employee[1]= new EmployeeFullTime(2,"Hien",19,"0234123142","nguyenhien@gmail.com",1000000,500000,3000000);
        employee[2]= new EmployeeFullTime(3,"Hieu",19,"023412312","nguyenhieu@gmail.com",2000000,1500000,4000000);
        employee[3]= new EmployeePartTime(4,"Nam",19,"023412979","nguyennam@gmail.com",20);
        employee[4]= new EmployeePartTime(5,"Hoàng",19,"023412384","nguyenhoang@gmail.com",25);

        double avg= getAvgSalary(employee);
        System.out.print("Trung bình lương của các nhân viên trong công ty là: "+avg);

        Employee[] arr= getListEmployeeFullTime(employee,avg);
        System.out.println("\nDanh sách nhân viên có lương thấp hơn lương trung bình:");
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.print("Lương phải trả cho tất cả nhân viên bán thời gian là: "+totalSalaryPartTime(employee)+"\n");

        System.out.println("Sắp xếp nhân viên fulltime theo số lương tăng dần: ");
        sortEmployeeFullTime(employee);

        System.out.println("Thêm Employee");
        Employee[] newarr= add(employee);
        for(int i=0;i<newarr.length; i++){
            System.out.println(newarr[i]);
        }


    }
    // Nhập info nhân viên
    public static  Employee addinfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter code: ");
        int code=scanner.nextInt();
        System.out.print("Enter name: ");
        Scanner inputName= new Scanner(System.in);
        String name= inputName.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter phone: ");
        Scanner inputPhone= new Scanner(System.in);
        String phone=inputPhone.nextLine();
        System.out.print("Enter email: ");
        Scanner inputEmail= new Scanner(System.in);
        String email=inputEmail.nextLine();
        System.out.print("Enter bonus: ");
        double bonus= scanner.nextDouble();
        System.out.print("Enter fine: ");
        double fine= scanner.nextDouble();
        System.out.print("Enter fixedSalary: ");
        double fixedSalary= scanner.nextDouble();
        Employee newemp=new EmployeeFullTime(code, name,age,phone,email,bonus,fine,fixedSalary) ;
        return newemp;
    }
    // Thêm nhân viên
    public static Employee[] add(Employee[] arr){
        size++;
        Employee[] newarr= new Employee[size];
        for(int i=0; i< arr.length;i++){
            newarr[i]=arr[i];
        }
        for(int i= arr.length; i< newarr.length;i++){
            newarr[i]=addinfo();
        }
        return newarr;
    }
    // Tính lương trung bình
    public static double getAvgSalary(Employee[] array){
        double sum= 0;
        for(int i= 0; i<array.length; i++){
            if(array[i] instanceof EmployeeFullTime){
                sum+= ((EmployeeFullTime) array[i]).getNetSalary();
            }else {
                if(array[i] instanceof  EmployeePartTime){
                    sum+= ((EmployeePartTime) array[i]).getNetSalary(100000);
                }
            }
        }
        return sum/array.length;
    }

    public static  Employee[] getListEmployeeFullTime(Employee[] array,double avg){
        //Đếm số nhân viên Fulltime có lương nhỏ hơn lương trung bình
        int count=0;
        for(int i=0; i<array.length; i++){
            if( array[i] instanceof EmployeeFullTime){
                double salary = ((EmployeeFullTime) array[i]).getNetSalary();
                if(salary<avg){
                   count++;
                }
            }
        }
        Employee[] listEmployeeFullTime= new EmployeeFullTime[array.length];
        if(count==0){
            System.out.println("No employee is paid less than the average salary!");
        } else {
            // Đẩy số nhân viên có lương nhỏ hơn lương trung bình vào mảng
            for(int i= 0 ; i<array.length;i++){
                if(array[i] instanceof EmployeeFullTime){
                    if(((EmployeeFullTime) array[i]).getNetSalary()<avg){
                        listEmployeeFullTime[i]=array[i];
                    }
                }
            }
        }
        return listEmployeeFullTime;
    }
    // Tính lương trả cho parttime
    public static double totalSalaryPartTime(Employee[] arr){
        double total=0;
        for(int i= 0 ; i<arr.length; i++){
            if(arr[i] instanceof EmployeePartTime){
                total += ((EmployeePartTime)arr[i]).getNetSalary(100000);
            }
        }
        return total;
    }
    // Sắp xếp nhân viên full time có lương tăng dần
    public static void sortEmployeeFullTime(Employee[] arr){
        Employee temp= arr[0];
       for(int i=0; i<arr.length-1; i++){
           for(int j=i+1; j<arr.length; j++){
               if( arr[i] instanceof EmployeeFullTime && arr[j] instanceof  EmployeeFullTime){
                   double salary1= ((EmployeeFullTime) arr[i]).getNetSalary();
                   double salary2= ((EmployeeFullTime) arr[j]).getNetSalary();
                   if(salary1> salary2){
                      temp= arr[j];
                       arr[j]=arr[i];
                       arr[i]= temp;
                   }
               }
           }

       }
       for(int i=0; i<arr.length; i++){
           if(arr[i] instanceof EmployeeFullTime){
               System.out.println(arr[i]);
           }

       }
    }

}
