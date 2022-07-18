public class Practice1 {
    public static void solution(int num){
        int numReverse=0;
        boolean isMinus = false;

        if(num < 0){
            isMinus = true;
            num *= -1;
        }

        while(num > 0){
            int r = num % 10; // 일의자리부터 한자리씩
            num /= 10; // 뒷자리부터 없애기
            numReverse = numReverse * 10 + r;
        }
        System.out.println(isMinus ? numReverse * -1 : numReverse);

    }

    public static void main(String[] args){
        solution(12345);
        solution(-12345);
        solution(100);
        solution(0);
    }
}
