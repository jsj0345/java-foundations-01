package Practice;

public class Practice_43 {

    public static void main(String[] args) {
        double rating = 7.1;

        if (rating >= 9){ // 평점이 9 이상 일 때
            System.out.println(" '어바웃타임'을 추천합니다.");
        }
        if (rating >=8) { // 평점이 8 이상 9 미만 일 때
            System.out.println(" '토이 스토리'를 추천합니다.");
        }
        if (rating >= 7){ // 평점이 7 이상 8 미만 일 때
            System.out.println(" '고질라'를 추천합니다. ");
        }

    }
}
