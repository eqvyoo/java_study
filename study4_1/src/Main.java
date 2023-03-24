import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Library library = new Library(Arrays.asList(
                new Book("클린코드(Clean Code)"),
                new Book("객체지향의 사실과 오해"),
                new Book("테스트 주도 개발(TDD)")
        ));
        library.borrow();
        library.borrow();
        library.borrow();
        library.borrow();
    }
}