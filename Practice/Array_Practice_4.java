package Practice;

public class Array_Practice_4 {
    public static void main(String[] args) {
        int[] iArr = {100, 95, 80, 70, 60};

        for(int i=0; i<iArr.length; i++)
        {
           // System.out.println(iArr[i]); (println은 출력 후에 줄바꿈을 하는 특성이 있으므로 보기 불편 할 때가 있다.)

            if(i<=iArr.length-2) {

                System.out.print(iArr[i] + ","); //각 요소 간의 구별을 위해 쉼표를 넣는다.
            }else{

                System.out.println(iArr[i]); // 마지막 요소는 ,를 빼기 위함. (else를 안쓰면 ,가 남아서 보기 불편함.)
            }

        }

        System.out.println(); // 다음 출력이 바로 이어지지 않도록 줄 바꿈을 한다.
    }
}
