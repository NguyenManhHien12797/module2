package miniTest;

public class MiniTest {
    public static void main(String[] args) {
        ProgrammingBook objBook[]= new ProgrammingBook[5];
        objBook[0]= new ProgrammingBook(1,"Làm đĩ              ",20,
                "Vũ Trọng Phụng","Tiếng Việt","Sách giấy");
        objBook[1]= new ProgrammingBook(2,"Đời thừa             ",30,
                "Nam Cao        ","Tiếng Việt","Sách giấy");
        objBook[2]= new ProgrammingBook(3,"Lập trình Java       ",40,
                "Báo mạng       ","Java     ","Sách mạng");
        objBook[3]= new ProgrammingBook(4,"Giải bài tập miniTest",50,
                "Sách mạng      ","Java     ","Sách mạng");
        objBook[4]= new ProgrammingBook(5,"Tắt đèn              ",60,
                "Ngô Tất Tố     ","Tiếng Việt","Sách giấy");
        FictionBook obj2Book[]= new FictionBook[5];
        obj2Book[0] = new FictionBook(6,"Số đỏ               ",30,
                "Vũ Trọng Phụng","Truyện ngắn");
        obj2Book[1] = new FictionBook(7,"Vợ chồng A Phủ         ",40,
                "Tô Hoài        ","Viễn tưởng 1");
        obj2Book[2] = new FictionBook(8,"Đất rừng phương Nam    ",50,
                "Đoàn Giỏi      ","Truyện ngắn");
        obj2Book[3] = new FictionBook(9,"Dế Mèn phiêu lưu ký    ",120,
                "Tô Hoài        ","Viễn tưởng 1");
        obj2Book[4] = new FictionBook(10,"Sóng ở đáy sông     ",130,
                "Lê Lựu         ","Truyện ngắn");
        System.out.println("Những quyển sách vừa tạo là:");
        System.out.printf("%8s%10s%23s%12s%17s%12s%12s\n",
                "BookCode","Name","Price","Author","Language","Framework", "Category");
        for(int i= 0; i<objBook.length;i++){
            System.out.println(objBook[i].toString());
        }
        for(int i= 0; i<obj2Book.length;i++){
            System.out.println(obj2Book[i].toString());
        }
        System.out.println("------------------------------------------------------------------------");
        // Tính tổng 10 quyển sách
        double total=0;
        for(int i= 0; i<objBook.length;i++){
            total +=objBook[i].getPrice();
        }
        for(int i= 0; i<obj2Book.length; i++){
            total += obj2Book[i].getPrice();
        }
        System.out.println("Tổng tiền của 10 quyển sách là: "+total+ " nghìn VNĐ");
        // Đếm số sách ProgrammingBook có language là Java
        int count=0;
        for(int i= 0; i< objBook.length;i++){
            if(objBook[i].getLanguage()=="Java"){
                count++;
            }
        }
        System.out.println("Số sách Programming có language là Java là : "+count);
        //Đếm số sách Fiction có category là Viễn tưởng 1
        int countCategory=0;
        for(int i= 0; i<obj2Book.length; i++){
            if(obj2Book[i].getCategory()=="Viễn tưởng 1"){
                countCategory++;
            }
        }
        System.out.println("Số sách Fiction có category là Viễn tưởng 1 là: "+ countCategory);
        //Đếm số sách Fiction có giá <100
        int countprice= 0;
        for(int i= 0; i<obj2Book.length; i++){
            if(obj2Book[i].getPrice()<100){
                countprice++;
            }
        }
        System.out.println("Số sách Fictiong có giá <100 là: "+ countprice);

    }

}
