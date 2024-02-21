package Mission;
import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        // 1.Scanner 객체 생성하기
        Scanner scanner = new Scanner(System.in);

        // 2.사용자로부터 정수 입력 받기
        System.out.print("정수를 입력하세요 (1 이상, 100 이하): ");
        int N = scanner.nextInt();

        // 3.홀수 합계와 짝수 합계 초기화 하기
        int Sum1 = 0;
        int Sum2 = 0;

        // 4.약수를 저장할 배열 초기화하기
        int[] divisor = new int[N];
        int Count = 0;

        // 5.1부터 N까지 반복하고
        for (int i = 1; i <= N; i++) {
            // 홀수인 경우 홀수 합계에 더하기
            if (i % 2 != 0) {
                Sum1 += i;
            }
            // 5-1 짝수인 경우 짝수 합계에 더하기
            else {
                Sum2 += i;
            }

            // 5-2 N의 약수인 경우 배열에 추가하기
            if (N % i == 0) {
                divisor[Count++] = i;
            }
        }

        // 6.결과 출력
        System.out.print("홀수 합계: ");
        printNumberSeries(1, N, 2, Sum1);

        System.out.print("짝수 합계: ");
        printNumberSeries(2, N, 2, Sum2);

        System.out.print("약수: ");
        printDivisors(divisor, Count);

        // 7.Scanner 닫기
        scanner.close();
    }

    // 8.주어진 형태로 숫자를 출력하는 메소드만들기
    private static void printNumberSeries(int start, int end, int step, int sum) {
        for (int i = start; i <= end; i += step) {
            System.out.print(i);
            if (i + step <= end) {
                System.out.print("+");
            }
        }
        System.out.println("=" + sum);
    }

    // 약수 출력하는 메소드
    private static void printDivisors(int[] divisors, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(divisors[i]);
            if (i < count - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
