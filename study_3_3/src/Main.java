import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        List<Integer> player = new ArrayList<>();
        List<Double> score = new ArrayList<>();
        String in;
        int playernum;
        double playerscore;
        while (true) {
            System.out.println("선수의 번호를 입력하세요");
            in = input.next();
            if (in.equals("print")) {
                break;
            }
            playernum = Integer.parseInt(in);
            System.out.println("이 선수의 100m 달리기 기록이 몇 초인지 입력하세요.");
            playerscore = input.nextDouble();
            if (player.contains(playernum)) {
                score.set(player.indexOf(playernum), Math.round(playerscore * 100) / 100.0);
            } else {
                player.add(playernum);
                score.add(Math.round(playerscore * 100) / 100.0);
            }
        }
        // score 리스트에서 min값을 찾고, 그 min값의 인덱스 값과 같은 player의 인덱스 값을 출력하기
        System.out.println("1등 : " + player.get(score.indexOf(Collections.min(score))) + "번 선수 / "
            + Collections.min(score) + "초 (참가인원 : " + score.size() + "명)");
    }
}