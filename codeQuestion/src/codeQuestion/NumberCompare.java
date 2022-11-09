package codeQuestion;

public class NumberCompare {
	
	public static void main(String[] args) {
		
		NumberCompare nbc = new NumberCompare();

		int answer = nbc.solution(1, 2);
		
		System.out.println(answer);
		
	}

	/**
	 * 정수 num1과 num2가 매개변수로 주어집니다. 
	 * 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
	 * @param num1
	 * @param num2
	 * @return
	 */
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 == num2 ? 1: -1;
        return answer;
    }
	

}
