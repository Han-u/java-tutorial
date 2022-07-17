interface CompareTool{
    public abstract int getMaxNum(int num1, int num2);
}

public class LambdaPractice {
    public static void main(String[] args){
        CompareTool cTool = new CompareTool() {
            @Override
            public int getMaxNum(int num1, int num2) {
                return num1 > num2 ? num1 : num2;
            }
        };

        // 람다식으로 작성
        CompareTool cTool2 = (x, y) -> {return x > y ? x : y;};
        System.out.println(cTool2.getMaxNum(10, 11));
    }
}
