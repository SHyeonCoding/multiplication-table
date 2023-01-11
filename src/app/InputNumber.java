package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputNumber {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public int inputNum() {
        System.out.print("[안내] 희망하는 구구단을 숫자로 입력해 주세요 (2 ~ 9) : ");
        // BufferedReader는 return 값이 String이기 때문에 형변환 필수
        try {
            int num = Integer.parseInt(br.readLine());
            br.close();
            return num;
        }
        catch (Exception e) {
            return 0;
        }
    }
}
