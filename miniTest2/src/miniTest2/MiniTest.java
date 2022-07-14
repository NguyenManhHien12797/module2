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

        System.out.println("Add Employee");
        Employee[] newarr= add(employee);
        for(Employee arr:newarr){
            System.out.println(arr);
        }

        double avg= getAvgSalary(newarr);
        System.out.print("Trung bình lương của các nhân viên trong công ty là: "+avg);

        Employee[] arr= getListEmployeeFullTime(newarr,avg);
        System.out.println("\nDanh sách nhân viên full time có lương thấp hơn lương trung bình:");
        for(Employee newarr1:arr){
            System.out.println(newarr1);
        }
        int count= 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==null){
                count++;
            }
        }
        if(count==arr.length){
            System.out.println("No employee is paid less than the average salary!");
        }else {
            for(Employee newarr1:arr){
                System.out.println(newarr1);
            }
        }

        System.out.print("Lương phải trả cho tất cả nhân viên bán thời gian là: "+totalSalaryPartTime(newarr)+"\n");

        System.out.println("Sắp xếp nhân viên fulltime theo số lương tăng dần: ");
        sortEmployeeFullTime(newarr);



    }
    // Nhập info nhân viên fulltime
    public static  Employee addInfoFullTime(){
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
//        Employee newemp=new EmployeeFullTime(code, name,age,phone,email,bonus,fine,fixedSalary) ;
        return new EmployeeFullTime(code, name,age,phone,email,bonus,fine,fixedSalary) ;

    }
    //Nhập info nhân viên parttime
    public static  Employee addInfoPartTime(){
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
        System.out.print("Enter workingHours: ");
        double workingHours= scanner.nextDouble();
//        Employee newemp=new EmployeePartTime(code, name,age,phone,email,workingHours) ;
        return new EmployeePartTime(code, name,age,phone,email,workingHours) ;
    }
    public static int yourChoice(){
        System.out.printf("%s\n%s\n%s","Menu","1.Add EmployFullTime","2.Add EmployPartTime");
        System.out.print("\nYour choice:");
        Scanner scanner= new Scanner(System.in);
        return scanner.nextInt();
    }
    // Thêm nhân viên
    public static Employee[] add(Employee[] arr){
        size++;
        Employee[] newarr= new Employee[size];
        System.arraycopy(arr,0,newarr,0,arr.length);
        for(int i= arr.length; i< newarr.length;i++){
            if(yourChoice()==1){
                newarr[i]= addInfoFullTime();
            }else {
                newarr[i]= addInfoPartTime();
            }

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

        Employee[] listEmployeeFullTime= new EmployeeFullTime[array.length];
            // Đẩy số nhân viên có lương nhỏ hơn lương trung bình vào mảng
            for(int i= 0 ; i<array.length;i++){
                if(array[i] instanceof EmployeeFullTime){
                    if(((EmployeeFullTime) array[i]).getNetSalary()<avg){
                        listEmployeeFullTime[i]=array[i];
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
