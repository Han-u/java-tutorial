public class Operator1 {
    public static void main(String[] args){

        // 1. 대입 연산, 부호 연산자
        int num = 100;
        num = +10;
        num = 10;
        num = -10;


        // 2. 산술 연산자, 증가/감소 연산자
        int numX = 10;
        int numY = 3;
        int result = 0;
        result = numX  + numY;
        result = numX  - numY;
        result = numX  * numY;
        result = numX / numY;
        result = numX % numY;
        System.out.println("result = " + result);

        int numZ = 1;
        System.out.println(numZ++); // 1, 일단 증가시키기 전 값 사용하고 증가
        System.out.println(numZ); // 2

        numZ = 1;
        System.out.println(++numZ);  // 2, 먼저 증가 시키고 값 사용
        System.out.println(numZ);  //2

        numZ = 1;
        System.out.println(numZ--);  // 1, 값 사용하고 감소
        System.out.println(numZ);  // 0

        numZ = 1;
        System.out.println(--numZ);  // 0, 먼저 감소 시키고 값 사용
        System.out.println(numZ);  // 0


        // 3. 관계 연산자
        int numA = 10;
        int numB = 9;

        System.out.println(numA  > numB);  // true
        System.out.println(numA < numB); // false
        System.out.println(numA == numB); // false
        System.out.println(numA != numB); // true


        // 4. 논리 연산자
        System.out.println((10 > 9) && (1 == 0));  // false
        System.out.println((10 > 9) || (1 == 0));  // true


        // 5. 복합 대입 연산자
        int num1 = 10;
        int num2 = 5;
        num1 += num2;
        System.out.println("num1 = " + num1);
        num1 -= num2;
        num1 *= num2;


        // 6. 삼항 연산자
        int a = 100;
        String aResult = (a == 100) ? "yes" : "no";
        System.out.println("aResult = " + aResult); // yes

    }
}
