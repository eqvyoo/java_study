public class PhoneNumber {
  private String number;
  public PhoneNumber(String number) {
    if (!number.substring(0,3).equals("010")){
      throw new IllegalArgumentException("휴대폰 번호는 010으로 시작해야 합니다.");
    }
    if (number.length()!= 11){
      throw new IllegalArgumentException("휴대폰 번호는 11글자여야 합니다.");
    }
    else{
      this.number = number;
    }
  }
  public String getPhoneNumberFormally() {
    return number.substring(0,3)+"-"+number.substring(3,7)+"-"+number.substring(7,11);
  }
}