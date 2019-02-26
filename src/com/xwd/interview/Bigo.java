package com.xwd.interview;
/**
 * ����һ��10�ڳ������飬��֪�����и����ĸ�������5�ڸ������������
 * @author yuren
 *
 */
public class Bigo {
	/**
	 * ʹ����������k,j,k�����洢���������֣�j��ʾ��������ֵĴ�����
	 * �������������������k,��j-1,�������k,��j+1;���j =0,��������ֵ����k.
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
