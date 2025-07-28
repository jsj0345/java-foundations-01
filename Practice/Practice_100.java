package Practice;

public class Practice_100 {
    public static void main(String[] args) {

        for(int i=1; i<=5 ; i++) { // 1행 , 2행 , 3행, 4행 , 5행
            for (int j = 1; j <= i; j++) { // 행의 숫자에 맞게 별의 개수를 생성한다.
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
