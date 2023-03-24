public class Book {
    public String bookName;
    public boolean canBorrow;
    Book(String name){
        this.bookName = name;
        this.canBorrow = true;
    }
    public void setStatus(boolean st){
        this.canBorrow = st;
    }
    public String getBookName(){
        return bookName;
    }
    public boolean getStatus(){
        return canBorrow;
    }
}
