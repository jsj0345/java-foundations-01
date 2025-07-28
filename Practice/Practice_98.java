package Practice;

public class Practice_98 {

    public static void main(String[] args) {
        int num = 0;

        for(int i = 1; i<=5 ;i++){
            num = (int) (Math.random()*6)+1;

            /*
            Math.random()은 앞에서 언급했듯이, 0<=Math.random()<1 사이의 숫자를 double형으로 반환한다.

            만약, 1과 6사이의 정수를 뽑아 내려면, 먼저 위 식에서 6를 곱한다.

            6를 곱하면, 0<=6*Math.random()<6 일 것이다.

            정수로 바꿔야 하므로 단순히 위처럼 하면 안된다. (int)를 붙여줘야 한다.

            따라서, 0<=(int) 5*Math.random()<5가 나올 것이고, 여기서 1부터 6까지 나오게 해야하므로 양 변에 1을 더해준다.

            즉, 1<=(int) 6*Math.random() + 1 <7이다. (1부터 6까지 정수들이 다 나오는것이다.)

             */


            System.out.println(num);
        }

    }
}
