package Practice;

public class Practice_106 {
    public static void main(String[] args) {

        for(int i=0; i<=10; i++)
        {
            if(i%3==0){ // 3으로 나눈 나머지가 0일 때, for 증감식으로 이동.
                continue;
            }
            System.out.println(i);
        }
    }
}
