package Practice;

import java.util.Scanner;

public class Practice_96 {
    public static void main(String[] args) {

        int score = 0;
        char grade = ' ', opt ='0';

        System.out.print("점수를 입력해주세요.>");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt(); // 화면을 통해 입력받은 점수를 score에 저장.

        if(score>=90){   // 점수가 90점 보다 크거나 같으면 A학점은 확보.
            grade = 'A';
            if(score>=98){ // 90점 이상이면 안에 있는 if문 조건식 맞는지 파악. 98점이상이면 A+ (score>=98 -> A+)
                opt='+';
            }
            else if(score<94){ // 90점 이상이면서 94점 미만일땐 A-
                opt = '-';
            } // 90-93점은 A- , 94 -97점은 A0 , 98점이상은 A+.

        } else if(score>=80){ // 80점이상이면 B는 확보.
            grade = 'B';
            if(score>=88){ // 88점이상이면 B+
                opt='+';
            }
            else if(score<84){ //80점 이상이면서 84점 미만이면 B-
                opt='-';
            }  // 즉, 80-83점은 B- 84-87점은 B0(처음에 opt='0'으로 초기화 했기 때문.) 88-89점은

        } else{ // 80점 미만이면 C학점.
            grade = 'C';
        }

        System.out.println("당신의 학점은 " +grade+opt+"입니다."); // 문자열 합치기.



    }
}
