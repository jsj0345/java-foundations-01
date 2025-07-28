package Practice;

import java.util.Arrays;

public class Array_Practice_9 {
    public static void main(String[] args) {
        int[] numArr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numArr));

        for(int i=0; i<100; i++) // 변수에 있는 값을 서로 바꾸기 위함.
        {
            int n = (int)(Math.random()*10); // 0~9 중 임의로 한 값을 얻음.
            int tmp =numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }
        System.out.println(Arrays.toString(numArr));
    }
}
