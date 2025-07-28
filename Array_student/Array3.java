package Array_student;

public class Array3 {
    public static void main(String[] args) {

        int[] students = new int[]{90,80,70,60,50}; // 배열 생성과 초기화.

        // new int[]를 빼도 된다.

        /*
        students = new int[]{90,80,70,60,50}은
        students[0]=90;
        students[1]=80;
        students[2]=70;
        students[3]=60;
        students[4]=50; 이거랑 똑같음.
         */

        for(int i=0; i<students.length; i++)
        {
            System.out.println("학생"+(i+1)+" 점수: "+students[i]);
        }

    }
}
