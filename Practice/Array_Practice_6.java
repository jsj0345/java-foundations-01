package Practice;

import java.util.Arrays; // Arrays.toString()을 사용하기 위해 추가 됐다.

public class Array_Practice_6 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];

        //int[] iArr3 = new int[]{100,95,80,70,60}; 과 같음.
        int[] iArr3 = {100,95,80,70,60};
        char[] chArr ={'a','b','c','d'};

        for(int i=0; i<iArr1.length;i++)
        {
            iArr1[i] = i+1; // iArr1 배열의 모든 요소 초기화.
        }

        for(int i=0; i<iArr2.length; i++){
            iArr2[i]=(int)(Math.random()*10) + 1; // 1~10의 값을 배열에 저장.

            /*
            1~10인 이유는 뭘까?

            Math.random() 메서드는 0.0<=Math.random()<1.0임.
            10을 곱하면, 0.0*10<=10*Math.random()<10.0임.
            int형으로 바꾼다음 1을 더한다면?
            1<=(int)10*Math.random()+1<11임.
             */
        }

        // 배열에 저장된 값들을 출력한다.
        for(int i=0; i<iArr1.length;i++)
        {
            System.out.print(iArr1[i]+",");

        }

        System.out.println();

        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3); // 참조값 출력 , 실행할때마다 달라짐.
        System.out.println(chArr); // char 배열은 println메서드로 출력하면 각 요소가 구분자 없이 그대로 출력된다.


    }
}
