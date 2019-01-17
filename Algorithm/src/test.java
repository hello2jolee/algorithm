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
		
		Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i = 0; i<completion.length; i++) {
            if(!completion[i].equals(participant[i])){
                answer = participant[i];
                break;
            }
            else {
                answer = participant[participant.length-1];
            }
        }

        return answer;
    }
}
