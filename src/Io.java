import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Io {
    public static void referInputStream() throws IOException {
        // System.in -> char 값 하나 받아올 수 있음
        System.out.println("입력 : ");
        int a = System.in.read() -'0';
        System.out.println("a = " + a);
        System.in.read(new byte[System.in.available()]); // 입력 스트림에 남아있는만큼 바이트 소진시켜줌


        // InputStreamReader
        InputStreamReader reader = new InputStreamReader(System.in);
        char[] c = new char[3]; // 여러 문자 받아오기위한 배열
        System.out.println("입력 : ");
        reader.read(c); // 데이터 읽기
        System.out.println(c); // 데이터 출력


        // BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("입력 : ");
        String s1 = br.readLine();
        System.out.println("s1 = " + s1);
    }


    public static void main(String[] args) throws IOException {
        // 1. 입력
        // 1-1. 다른 입력 방식
        //referInputStream();


        // 1-2. Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("입력1 : ");
        System.out.println(sc.next());
        sc.nextLine();

        System.out.println("입력2 : ");
        System.out.println(sc.nextInt());
        sc.nextLine();

        System.out.println("입력3 : ");
        System.out.println(sc.nextLine());


        // 참고) 정수, 문자열 변환
        int num = Integer.parseInt("12345");
        String str = Integer.toString(12345);


        // 2. 출력
        System.out.println("Hello");
        System.out.println("World!");

        System.out.print("Hello ");
        System.out.print("World!");

        System.out.printf("Hello ");
        System.out.printf("World!");
        System.out.println();

        String s = "자바";
        int number = 3;

        System.out.println(s + "는 언어 선호도 " + number + "위 입니다.");
        System.out.printf("%s는 언어 선호도 %d위 입니다. \n", s, number);

        System.out.printf("%d\n", 10);
        System.out.printf("%o\n", 10); // 8진수
        System.out.printf("%x\n", 10); // 16진수
        System.out.printf("%f\n", 5.2f); // 소수점

        System.out.printf("%c\n", 'A');
        System.out.printf("%s\n", "안녕하세요");

        System.out.printf("%-5d\n", 123);
        System.out.printf("%5d\n", 123);
        System.out.printf("%5d\n", 123);

        System.out.printf("%.2f\n", 1.123445f);
    }
}
