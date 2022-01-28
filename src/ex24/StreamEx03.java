package ex24;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class StreamEx03 {
    public static void main(String[] args) {
        InputStream in = System.in; // 단점 : 한자씩 숫자로 받는다.
        InputStreamReader ir = new InputStreamReader(in); // 단점 : 고정된 길이를 받는다.
        BufferedReader br = new BufferedReader(ir); // 장점 : 가변길이의 문자열을 받는다.

    }

}
