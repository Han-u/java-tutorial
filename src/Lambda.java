interface ComputeTool{
    public abstract int compute(int x, int y);
    //public abstract int compute2(int x, int y);
    // 추상 메서드가 2개 이상인 경우에는 람다식 사용 불가
}

public class Lambda {
    public static void main(String[] args){
        ComputeTool cTool1 = new ComputeTool() {
            @Override
            public int compute(int x, int y) {
                return x + y;
            }
        };

        ComputeTool cTool2 = (x, y) -> {return x + y;};
        System.out.println(cTool2.compute(1, 2));

    }
}
