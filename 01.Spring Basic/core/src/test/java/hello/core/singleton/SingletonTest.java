package hello.core.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    @DisplayName("싱글통 패턴을 적용한 객체 사용")
    void singletonServiceTest() {

    }

    @Test
    void ifClauseTest() {
        String input = "05";

        if ("2".equals("2")
            && (!"06".equals(input) && !"09".equals(input))) {
            System.out.println("input if= " + input);
        } else {
            System.out.println("input else = " + input);
        }
    }
}

