package app;

public class Calculation {
    private int MIN_NUM = 2;
    private int MAX_NUM = 9;
    private int START_DAN = 1;
    private int FINAL_DAN = 9;

    InputNumber inputNumber = new InputNumber();
    int num = inputNumber.inputNum();

    public void gugudan() {
        System.out.println();
        System.out.println(num + "단이 입력되었습니다.");

        if(num < MIN_NUM || num > MAX_NUM) {
            System.out.println("[경고] 구구단은 2단 ~ 9단 까지만 선택할 수 있습니다.");
            System.out.println("프로그램을 종료합니다.");
        }
        else {
            for (int i = START_DAN; i <= FINAL_DAN; i++) {
                System.out.printf("%d * %d = %d\n", num, i, num * i);
            }
        }
    }
}
