package Practice;

public class Practice_105 {
    public static void main(String[] args) {

        int sum = 0; //여기서 초기화를 안하면 sum과 i 값이 의미가 없어짐.
        int i = 0;

        while(true)
        {
            if(sum>100) // 만약 합계가 100이 넘으면 while문을 탈출한다.
            {
                break;
            }
            ++i; // 전위 연산자.
            sum+=i; // sum = sum + i
        }
        System.out.println("i= " +i);
        System.out.println("sum= "+sum);
    }
}
