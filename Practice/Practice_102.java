package Practice;

public class Practice_102 {
    public static void main(String[] args) {
        int sum = 0;
        int i =0;

        while(sum<=100) //몇까지 더해야 100을 넘지 않는지를 보기 위함이다.
        {
            System.out.println("0부터 "+i+"까지의 합은 "+sum);
            sum+=++i;
        }
    }
}
