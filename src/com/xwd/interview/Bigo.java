package com.xwd.interview;
/**
 * 给定一个10亿长的数组，已知其中有个数的个数超过5亿个，求这个数。
 * @author yuren
 *
 */
public class Bigo {
	/**
	 * 使用两个变量k,j,k用来存储遍历的数字，j表示这个数出现的次数，
	 * 遍历的数字如果不等于k,则j-1,如果等于k,则j+1;如果j =0,将遍历的值赋给k.
	 * @param arr
	 * @return
	 */
	public static int solution(int[] arr) {
		int k = 0;
		int j = 0;
		for (int i : arr) {
			if (j == 0) {
				k = i;
			}
			if (i == k) {
				j++;
			} else {
				j--;
			}
		}
		return k;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 3, 3, 3, 3, 3 };
		System.out.println(solution(arr));
	}
}
