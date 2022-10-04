package even_odd2;

import java.util.Scanner;

/**
 * 7개의 자연수가 주어질 때, 이들 중 홀수인 자연수들을 모두 골라 그 합을 구하고, 고른 홀수들 중 최소값을 찾는 프로그램을 작성하시오.
 * 예를 들어, 7개의 자연수 12, 77, 38, 41, 53, 92, 85가 주어지면 이들 중 홀수는 77, 41, 53, 85이므로 그 합은
 * 77 + 41 + 53 + 85 = 256 이 되고,
 * 41 < 53 < 77 < 85 이므로 홀수들 중 최소값은 41이 된다.
 */
public class Main {
    public static void main(String[] args) {

        //입력 : 첫째 줄부터 일곱 번쨰 출까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100보다 작다.
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요 : ");
        int num = sc.nextInt();
        //유효성 검사
        if(num % 2 == 0){
            num = -1;
        } else {
            num += num;
        }
    }
}
