package miniTest;

public class FictionBook extends Book {
    private String category;
    public FictionBook(int bookCode, String name, double price, String author,String category){
       super(bookCode, name, price, author);
        this.category= category;
    }
    public String toString(){
        return "   "+super.getBookCode()+" \t\t"+ super.getName()+"\t " +
                super.getPrice()+" \t"+ super.getAuthor() +"\t\t\t\t\t\t\t  "+ category+ " ";
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category= category;
    }
}
