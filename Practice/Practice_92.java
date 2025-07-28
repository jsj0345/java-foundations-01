package Practice;

public class Practice_92 {

    public static void main(String[] args) {
        int num = 0;

        // 괄호{} 안의 내용을 5번 반복한다.
        for (int i = 1; i<=5 ; i++){
            num = (int) (Math.random() * 6) +1; // Math.random()은 난수를 얻기 위한 메소드임. 0에서 1사이 숫자를 double형으로 출력함. 0이상 1미만임.
            System.out.println(num);
        }

    }
}
