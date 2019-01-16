import java.util.ArrayList;

// 프로그래머스에 있는 문제를 참고했습니다.

public class test {
	public static void main(String[] args) {
		String[] participant = {"A","B","C","D"};
		String[] completion = {"A","B","D"};

		Solution sol = new Solution();
		sol.solution(participant, completion);

		System.out.println("완주하지못한사람 :"+sol.answer);
	}
}

class Solution {
	String answer = "";

	public String solution(String[] participant, String[] completion) {
		
		ArrayList<String> list = new ArrayList<String>();
        
        for(String p : participant) 
            list.add(p);
        
        for(String c : completion)
            for(int i = 0; i<list.size(); i++)
                if(list.get(i).equals(c))
                    list.remove(list.get(i));
        
        answer = list.get(0);
            
        return answer;
    }
}
