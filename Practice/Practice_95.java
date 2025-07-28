package Practice;

import java.util.Scanner;

public class Practice_95 {
    public static void main(String[] args) {

        int score = 0; // score를 저장하기 위한 변수.
        char grade=' '; // 학점을 저장하기 위한 변수. 공백으로 초기화한다.

        System.out.print("점수를 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 score에 저장.

        /*
        Scanner scanner = new Scanner(System.in);

        이 코드는 객체와 클래스를 배워야 정확히 이해할 수 있다.
        지금은 Scanner의 기능을 사용하기 위해 new를 사용해서 Scanner를 만든다 정도로 이해하면 된다.
        Scanner는 System.in을 사용해서 사용자의 입력을 편리하게 받도록 도와준다.

        Scanner scanner 코드는 scanner 변수를 선언하는 것이다.
        이제부터 scanner 변수를 통해서 scanner를 사용할 수 있다.
         */

        if(score>=90)  // score가 90점 보다 같거나 크면 A학점.
        {
            grade = 'A';
        } else if(score>=80) // score가 80점 보다 같거나 크면 B학점. 80 <= score <90
        {
            grade= 'B';
        } else if(score>=70){ // score가 70점보다 같거나 크면 C학점. 70 <= score <80
            grade ='C';
        } else{
            grade='D'; // 나머지는 D학점.
        }
        System.out.println("당신의 학점은 " +grade +"입니다.");



    }
}
