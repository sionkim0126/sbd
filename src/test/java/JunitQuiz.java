import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class JunitQuiz {
    @Test
    public void junitTest(){
        String name1 = "홍길동";
        String name2 = "홍길동";
        String name3 = "홍길은";

        // ① 모든 변수가 null이 아닌지 확인
        Assertions.assertThat(name1).isNotNull();
        Assertions.assertThat(name2).isNotNull();
        Assertions.assertThat(name3).isNotNull();

        // ② name1과 name2가 같은지 확인
        Assertions.assertThat(name1).isEqualTo(name2);

        // ③ name1과 name3이 다른지 확인
        Assertions.assertThat(name1).isNotEqualTo(name3);

    }

    @Test
    public void junitTest2() {
        int number1 = 15;
        int number2 = 0;
        int number3 = -5;

        // ① number1은 양수인지 확인
        Assertions.assertThat(number1).isPositive();
        // ② number2은 0인지 확인
        /*Assertions.assertThat(0).isEqualTo(number2);*/
        Assertions.assertThat(number2).isZero();
        // ③ number3은 음수인지 확인
        Assertions.assertThat(number3).isNegative();
        // ④ number1은 number2보다 큰지 확인
        Assertions.assertThat(number1).isGreaterThan(number2);
        // ⑤ number3은 number2보다 작은지 확인
        Assertions.assertThat(number3).isLessThan(number2);
    }
}
