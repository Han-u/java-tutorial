public class Variable1 {
    // 변수: 데이터 저장하는 메모리 공간에 붙여준 이름
    public static void main(String[] args){
        System.out.println("==변수 사용하기==");

        int age = 10;
        String country = "Korea";

        System.out.println(age);
        System.out.println(country);

        // 변수 이름 규칙
        System.out.println("== 변수 이름 규칙 ==");
        // 2-1. 문자, 숫자, _, $
        int apple = 2000;
        int apple3 = 3000;
        int _apple = 2000;
        int $apple = 2000;
        System.out.println("$apple = " + $apple);

        // 2-2. 숫자로 시작 불가
        //int 3apple = 2000;

        // 2-3. 대소문자 구분
        int apple5 = 1000;
        int Apple5 = 2000;

        // 2-4. 공백 사용 X
//        int one apple = 1000;
        int oneApple = 1000;

        // 2-5. 예약어 사용 불가
        //int true = 1;

        System.out.println("표기법");
        // 3-1. camelCase
        // 변수, 함수
        int myAge = 10;

        // 3-2. PascalCase
        // 클래스
        int MyAge = 10;

        // 3-3. snake_case
        // Python
        int my_age = 10;
    }
}
