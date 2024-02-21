package Mission;
import java.util.Scanner;

public class GradeSorting {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 학생 수와 성적 배열 초기화
        int studentCount = 5;
        int[] grades = new int[studentCount];
        

        // 성적 입력 받기
        for (int i = 0; i < studentCount; i++) {
            System.out.print("학생 " + (i + 1) + "의 JAVA 프로그래밍 성적을 입력하세요 (0~100): ");
            int grade = scanner.nextInt();

            // 입력 범위 확인
            if (grade < 0 || grade > 100) {
                System.out.println("성적은 0 이상 100 이하의 값이어야 합니다. 다시 입력하세요.");
                i--; // 다시 입력 받기 위해 인덱스 조절
            } else {
                grades[i] = grade;
            }
        }

        // 선택정렬을 이용한 오름차순 정렬
        selectionSortAscending(grades);

        // 정렬된 결과 출력
        System.out.println("\n오름차순 정렬 결과:");
        printArray(grades);

        // 선택정렬을 이용한 내림차순 정렬
        selectionSortDescending(grades);

        // 정렬된 결과 출력
        System.out.println("\n내림차순 정렬 결과:");
        printArray(grades);

        // Scanner 닫기
        scanner.close();
    }

    // 선택정렬을 이용한 오름차순 정렬 메소드
    private static void selectionSortAscending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // 선택정렬을 이용한 내림차순 정렬 메소드
    private static void selectionSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap arr[i] and arr[maxIndex]
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    // 배열 출력 메소드
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
