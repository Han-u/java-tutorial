public class Variable2 {
    public static void main(String[] args){
        // 1. 숫자
        System.out.println("==숫자==");
        // 1-1. 정수
        int intNum = 10;
        System.out.println("intNum = " + intNum);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        int intNum2 = Integer.MAX_VALUE + 1; // 표현식 내 숫자 오버플로
        System.out.println(intNum2); // MIN_VALUE 와 같음 -2147483648

        long longNum = (long)Integer.MAX_VALUE + 1;
        System.out.println(longNum); // 2147483648


        // 1-2. 실수

        float floatNum = 1.23f;
        double doubleNum = 1.23;

        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        // 1-3. 2진수 / 8진수 / 16진수
        int numBase2 = 0b1100;
        int numBase8 = 014;
        int numBase16 = 0xC;

        System.out.println(numBase2); // 12
        System.out.println(numBase8); //12
        System.out.println(numBase16); //12

        System.out.println("0b" + Integer.toBinaryString(numBase2));
        System.out.println("0" + Integer.toOctalString(numBase8));
        System.out.println("0x" + Integer.toHexString(numBase16));

        // 2. 부울
        System.out.println("==부울==");
        boolean isPass = true;
        System.out.println("isPass = " + isPass);
        boolean isOk = false;
        System.out.println("isOk = " + isOk);

        // 3. 문자
        System.out.println("==문자==");
        char keyFirst = 'a';
        char keyLast = 'z';
        System.out.println(keyFirst);
        System.out.println(keyLast);
        System.out.println((int)keyFirst); // 97
        System.out.println((int)keyLast);  //122

    }
}
