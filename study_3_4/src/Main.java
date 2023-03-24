import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        ArrayList<String>names = new ArrayList<>();
        boolean flag = true;
        System.out.println("학생의 이름을 입력하고 엔터를 누르세요. (한글로만 입력해야 합니다.)\n" +
                "학생들을 다 입력했다면, print라고 입력해주세요.");
        while(flag){
            String st = input.nextLine();
            if (st.equals("print")){
                flag = false;
            }
            else if (st.matches(".*[ㄱ-ㅎㅏ-ㅣ가-힣]+.*")){
                names.add(st);
            } else{
                System.out.println("학생의 이름은 한글로만 입력해야 합니다.");
            }
        }
        Collections.sort(names);
        System.out.println("[학생 명단(가나다순)]");
        for (String data: names) {
            System.out.println(data);
        }
    }
}