package Practice;

public class Array_Practice_11 {
    public static void main(String[] args) {

        String[] names = new String[]{"Kim","Park","Yi"}; // String 배열 생성.

        for(int i=0; i<names.length; i++)
        {
            System.out.println("names["+i+"]:"+names[i]); //배열에 있는 것들을 출력.
        }

        String tmp = names[2]; // tmp에 세번째 요소에 있는 것을 저장. ("Yi")
        System.out.println("tmp:"+tmp);
        names[0]="Yu"; // 첫번째 요소에 있는것을 "Yu"로 변경.

        for(int i=0; i<names.length;i++)
        {
            System.out.println(names[i]);
        }


    }
}
