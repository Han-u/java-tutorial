import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Practice13 {
    public static void solution(int[] arr, int k, int x){
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        for (int i = 0; i < arr.length; i++) {
            int diff = Math.abs(x - arr[i]); // 두 수 차이 구하기

            ArrayList<Integer> cur = map.get(diff); // 동일한애가 있는가
            if(cur == null){
                map.put(diff, new ArrayList<>(Arrays.asList(arr[i])));
            }else { // 이미 있으니까 작은 숫자를 먼저 넣는다
                int idx = cur.size();
                for (int j = 0; j < cur.size(); j++) {
                    if(cur.get(j) > arr[i]){ // 기존 들어간 숫자가 지금 숫자보다 크면
                        idx = j;
                        break;
                    }
                }
                cur.add(idx, arr[i]);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        int cnt = 0;
        while (map.size() > 0){
            int minDiff = map.keySet().stream().min((a, b) -> a - b).get();
            ArrayList<Integer> cur = map.get(minDiff);
            map.remove(minDiff);

            while(cur.size() > 0){
                result.add(cur.get(0));
                cur.remove(0);
                cnt ++;
                if(cnt == k){
                    break;
                }
            }

            if(cnt == k){
                break;
            }
        }

        Collections.sort(result);
        System.out.println(result);
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr, 4, 3);

        arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        solution(arr, 5, 5);

        arr = new int[]{2, 4};
        solution(arr, 1, 3);

        arr = new int[]{2, 4};
        solution(arr, 3, 3);
    }
}
