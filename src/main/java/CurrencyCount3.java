import java.util.Scanner;

class CurrencyCount3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("금액을 넣으세요 : [숫자입력]");

        int money = 0;

        //유효성 검사
        try {
            money = scanner.nextInt();
            if (money % 10 != 0) {
                System.out.println("최소 10원 단위로 입력해주세요.");
                return;
            }
            //메서드 실행
            calculateMoney(money);

        } catch (Exception e) { //Exception : 배열의 범위를 넘어가서 연산을 하는경우 발생한다.
            System.out.println("숫자만 입력하세요. 프로그램을 다시 시작해주세요");
            return;
        }
    }
    static void calculateMoney(int money) {
        int[] moneyUnit = {50000, 10000, 1000, 500, 100, 50, 10}; //크기가 7인 배열

        for (int i = 0; i < moneyUnit.length; i++) {
            System.out.println(moneyUnit[i] + "원" + (money / moneyUnit[i]) + "개");
            money = money % moneyUnit[i];
        }

    }
}