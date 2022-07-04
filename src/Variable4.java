import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Variable4 {
    public static void main(String[] args){

        // 1. 리스트
        System.out.println("== 리스트 ==");
        ArrayList l1 = new ArrayList();


        // 1-1. add
        l1.add(1);
        l1.add("hello");
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add("word!");
        System.out.println("l1 = " + l1);

        l1.add(0, 1); // 0번 인덱스에 1 추가
        System.out.println("l1 = " + l1);


        // 1-2. get
        System.out.println(l1.get(0)); // 0번인덱스 요소


        // 1-3. size
        System.out.println(l1.size()); // 7


        // 1-4. remove
        System.out.println(l1.remove(0)); // 0번 인덱스 요소 삭제
        System.out.println("l1 = " + l1);

        System.out.println(l1.remove(Integer.valueOf(2))); // 리스트에 있는 2를 삭제
        System.out.println("l1 = " + l1);


        // 1-5. clear
        l1.clear(); // 리스트의 모든 요소 삭제
        System.out.println("l1 = " + l1);


        // 1-6. sort
        ArrayList l2 = new ArrayList();
        l2.add(5);
        l2.add(3);
        l2.add(4);
        System.out.println("l2 = " + l2);

        l2.sort(Comparator.naturalOrder()); // 오름차순
        System.out.println("l2 = " + l2);  // 3, 4, 5

        l2.sort(Comparator.reverseOrder()); // 내림차순
        System.out.println("l2 = " + l2);  // 5, 4, 3


        // 1-7. contains
        System.out.println(l2.contains(1)); // false
        System.out.println(l2.contains(3)); // true


        // 2. Maps
        HashMap map = new HashMap(); // 순서보장 x


        // 2-1. put
        map.put("kiwi", 9000);
        map.put("apple", 10000);
        map.put("mango", 12000);
        System.out.println("map = " + map);

        // 2-2. get
        System.out.println(map.get("mandarine"));  // null
        System.out.println(map.get("kiwi")); // 9000

        // 2-3. size
        System.out.println(map.size()); // 3


        // 2-4. remove
        System.out.println(map.remove("kiwi")); // 9000
        System.out.println(map.remove("mandarine")); // null
        System.out.println("map = " + map); // {apple=10000, mango=12000}


        // 2-5. containsKey
        System.out.println(map.containsKey("apple"));  //true
        System.out.println(map.containsKey("kiwi"));  //false


        // 3. Generics
        ArrayList l3 = new ArrayList();
        l3.add(1);
        l3.add("hello");
        System.out.println("l3 = " + l3);

        ArrayList<String> l4 = new ArrayList<String>();
//        l4.add(1);
        l4.add("Hello");


        HashMap map1 = new HashMap();
        map1.put(123, "id");
        map1.put("apple", 10000);
        System.out.println("map1 = " + map1);

        HashMap<String, Integer> map2 = new HashMap<>();
//        map2.put(123, "id");
        map2.put("apple", 10000);
        System.out.println("map2 = " + map2);
    }
}
