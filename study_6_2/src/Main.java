import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean flag = true;
    while (flag){
      try{
        System.out.println("휴대폰 번호를 입력해주세요. ");
        String input = scanner.nextLine();
        PhoneNumber phoneNumber = new PhoneNumber(input);
        System.out.println("휴대폰 번호를 정상적으로 입력하셨습니다. 입력하신 휴대폰 번호는 " + phoneNumber.getPhoneNumberFormally() + "입니다.");
      }catch(IllegalArgumentException e){
        System.out.println(e.getMessage());
      }
    }
  }
}