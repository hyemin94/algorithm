package Doit_chap06;

import java.util.Scanner;

// 버블정렬 : p. 203
class BubbleSort {

	// a[idx1]와 a[idx2]의 값을 바꿉니다.
	// idx1 : 0
	// idx2 : 1
	static void swap(int[] a, int idx1, int idx2) {
		// t : 0
		// a[idx1] : 1
		// a[idx2] : 0
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// 버블정렬
	static void bubbleSort(int[] a, int n) {
		// n : 3
		// i : 0
		// j : 2, 1
		for (int i = 0; i < n; i++)
			for (int j = n - 1; j > i; j--)
				if (a[j - 1] > a[j])
					swap(a, j - 1, j);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("버블정렬(버전1)");
		System.out.print("요솟수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = sc.nextInt();
		}

		// x : 10000, 20, 4000
		// nx : 3
		bubbleSort(x, nx);

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "]=" + x[i]);
		}
	}

}
