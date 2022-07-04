public class Operator2 {
    public static void main(String[] args){

        // 1. 비트 논리 연산자
        System.out.println("== 비트 논리 연산자 ==");

        // 1-1. AND 연산자 (&)
        System.out.println("== & ==");
        int num1 = 5;
        int num2 = 3;
        int result = 0;

        result = num1 & num2;
        System.out.println("result = " + result); // 1
        System.out.println(Integer.toBinaryString(num1)); // 101
        System.out.printf("%04d", Integer.parseInt(Integer.toBinaryString(num1))); // 0101 포맷 만들어서 출력(4개자리수로 출력, 0으로 채우기)
        System.out.printf("%04d", Integer.parseInt(Integer.toBinaryString(num2))); // 0011
        System.out.printf("%04d", Integer.parseInt(Integer.toBinaryString(result))); // 0001


        // 1-2. OR 연산자 (|)
        result = num1 | num2;
        System.out.println("result = " + result); // 7
        System.out.printf("%04d", Integer.parseInt(Integer.toBinaryString(num1))); // 0101
        System.out.printf("%04d", Integer.parseInt(Integer.toBinaryString(num2))); // 0011
        System.out.printf("%04d", Integer.parseInt(Integer.toBinaryString(result))); // 0111


        // 1-3. XOR 연산자 (^)
        result = num1 ^ num2;
        System.out.println("result = " + result); // 6
        System.out.printf("%04d", Integer.parseInt(Integer.toBinaryString(num1))); // 0101
        System.out.printf("%04d", Integer.parseInt(Integer.toBinaryString(num2))); // 0011
        System.out.printf("%04d", Integer.parseInt(Integer.toBinaryString(result))); // 0110


        // 1-4. 반전 연산자 (~)
        result = ~num1;
        System.out.println("result = " + result); // -6
        System.out.printf("%04d", Integer.parseInt(Integer.toBinaryString(num1))); // 0101
        System.out.printf("%s", Integer.toBinaryString(result));  // 11111111111111111111010 부호비트가 다 1로 반전됨


        // 2. 비트 이동 연산자

        // 2-1. << 연산자
        int numA = 3;
        result = numA << 1;
        System.out.println("result = " + result); // 6
        System.out.printf("%04d", Integer.parseInt(Integer.toBinaryString(numA))); // 0011
        System.out.printf("%04d", Integer.parseInt(Integer.toBinaryString(result))); // 0110


        // 2-2. >> 연산자
        result = numA >> 1;
        System.out.println("result = " + result); // 1
        System.out.printf("%04d", Integer.parseInt(Integer.toBinaryString(numA))); // 0011
        System.out.printf("%04d", Integer.parseInt(Integer.toBinaryString(result))); // 0001


        // 2-3. >>> 연산자
        numA = -5;
        result = numA >> 1;
        System.out.printf("%04d", Integer.parseInt(Integer.toBinaryString(numA))); // 1111111111111111111011
        System.out.printf("%04d", Integer.parseInt(Integer.toBinaryString(result))); // 111111111111111111101

        result = numA >>> 1;
        System.out.printf("%04d", Integer.parseInt(Integer.toBinaryString(numA))); // 1111111111111111111011
        System.out.printf("%04d", Integer.parseInt(Integer.toBinaryString(result))); // 0111111111111111111011


    }
}
