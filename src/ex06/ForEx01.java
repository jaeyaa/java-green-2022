package ex06;

public class ForEx01 {
    public static void main(String[] args) {

        for (int n = 1; n < 11; n = n + 1) { // 초기화 조건부 증감식

            if (n % 3 == 0) {
                System.out.println(n);

            }
        }

    }

}
