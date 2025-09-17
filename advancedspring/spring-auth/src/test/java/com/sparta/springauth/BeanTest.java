package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    /*
    @Autowired
    Food pizza;

    @Autowired
    Food chicken;

    @Test
    @DisplayName("테스트")
    void test1() {
        pizza.eat();
        chicken.eat();
    }
    */

    /*
    @Autowired
    Food food;

    @Test
    @DisplayName("테스트")
    void test1() {
        food.eat();
    }
     */

    @Autowired
    @Qualifier("pizza")
    Food food;

    @Test
    @DisplayName("Primary와 Qualifier 우선순위 확인 => Qualifier가 더 높음")
    void test1() {
        food.eat();
    }
}
