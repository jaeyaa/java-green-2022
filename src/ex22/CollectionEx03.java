package ex22;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CollectionEx03 {
    public static void main(String[] args) {
        Random r = new Random();

        // HashSet 생성
        Set<Integer> lotto = new HashSet<>();

        while (true) {
            int n = r.nextInt(45); // 2 = 0~1
            lotto.add(n);

            if (lotto.size() == 6) {
                break;
            }
            // HashSet에 n값을 add해서 저장
            // HashSet에 데이터 크기가 6이되면 break
        }
        // HashSet 데이터 출력!
        System.out.println(lotto);
    }

}
