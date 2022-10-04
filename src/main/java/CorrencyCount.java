import java.util.Scanner;

/**
 * 현금으로 돈을 받고 25000원을 거슬러 주어야 합니다
 * 5만원 짜리는 몇장, 만원짜리는 몇장, 5천원짜리는 몇장을 거슬러주어야 할까요?
 */
class CorrencyCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int amount = 0;
        int num = 0;
        int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        System.out.print("금액을 넣으세요 : ");
        amount = scanner.nextInt();

        for (int i = 0; i < unit.length; i++) {
            num = amount / unit[i];
            amount %= unit[i];
            System.out.println(unit[i]);
            System.out.println(unit[i] + "원" + num + "개");
        }
    }
}