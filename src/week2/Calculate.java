package week2;
import java.util.ArrayList;
import java.util.Scanner;
// input 문자열 띄어내기
// String 으로 입력받은 문자열을 정수형 (int) 타입으로 변환하기
// 숫자열, 문자열 파악하기
// *,-,/,+ 수식을 인식하여 계산하기
// 계산된 결과값을 출력하기
public class Calculate {
    // 숫자열
    private ArrayList<Integer> numbers = new ArrayList<>();
    // 연산기호
    private ArrayList<String> symbol = new ArrayList<>();


    public Calculate(){
        String input = this.write();
        System.out.println(input);

        ArrayList <Character> inputs = this.toChar(input);
        System.out.println(inputs);

        this.seize(inputs);

    }
    /*4숫자인지 문자열인지 파악한다*/
    private void seize(ArrayList<Character> inputs){
        System.out.println("/*숫자인지 문자열인지 파악한다*/");

        for(int i=0; i<inputs.size(); i++){

            char input = inputs.get(i);

            int ascii = (int) input;
            System.out.println(ascii);


            System.out.println(inputs.get(i));
        }

    }

    /* 문자열을 입력 받는다 */
    private String write() {
        System.out.println("값을 입력하세요!!: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }


    private ArrayList<Character> toChar (String input){
        ArrayList<Character> inputs = new ArrayList<>();

        for(int i=0; i<input.length(); i++){

            System.out.println(input.charAt(i));

            //char -> String 형 변환
            inputs.add(input.charAt(i));

        }

        return inputs;
    }

    public static void main(String[] args) {
        new Calculate();
    }
}
