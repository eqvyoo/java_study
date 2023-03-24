import java.util.Scanner;
import java.util.List;
public class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public void borrow() {
        System.out.println("대여할 책의 번호를 입력하세요");
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).canBorrow == true) {
                System.out.println((i + 1) + ". " + books.get(i).bookName + " - 대여 가능");
            } else {
                System.out.println((i + 1) + ". " + books.get(i).bookName + " - 대여 중");
            }
        }
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (books.get(num - 1).canBorrow == true) {
            books.get(num - 1).setStatus(false);
            System.out.println("정상적으로 대여가 완료되었습니다.");
        } else {
            System.out.println("대여 중인 책은 대여할 수 없습니다.");
        }

    }
}
