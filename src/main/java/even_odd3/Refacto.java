package even_odd3;

class Refacto {
    //숫자를 받아서 짝수면 '짝수' 리턴, 홀수면 '홀수' 리턴 -> 메서드 추상화
    public static String getEvenOdd(int num) {
        if (num % 2 == 0) {
            return "짝수";
        } else {
            return "홀수";
        }
    }

    public static void main(String[] args) {

        int firstNum = 2;
        int secondNum = 3;
        int resultNum = firstNum + secondNum;

        String sFirstNum = getEvenOdd(firstNum);
        System.out.print("+");
        String sSecondNum = getEvenOdd(secondNum);
        System.out.print("=");
        String sResultNum = getEvenOdd(resultNum);
    }
}
