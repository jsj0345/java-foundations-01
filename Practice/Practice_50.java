package Practice;

public class Practice_50 {

    public static void main(String[] args) {
        int endNum,i,sum;
        i=0;
        sum=0;
        endNum=10;

        while(i<=endNum)  // endNum에 따라 sum의 결과가 달라짐. endNum이 20이면 1부터 20까지 더하는 코드임.
        {
            sum=sum+i;
            System.out.println("i=" + i + " sum="+sum);
            i++;
        }

        System.out.println(sum);

    }
}


