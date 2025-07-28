package operator;

public class Operator3{

    public static void main(String[] args) {
        int sum1= 1 + 2 * 3; // 1 + (2 * 3)
        int sum2 =  (1 + 2) * 3; // 연산자 우선순위 변경
        System.out.println("sum1 = " + sum1);  // soutv를 쓰면 어떤 변수를 쓸지 선택할수 있게 해주고 자동적으로 바뀜
        System.out.println("sum2 = " + sum2);
        
    }
}

