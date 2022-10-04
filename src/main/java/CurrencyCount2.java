/**
 * 현금으로 돈을 받고 25000원을 거슬러 주어야 합니다
 * 5만원 짜리는 몇장, 만원짜리는 몇장, 5천원짜리는 몇장을 거슬러주어야 할까요?
 * -> 나머지 연산을 할 수 있는가?
 */
class CurrencyCount2 {
    public static void main(String[] args) {

        int currency50000 = 50000;
        int currency10000 = 10000;
        int currency5000 = 5000;
        int currency1000 = 1000;

        //raw 익히지 않은
        int refund = 25000;

        System.out.printf("5만원권 %d장\n", refund / currency50000);
        System.out.printf("1만원권 %d장\n", refund / currency10000);
        System.out.printf("5천원권 %d장\n", refund / currency5000);
        System.out.printf("1천원권 %d장\n", refund / currency1000);

    }
}

