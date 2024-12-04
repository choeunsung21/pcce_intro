package day03;

public class Solution03 {
	public int solution(int[] array) {
		int answer = 0;
		int mode = 0;
		boolean isDuple = false;

		for (int i = 0; i < array.length; i++) {
			int cnt = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					cnt++;
				}
			}
			if (cnt > mode) {
				mode = cnt;
				answer = array[i];
				isDuple = false;
			} else if (cnt == mode && answer != array[i]) {
				isDuple = true;
			}
		}

		return isDuple ? -1 : answer;
	}
}
