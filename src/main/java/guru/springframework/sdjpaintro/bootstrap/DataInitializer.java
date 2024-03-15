package guru.springframework.sdjpaintro.bootstrap;

import guru.springframework.sdjpaintro.domain.Book;
import guru.springframework.sdjpaintro.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Book book1 = new Book("100種洋蔥料理", "123", "Onion Books");
        System.out.println("Id: "+book1.getId());
        Book savedBook1 = bookRepository.save(book1);
        System.out.println("Id: "+savedBook1.getIsbn());

        Book book2 = new Book("原子習慣", "45678", "Habits Books");
        Book savedBook2 = bookRepository.save(book2);

        bookRepository.findAll().forEach(book ->{
            System.out.println("Book Id: "+book.getId());
            System.out.println("Book Title: "+book.getTitle());
        });


    }
}
