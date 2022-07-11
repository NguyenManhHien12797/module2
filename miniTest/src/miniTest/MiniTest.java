package miniTest;

public class MiniTest {
    public static void main(String[] args) {
        Book objBook[] = new Book[10];
        objBook[0] = new ProgrammingBook(1, "Làm đĩ              ", 20,
                "Vũ Trọng Phụng", "Tiếng Việt", "Sách giấy");
        objBook[1] = new ProgrammingBook(2, "Đời thừa             ", 30,
                "Nam Cao        ", "Tiếng Việt", "Sách giấy");
        objBook[2] = new ProgrammingBook(3, "Lập trình Java       ", 40,
                "Báo mạng       ", "Java     ", "Sách mạng");
        objBook[3] = new ProgrammingBook(4, "Giải bài tập miniTest", 50,
                "Sách mạng      ", "Java     ", "Sách mạng");
        objBook[4] = new ProgrammingBook(5, "Tắt đèn              ", 60,
                "Ngô Tất Tố     ", "Tiếng Việt", "Sách giấy");
        objBook[5] = new FictionBook(6, "Số đỏ               ", 30,
                "Vũ Trọng Phụng", "Truyện ngắn");
        objBook[6] = new FictionBook(7, "Vợ chồng A Phủ         ", 40,
                "Tô Hoài        ", "Viễn tưởng 1");
        objBook[7] = new FictionBook(8, "Đất rừng phương Nam    ", 50,
                "Đoàn Giỏi      ", "Truyện ngắn");
        objBook[8] = new FictionBook(9, "Dế Mèn phiêu lưu ký    ", 120,
                "Tô Hoài        ", "Viễn tưởng 1");
        objBook[9] = new FictionBook(10, "Sóng ở đáy sông     ", 130,
                "Lê Lựu         ", "Truyện ngắn");

        display(objBook);
        // Tính tổng 10 quyển sách
        System.out.println("Tổng của 10 quyển sách trên là: "+getSumTotal(objBook)+" nghìn VNĐ");
        // Đếm số sách ProgrammingBook có language là Java
        int countLanguage=countByLanguage(objBook,"Java     ");
        System.out.println("Số sách ProgrammingBook có language là Java là: "+countLanguage);
        // Đếm số sách Fiction có category là Viễn tưởng 1
        int countCategory= countByCategory(objBook,"Viễn tưởng 1");
        System.out.println("Số sách Fiction có category là Viễn tưởng 1 là: "+ countCategory);
        // Đếm số sách Fiction có giá <100
        int countPrice= countByPrice(objBook,100);
        System.out.println("Số sách Fiction có giá < 100 là: "+countPrice);
    }
    public static void display(Book objBook[]){
        System.out.println("Những quyển sách vừa tạo là:");
        System.out.printf("%8s%10s%23s%12s%17s%12s%12s\n",
                "BookCode", "Name", "Price", "Author", "Language", "Framework", "Category");
        for (int i = 0; i < objBook.length; i++) {
            System.out.println(objBook[i].toString());
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------");

    }
    public static double getSumTotal(Book obj[]){
        double total=0;
        for(int i=0; i<obj.length;i++){
            total += obj[i].getPrice();
        }
       return total;
    }
    public static int countByLanguage(Book obj[],String language){
        int count =0;
       for(int i=0; i<obj.length; i++){
           if(obj[i] instanceof ProgrammingBook){
               String a = ((ProgrammingBook) obj[i]).getLanguage();
               if(a.equals(language)){
                   count++;
               }
           }
       }
        return count ;
    }
    public static int countByCategory(Book obj[],String category) {
        int count = 0;
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] instanceof FictionBook) {
                String a = ((FictionBook) obj[i]).getCategory();
                if (a.equals(category)) {
                    count++;
                }
            }
        }
        return count;
    }
        public static int countByPrice(Book obj[],double price){
            int count =0;
            for(int i=0; i<obj.length; i++){
                if(obj[i] instanceof FictionBook){
                    double a = ((FictionBook) obj[i]).getPrice();
                    if(a<price){
                        count++;
                    }
                }
            }
            return count ;
    }
}
