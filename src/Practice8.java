import java.util.ArrayList;

public class Practice8 {

    public static String solution(String input, String cmd){
        StringBuffer sb = new StringBuffer(input); // 초기 문자열
        ArrayList<String> cmdArr= new ArrayList<>(); // 커맨드

        for (String s:cmd.split(" ")) {
            cmdArr.add(s); // 커맨드의 문자열을 더함
        }

        int curSor = sb.length(); // 커서 위치 맨 뒤로 잡기
        int cmdIdx = 0;
        while(cmdIdx != cmdArr.size()){
            String cur = cmdArr.get(cmdIdx);

            if(cur.equals("L")){ // 왼쪽 이동
                curSor = Math.max(0, curSor - 1);
            }else if(cur.equals("D")){ // 오른쪽 이동
                curSor = Math.min(sb.length(), curSor + 1);
            }else if(cur.equals("B")){ // 지우기
                if(curSor == 0){ // 지울것 없음
                    cmdIdx++;
                    continue;
                }
                sb.delete(curSor-1, curSor);
                curSor = Math.max(0, curSor -1);
            }else if(cur.equals("P")){
                String s = cmdArr.get(++cmdIdx);
                sb.insert(curSor, s); // 커서 위치에 해당 문자열 삽입
                curSor += 1;
            }
            cmdIdx++;
        }
        return sb.toString();
    }

    public static void main(String[] args){
        System.out.println(solution("aba", "L B"));
        System.out.println(solution("abcd", "P x L P y"));
        System.out.println(solution("abc", "L L L P x L B P y"));
        System.out.println(solution("a", "B B L L D D P a P b P c"));
    }
}
