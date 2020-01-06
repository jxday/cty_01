package common.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

/**
 * 〈测试算数类〉
 *
 * @author cty
 * @ClassName MathUtilsTest
 * @create 2019-11-15 17:23
 * @Version 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MathUtilsTest {
    
    @Autowired
    private WebTestClient webClient;
    
    @Test
    private void exampleTest(){
        this.webClient.get().uri("/hello").exchange()
                .expectStatus().isOk().expectBody(String.class)
                .isEqualTo("Welcome to springboot2 world ~");
    }
    
    @Test
    private void testMethod1(){
    }
    
    
}
