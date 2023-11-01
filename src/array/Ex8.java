package array;

public class Ex8 {

	public static void main(String[] args) {

		int[][] arr = { { 2, 4, 6 }, { 3, 6, 9 } }; // 2차원 배열을 묶어줄 때는 중괄호
		int[][] arr1 = new int[2][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("[" + i + "," + j + "]");

			}
			System.out.println();

		}
	}
}