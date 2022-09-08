import java.util.Scanner;

public class Main {
    public Main(){
        System.out.println("Constructor");
    }

    public void calculate (){
        System.out.println("calculate");

    }
    //파라미터 매우 잘 이해 하기 ㅎㅎ;;;
    public void calculate2(int param1, int param2){
        System.out.println("parm1: "+ param1);
        System.out.println("parm2: "+ param2);

        System.out.println("더하기 "+ (param1+param2));
        System.out.println("곱하기 "+ (param1*param2));
        System.out.println("나누기 몫 "+ (param1/param2));
        System.out.println("나누기 나머지 "+ (param1%param2));
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        int temp = 1;
        System.out.println("temp: "+ temp);

        String a = "문자입니다.";
        System.out.println(a);

        //클래스 선언
        //클래스 변수 = new 클래스이다.
        Main main = new Main();

       // 함수 호출 클래스가 메모리 위에 올라와 있는 객체
        main.calculate();
        int param1 = 1;
        int param2 = 4;
        main.calculate2(param1, param2);

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println("출력: " +i);
        // 스캐너를 통해서 숫자를 입력받고 계산기를 만들어 오세요!.
    }
}
