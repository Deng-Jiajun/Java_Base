package com.startdima.test.chapter1;

/*
 * 矩阵转置二维数组
 * 
 * 01	02	03	04	05		01	11	21	31	41
 * 11	12	13	14	15		02	12	22	32	42
 * 21	22	23	24	25	=>	03	13	23	33	43
 * 31	32	33	34	35		04	14	24	34	44
 * 41	42	43	44	45		05	15	25	35	45
 * 
*/

/**
 * 
 * @ClassName: MatrixTranspose 
 * @Description: 练习：矩阵转置二维数组
 * @author dengjiajun deng-jiajun@outlook.com
 * @date 2019年7月4日 下午2:20:54 
 *
 */

public class MatrixTranspose {
	final static int MATRIXSIZE=5;
	public static void main(String[] args) {
		int[][] matrix = new int[MATRIXSIZE][MATRIXSIZE];
		
		/* 数据写入*/
		for (int i = 0; i != MATRIXSIZE; ++i) {
			for (int j = 0; j != MATRIXSIZE; ++j) {
				matrix[i][j] = i * 10 + j + 1;
			}
		}

		System.out.println("转换前：");
		ShowMatrix(matrix);
		
		transpose(matrix);

		System.out.println("转换后：");
		ShowMatrix(matrix);
	}
	

	/**
	 * 
	 * @Title: ShowMatrix 
	 * @Description: 打印二维数组matrix的内容
	 * @param @param matrix
	 * @return void
	 * @throws
	 */
	private static void ShowMatrix(int[][] matrix)
	{
		for (int[] arr : matrix) {
			for (int i1 : arr) {
				System.out.print(String.format("%02d", i1) + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * 
	 * @Title: transpose 
	 * @Description: 转置二维数组matrix
	 * @param @param matrix
	 * @return void
	 * @throws
	 */
	private static void transpose(int[][] matrix) {
		for (int i = 0; i != MATRIXSIZE; ++i) {
			for (int j = i; j != MATRIXSIZE; ++j) {
				int tmp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = tmp;
			}
		}
	}
	
}