package Practice;

public class Array_Practice_10 {
    public static void main(String[] args) {

        int[] ball = new int[45];

        //1
        for(int i=0;i< ball.length; i++) {
            ball[i] = i + 1; // index 0부터 44까지 1~45를 다 넣음.
        }

        int tmp = 0; // 두 변수에 있는 값을 바꾸기 위해 다리 역할을 하는 변수.
        int j = 0;   //  난수에 값을 저장하기 위함.

        //2
        for(int i=0; i<6 ; i++) // 당첨번호 6개의 숫자를 추려내기 위한 반복.
        {
            j=(int)(Math.random()*45); // 0~44 사이의 임의의 값을 얻음.
            tmp=ball[i];
            ball[i]=ball[j];
            ball[j]=tmp;
        }

        //3
        for(int i=0; i<6 ; i++) // 당첨번호 출력.
        {
                System.out.printf("ball[%d]=%d\n",i,ball[i]);
        }
    }
}

