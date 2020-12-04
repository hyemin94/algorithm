package doit_algorithm_chap01;

// 실습 2-3(p.48)
// clone : 복제
public class CloneArray {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5 };
		int[] b = a.clone();

		b[3] = 0;

		System.out.print("a = ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}

		System.out.print("\nb = ");
		for (int j = 0; j < b.length; j++) {
			System.out.print(" " + b[j]);
		}

	}

}
