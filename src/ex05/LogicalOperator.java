package ex05;

public class LogicalOperator {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        // 논리 연산자
        // && 그리고 (AND)
        // ll 거나 (OR)
        System.out.println((x == 3) && (y == 7)); // x가 3이고 y가 7이면
        System.out.println((x == 3) || (y == 4)); // x가 3이거나 y가 4이면
        // 쉬프트 역슬래쉬 논리연산은 둘다 boolean 타입이어야 한다.
    }

}
