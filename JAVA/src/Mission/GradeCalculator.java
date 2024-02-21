package Mission;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // 1.Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 2.변수 선언 및 입력 받기
        System.out.print("영어 점수를 입력하세요: ");
        int eng = scanner.nextInt();

        System.out.print("수학 점수를 입력하세요: ");
        int math = scanner.nextInt();

        System.out.print("자바 점수를 입력하세요: ");
        int java = scanner.nextInt();

        // 3.입력 받은 성적의 총 합계 계산하기
        int totalScore = eng + math + java;

        // 4.입력 받은 성적의 평균 계산하기
        double averageScore = (double) totalScore / 3;

        // 5.결과 출력
        System.out.println("영어 점수: " + eng);
        System.out.println("수학 점수: " + math);
        System.out.println("자바 점수: " + java);
        System.out.println("총점: " + totalScore);
        System.out.println("평균: " + averageScore);

        // 6.Scanner 닫기
        scanner.close();
    }
}