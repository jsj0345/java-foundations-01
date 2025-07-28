package Practice;

public class Practice_53 {

    public static void main(String[] args) {
        int i=1;

        while(i<=5)
        {
            if(i==3)
            {
                i++;
                continue; // i==3 일 때, i의 값인 3만 나오지 않도록 설정.
            }

            System.out.println("i="+i);
            i++;
        }

    }
}

