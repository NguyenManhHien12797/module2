package miniTest;

public class ProgrammingBook extends Book{
    private String language;
    private String framework;
    public ProgrammingBook(int bookCode, String name, double price, String author,String language, String framework){
        super(bookCode,name,price,author);
        this.language= language;
        this.framework= framework;
    }
@Override
    public String toString(){
        return "   "+bookCode+" \t\t"+ name+"\t " + price+" \t"+ author +"\t "+ language+"\t "+ framework;
    }
    public String getLanguage(){
        return language;
    }
    public String getFramework(){
        return framework;
    }
    public void setLanguage(String language){
        this.language= language;
    }
    public void setFramework(){
        this.framework= framework;
    }
}
