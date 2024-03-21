package me.zongjia.sdjpademo;

import me.zongjia.sdjpademo.repositories.BookRepository;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SdjpaDemoApplicationTests {
    @Autowired
    BookRepository bookRepository;

    @Test
    void testBookRepository() {
        long count = bookRepository.count();
        assertThat(count).isGreaterThan(0);
    }
    @Test
    void contextLoads() {
    }

}
