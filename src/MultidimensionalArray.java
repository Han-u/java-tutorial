public class MultidimensionalArray {
    public static void main(String[] args){
        // 1. 일차원 배열
        int[] myArray = {1, 2, 3};
        System.out.println("myArray[1] = " + myArray[1]);

        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }

        for (int i : myArray){
            System.out.println(i);
        }


        // 2. 이차원 배열
        int[][] myArray2 = {{1,2,3}, {4,5,6}};

        for(int i = 0; i < myArray2.length; i++){
            for(int j = 0; j < myArray2[i].length; j++){
                System.out.println(myArray2[i][j]);
            }
        }

        for(int[] ints : myArray2){
            for (int anInt : ints){
                System.out.println("anInt = " + anInt);
            }
        }


        // Q1. 모든 원소를 1로 변경, 대각 원소는 10으로 변경한다
        int[][] testArray1 = {{0,0,0}, {0,0,0}, {0,0,0}};

        for(int i=0; i< testArray1.length; i++){
            for(int j = 0; j < testArray1[i].length; j++){
                testArray1[i][j] = 1;
                if(i == j){
                    testArray1[i][j] = 10;
                }
            }
        }

        for(int[] itemRow : testArray1){
            for(int itemCol : itemRow){
                System.out.println(itemCol + " ");
            }
            System.out.println();
        }
    }
}
