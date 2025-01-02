import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest {
    @DisplayName("1 + 2는 3이다") //Test이름
    @Test //테스트를 사용할때 쓰는 메서드
    public void junitTest(){
        int a = 1;
        int b = 2;
        int sum = 3;

        Assertions.assertEquals(sum, a + b); // 값이 같은지 확인 ex(a, b+c) a는 b+c가 맞는지 확인
    }

    //실패를 위해 만든 테스트 Test는 하나만 실패하더라도 전체 실패로 표시된다
/*    @DisplayName("1 + 3은 4이다")
    @Test
    public void junitFaildTest(){
        int a = 1;
        int b = 3;
        int sum = 3;

        Assertions.assertEquals(sum, a + b);
    }*/
}
