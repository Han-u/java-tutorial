import java.io.*;

class NotTenException extends RuntimeException{}

public class Exception {
    public static boolean checkTen(int ten){
        return ten == 10;
    }

    public static boolean checkTenWithException(int ten){
        try {
            if (ten != 10) {
                throw new NotTenException();
            }
        } catch (NotTenException e){
            System.out.println("e = " + e);
            return false;
        }
        return true;
    }

    public static boolean checkTenWithThrows(int ten) throws NotTenException{
        if (ten != 10){
            throw new NotTenException();
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        // 1. 예외
        // 1-1. 0으로 나누기
        try{
            int a = 5 / 0;
        } catch(ArithmeticException e) {
            System.out.println("0으로 나누기 예외 발생");
            System.out.println("e = " + e);
        }finally {
            System.out.println("1-1 연습 종료");
        }


        // 1-2. 배열 인덱스 초과
        try {
            int[] b = new int[4];
            b[4] = 1;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("e = " + e);
        }


        // 1-3. 없는 파일 열기
        try {
            BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        }catch (FileNotFoundException e){
            System.out.println("e = " + e);
        }


        // 2. throw, throws
        boolean checkResult = Exception.checkTen(10);
        checkResult = Exception.checkTenWithException(9);
        System.out.println("checkResult = " + checkResult);

        try{
            checkResult = checkTenWithThrows(4);
        }catch (NotTenException e){
            System.out.println("e = " + e);
        }
        System.out.println("checkResult = " + checkResult);
    }
}
