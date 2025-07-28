package Practice;

public class Practice_44 {

    public static void main(String[] args) {
        String grade;
        grade = "B";

        switch(grade)  // switch문을 이용하여 학점에 따라 결과를 다르게 출력
        {
            case "A":
                System.out.println("탁월한 성과입니다!");
                break;

            case "B":
                System.out.println("좋은 성과입니다!");
                break;

            case "C":
                System.out.println("준수한 성과입니다!");
                break;

            case "D":
                System.out.println("향상이 필요합니다.");
                break;

            default:
                System.out.println("잘못된 학점입니다.");


        }




    }
}




