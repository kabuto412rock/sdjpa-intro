package me.zongjia.sdjpademo;

import me.zongjia.sdjpademo.domain.Book;
import me.zongjia.sdjpademo.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class SpringBootJpaTestSlice {

    @Autowired
    BookRepository bookRepository;

    @Test
    void testJpaTestSlice() {
        long countBefore = bookRepository.count();

        bookRepository.save(new Book("My BOok", "1234555", "Self"));

        long countAfter = bookRepository.count();

        assertThat(countBefore).isLessThan(countAfter);
    }
}
