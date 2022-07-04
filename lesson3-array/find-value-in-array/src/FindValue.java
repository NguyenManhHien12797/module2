import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
        while (true){
            String[] student = {"a","b","c","d","e"};
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter student's name: ");
            String name= scanner.nextLine();
            boolean isExist = false;
            for(int i=0; i<student.length; i ++){
                if(name.equals(student[i])){
                    System.out.println("Học sinh "+student[i]+" ở vị trí "+i);
                    isExist= true;
                }
            }
            if(!isExist){
                System.out.println("lừa rồi");
            }
            System.out.println("-----------------------------------\n");
        }
    }
}
