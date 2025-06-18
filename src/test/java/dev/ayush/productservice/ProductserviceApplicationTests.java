package dev.ayush.productservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

@SpringBootTest
class ProductserviceApplicationTests {

    @Test
    void randomTest() {
        Random random = new Random();
        int number = random.nextInt();

        assert(number < 100);
    }

}
