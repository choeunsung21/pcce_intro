package day03;

public class Run {
	public static void main(String[] args) {

		Solution02 solution02 = new Solution02();
		int[] array2 = { 9, -1, 0 };
		int result2 = solution02.solution(array2);
		System.out.println(result2);

		Solution03 solution03 = new Solution03();
		int[] array3 = { 1 };
		int result3 = solution03.solution(array3);
		System.out.println(result3);

		Solution04 solution = new Solution04();
		int n = 10;
		int[] result = solution.solution(n);

		for (int num : result) {
			System.out.print(num + " ");
		}
	}
}
