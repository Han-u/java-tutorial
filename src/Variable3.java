import java.util.Locale;

public class Variable3 {
    public static void main(String[] args){

        // 1. 문자열
        System.out.println("==문자열==");
        String s1 = "Hello World!";
        System.out.println("s1 = " + s1);
        String s2 = "01234";
        System.out.println("s2 = " + s2);


        // 1-1. equals
        String s3 = "HI";
        String s4 = "HI";
        System.out.println(s3.equals(s4)); // true
        System.out.println(s3 == s4); //true 같은 주소를 가리킴

        String s5 = new String("HI"); // 새로운 주소에 할당
        System.out.println(s3.equals(s5)); // 값 비교 true
        System.out.println(s3 == s5); // 객체 비교 false


        // 1-2. indexOf
        String s6 = "Hello! Word!";
        System.out.println(s6.indexOf("!")); // 5
        System.out.println(s6.indexOf("!", s6.indexOf("!")+1)); // fromIndex 이후로 찾음, 12


        // 1-3. replace
        String s7 = s6.replace("Hello", "Bye");
        System.out.println("s7 = " + s7);


        // 1-4. substring
        System.out.println(s7.substring(0, 3)); //Bye
        System.out.println(s7.substring(0, s7.indexOf("!")+1));


        // 1-5. toUpperCase
        System.out.println(s7.toUpperCase()); // BYE! WORLD!


        // 2. StringBuffer
        StringBuffer sb1 = new StringBuffer();
        sb1.append("01234");
        System.out.println("sb1 = " + sb1);
        sb1.append("56789");
        System.out.println("sb1 = " + sb1); // 데이터 변경시 객체를 새로 만들지 않고 기존 객체의 데이터를 변경함

        String a = "01234";
        String b = "56789";
        a += b; // String 은 데이터 변화시 객체를 새로 생성하게됨
        System.out.println("a = " + a);


        // 3. 배열
        int[] myArray1 = {1, 2, 3, 4, 5};
        System.out.println(myArray1[0]);

        char[] myArray2 = {'a', 'b', 'c', 'd'};

        String[] myArray3 = new String[3];
        myArray3[0] = "Hello";
        myArray3[1] = " ";
        myArray3[2] = "World!";
        System.out.println(myArray3[0] + myArray3[1] + myArray3[2]);
    }
}
