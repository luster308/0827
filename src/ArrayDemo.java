
public class ArrayDemo {
	public static void main(String[] args) {

//		int[] array = null;										// Declaration
//		array = new int[3];										// Creation
//		array[0] = 5;												// Assignment
//		array[1] = 6;
//		array[2] = 7;

		///////////////////////////////////////////

//		int[] array = null;										// Declaration
//		array = new int[] {5,6,7,8};							// Creation & Assignment

		///////////////////////////////////////////

//		int[] array = {5,6,7,8};								// Initialization

		// 2차원 배열: Rectangular Array, Ragged Array

//		int[][] array = null;										// Declaration
//		array = new int[2][3];									// Creation
//		array[0][0] = 5;											// Assignment

		///////////////////////////////////////////

//		int[][] array = null;										// Declaration
//		array = new int[][] {{5,6,7}, {8,9,10}};			// Creation & Assignment

		///////////////////////////////////////////

//		int[][] array = {{5,6,7}, {8,9,10}};				// Initialization

		///////////////////////////////////////////

//		int[][] array = null;										// Declration
//		array = new int[3][];									// Creation
//		array[0] = new int[4];									
//		array[1] = new int[2];									
//		array[2] = new int[5];
//		array[0][0] = 5;											// Assignment

		///////////////////////////////////////////

		//int[][] array = null;										// Declaration
//		array = new int[3][];
//		array[0] = new int[] {3,4,5,6};						// Creation & Assignment
//		array[1] = new int[] {7,8};
//		array[2] = new int[] {9,10,11,12,13};
		/*
		 * array = new int[][] { { 3, 4, 5, 6 }, { 7, 8 }, { 9, 10, 11, 12, 13 } };
		 */

		///////////////////////////////////////////

		int[][] array = { { 3, 4, 5, 6 }, { 7, 8 }, { 9, 10, 11, 12, 13 } };

		System.out.println("0층의 방 갯수: " + array[0].length);
		System.out.println("1층의 방 갯수: " + array[1].length);
		System.out.println("2층의 방 갯수: " + array[2].length);

		for (int i = 0; i < array.length; i++) {
			System.out.print(i+"층: ");
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+", ");
			}
			System.out.println();
		}
		
		// array[0]rhk array[1]을 swapping
		int[] temp = array[0];
		array[0] = array[1];
		array[1] = temp;
		
		System.out.println("변경 후");
		for (int i = 0; i < array.length; i++) {
			System.out.print(i+"층: ");
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+", ");
			}
			System.out.println();
		}

	}// main
}// class
