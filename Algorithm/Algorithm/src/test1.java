import java.util.Arrays;

public class test1 {

	class Solution {
	    public int[] solution(int[] array, int[][] commands) {
	        int[] answer = {};
	        for(int i = 0; i<commands.length; i++){
	            int[] temp = {};
	            for(int j = 0; j<commands[i][1]-commands[i][0]+1; j++)
	                temp[j] = array[commands[i][0]+j];
	            Arrays.sort(temp);
	            answer[i] = temp[commands[i][2]];
	        }    
	        return answer;
	    }
	}
}
