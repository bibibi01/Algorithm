package code;

public class 정수를_나선형으로_배치하기 {

	public int[][] solution(int n) {
		int[][] answer = new int[n][n];
		int value = 1;
		int x = 0; // 행
		int y = 0; // 열
		int direction = 0; // 방향 0 오른쪽, 1 아래, 2왼쪽, 3위
		while (value <= n * n) { // 밸류값은 n^2 까지 반복
			answer[x][y] = value++; // 밸류값 추가

			if (direction == 0) { // 오른쪽
				if (y == n - 1 || answer[x][y + 1] != 0) { // y값이 n-1과 같거나 배열 y+1 값이 0이 아닐 때
					direction = 1; // 방향을 아래로 변경
					x++; // 행++
				} else {
					y++; // 열++
				}
			} else if (direction == 1) { // 아래
				if (x == n - 1 || answer[x + 1][y] != 0) { // x값이 n-1과 같거나 배열 x+1값이 0이 아닐 때
					direction = 2; // 방향 왼쪽으로 변경
					y--; // 열--
				} else {
					x++; // 행++
				}
			} else if (direction == 2) { // 왼쪽
				if (y == 0 || answer[x][y - 1] != 0) { // y값이 0이거나 배열 y-1 값이 0이 아닐 때
					direction = 3; // 방향 위로 변경
					x--; // 행--
				} else {
					y--; // 열--
				}
			} else if (direction == 3) { // 위
				if (x == 0 || answer[x - 1][y] != 0) { //x값이 0이거나 배열 x-1값이 0이 아닐 때
					direction = 0; // 방향 오른쪽으로 변경
					y++; // 열++
				} else {
					x--; // 행++
				}
			}
		}
		return answer;
	}

}
