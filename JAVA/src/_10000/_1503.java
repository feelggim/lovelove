package _10000;

import java.util.Scanner;

public class _1503 {
	public static void main(String[] args) {
		
	

	{
	Scanner sc = new Scanner(System.in);
	int N =sc.nextInt();
	int arr[][] =new int [N][N];
	for (int i = 0; i < arr.length; i++) {
		arr[i][0]= sc.nextInt();
		
		for (int j = 0; j == arr.length; j++) {
			arr[i][j] = arr[i][j-1]-arr[i-1][j-1] ;
			
			System.out.print(arr[i][j]+"");
		}
			System.out.println();
				}
			}
			
		}
		

}
