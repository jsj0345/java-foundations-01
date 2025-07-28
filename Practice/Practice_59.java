package Practice;

public class Practice_59 {

    public static void main(String[] args) {
        int max=100,sum=0,j=1;

        for(int i=1; i<=max; i++){
            sum=sum+i;

        }

        System.out.println("sum="+sum);

        sum=0;

        while(j<=max)
        {
            sum=sum+j;
            j++;
        }

        System.out.println("sum="+sum);

    }
}
