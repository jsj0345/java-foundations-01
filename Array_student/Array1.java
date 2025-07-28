package Array_student;

public class Array1 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언, int형 타입을 사용하는 배열. (배열을 담을 수 있음.)
        students = new int[5]; // int가 5개 있는 긴 막대를 만든다.

        // 변수 값 대입.
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        System.out.println("학생1 점수: "+ students[0]);
        System.out.println("학생2 점수: "+ students[1]);
        System.out.println("학생3 점수: "+ students[2]);
        System.out.println("학생4 점수: "+ students[3]);
        System.out.println("학생5 점수: "+ students[4]);

        System.out.println(students);
    }

}
