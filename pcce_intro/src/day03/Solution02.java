package day03;

public class Solution02 {
	public int solution(int[] array) {
		int answer = 0;
		// 정렬
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		// 중앙값
		int mid = array.length / 2;
		answer = array[mid];

		return answer;
	}
}