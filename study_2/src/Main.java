import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        int group,scoreHTML,scoreCSS,scoreJS, maxScore,minScore;
        double avgScore;
        Scanner input = new Scanner(System.in);
        System.out.println("몇 기인지 입력해주세요.");
        group = input.nextInt();
        System.out.println("HTML 과목 점수를 입력해주세요.");
        scoreHTML = input.nextInt();
        System.out.println("CSS 과목 점수를 입력해주세요.");
        scoreCSS = input.nextInt();
        System.out.println("Javascript 과목 점수를 입력해주세요.");
        scoreJS = input.nextInt();
        avgScore = (scoreJS + scoreCSS + scoreHTML) / 3.0;
        maxScore = Math.max(Math.max(scoreCSS,scoreJS),scoreHTML);
        minScore = Math.min(Math.min(scoreCSS,scoreJS),scoreHTML);

        if (scoreJS == 100 && scoreCSS == 100){
            System.out.println("합격입니다.\n" +
                    "전체 과목 중 최고점은 100점입니다.\n" +
                    "전체 과목 중 최저점은 100점입니다.\n" +"전체 과목의 평균은 " +avgScore+"점입니다.");
        }
        else if (scoreHTML == 100 && scoreCSS == 100){
            System.out.println("합격입니다.\n" +
                    "전체 과목 중 최고점은 100점입니다.\n" +
                    "전체 과목 중 최저점은 100점입니다.\n" +"전체 과목의 평균은 " +avgScore+"점입니다.");
        }
        else if (scoreHTML == 100 && scoreJS == 100){
            System.out.println("합격입니다.\n" +
                    "전체 과목 중 최고점은 100점입니다.\n" +
                    "전체 과목 중 최저점은 100점입니다.\n" +"전체 과목의 평균은 " +avgScore+"점입니다.");
        }
        else{
            if (group == 1 || group == 2){
                if ( avgScore >= 60){
                    System.out.println("합격입니다.");
                }
                else{
                    System.out.println("불합격입니다.");
                }

            }
            else if (group == 3){
                if (avgScore >= 70){
                    System.out.println("합격입니다.");
                }
                else{
                    System.out.println("불합격입니다.");
                }
            }
            System.out.println("전체 과목 중 최고점은 "+maxScore+"점입니다.");
            System.out.println("전체 과목 중 최저점은 "+minScore+"점입니다.");
            System.out.println("전체 과목의 평균은 "+avgScore+"점입니다.");
        }
    }
}

