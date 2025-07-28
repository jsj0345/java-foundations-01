package Practice;

public class Practice_58 {

    public static void main(String[] args) {
        int num=1;

        for(int i=1; i<=20; i++){

            if(num%2==0)
            {
                System.out.println(num);
            }

            num++;
        }

        num=1; // 여기서 초기화를 안하면 아래 while문은 의미가 없음.

        while(true)
        {
            if(num==21)
            {
                break;
            }

            if(num%2==0)
            {
                System.out.println(num);
            }

            num++;


        }




    }
}
