package _10000;
import java.util.Scanner;
public class _1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a =sc.nextInt();
		
		if (( a >= 30.00 && a <=40.0)||( a >= 60.00 && a <=70.0))
			System.out.println("win");
		else
			System.out.println("lose");
		
		sc.close();
	}

}
