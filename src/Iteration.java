public class Iteration {
    public static void main(String[] args){
        // 1. for

        // 1-1. 기본 사용
        for(int i =0; i < 5; i++){
            System.out.println(i);
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.println("*");
            }
            System.out.println();
        }

        System.out.println();
        for(int i = 0; i < 5; i++){
            if (i == 2){
                continue;  // 밑의 내용을 실행하지 않고 다음 반복 실행
            }
            for(int j = 0; j < i + 1; j++){
                System.out.println("*");
            }
            System.out.println();
        }

        System.out.println();
        for(int i = 0; i < 5; i++){
            if (i == 2){
                break;  // 반복문 즉시 종료
            }
            for(int j = 0; j < i + 1; j++){
                System.out.println("*");
            }
            System.out.println();
        }


        // 1-2. for each
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        for(int num : nums){ // 변수명, 반복하고자하는 대상. 모든 변수를 반복할 때 사용한다
            System.out.println(num);
        }


        // 2. while

        // 2-1. while
        int i = 0;
        while (i < 5){
            System.out.println(i++);
        }

        System.out.println();
        i = 0;
        while (i < 5){
            if (i == 2){
                i++;
                continue;
            }
            System.out.println(i++);
        }

        System.out.println();
        i = 0;
        while (i < 5){
            if (i == 2){
                i++;
                break;
            }
            System.out.println(i++);
        }


        // 2-2. do while
        boolean knock = false;
        do {
            System.out.println("knock");
        } while (knock);


        // Q1. 별 출력(반복+조건)
        //*
        //***
        //*****
        //*******
        for(int j = 0; j < 8; j++){
            if (j % 2 == 0){
                continue;
            }
            for(int k = 0; k < j; k++){
                System.out.println("*");
            }
            System.out.println();
        }


        // Q2. 반복문 실행마다 물 온도 1도 올리고 100도시 종료한다. 10도 간격으로 물 온도 출력
        int waterTemperature = 0;
        while (waterTemperature < 100){
            waterTemperature++;

            if(waterTemperature % 10 == 0){
                System.out.println(waterTemperature + "도 입니다.");
            }
        }


    }
}
