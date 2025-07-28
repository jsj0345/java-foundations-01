package Practice;

public class Practice_94 {
    public static void main(String[] args) {

        int x = 0;

        if(x==0) // true이므로 {} 안에 있는 문장 수행.
        {
            System.out.println("x==0");
        }

        if(x!=0) // false이므로 {} 안에 있는 문장 수행x.
        {
            System.out.println("x!=0");
        }

        if(!(x==0)) // false이므로 {} 안에 있는 문장 수행x.
        {
            System.out.println("!(x==0)");
        }

        if(!(x!=0)) // true이므로 {} 안에 있는 문장 수행.
        {
            System.out.println("!(x!=0)");
        }

        x = 1;

        if(x==0)  // false이므로 {} 안에 있는 문장 수행x.
        {
            System.out.println("x==0");
        }

        if(x!=0) // true이므로 {} 안에 있는 문장 수행.
        {
            System.out.println("x!=0");
        }

        if(!(x==0)) // true이므로 {} 안에 있는 문장 수행.
        {
            System.out.println("!(x==0)");
        }

        if(!(x!=0))  // false이므로 {} 안에 있는 문장 수행x.
        {
            System.out.println("!(x!=0)");
        }


    }
}
