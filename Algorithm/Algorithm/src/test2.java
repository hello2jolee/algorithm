import java.util.Arrays;

public class test2 {
	class Solution {
	    public boolean solution(int[] arrA, int[] arrB) {
	    	if(arrA.length != arrB.length)
	    		return false;
	    	
	    	for(int a : arrA) {
	    		if(arrA == arrB)
	    			return true;
	    		else
	    			arrA = rotate(arrA);
	    	}
	       return false;
	    }
	    
	    public int[] rotate(int[] arrA) {
	    	int[] temp = new int[arrA.length];
	    	int index = 0;
	    	temp[index++] = arrA[arrA.length-1];
	    	for(int a : arrA) {
	    		temp[index++] = a;
	    	}
	    	return temp;
	    }
	}
}
