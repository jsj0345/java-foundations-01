package Practice;

public class Practice_40 {

    public static void main(String[] args) {
        int score = 75;
        char grade;

        if(score>=90)
        {
            grade = 'A';
        }
        else if (score>=80)
        {
            grade = 'B';

        }

        else if(score>=70)
        {
            grade = 'C';
        }

        else if(score>=60)
        {
            grade = 'D';
        }
        else
        {
            grade = 'F';
        }

        System.out.println("score : " +score);
        System.out.println("출력 : 학점은 " + grade + " 입니다. ");

    }
}


