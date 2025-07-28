package Practice;

public class Practice_54 {

    public static void main(String[] args) {

        int sum = 0 , endNum=30;

        for (int i = 1; i<=endNum ; i++)
        {
            sum = sum + i;
        }

        System.out.println("1부터 "+ endNum + "까지의 합은 " + sum + "이다.");

    }
}

/* for문, while문을 비교 했을 때..
 초기화, 조건 검사, 반복 후 작업 등이 규칙적으로 한 줄에 모두 들어 있어서 코드를 이해하기 쉬움.
 */

