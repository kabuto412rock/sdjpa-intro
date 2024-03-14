package me.zongjia.sdjpademo.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import me.zongjia.sdjpademo.domain.Book;
import me.zongjia.sdjpademo.repositories.BookRepository;

@Component
public class DataInitializer implements CommandLineRunner {

	private final BookRepository bookRepository;

	public DataInitializer(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public void run(String... args)  {
		Book bookDDD = new Book("不該原地起跳100分鐘的100種理由", "12", "瞎掰出版社");

		System.out.println("Id: " + bookDDD.getId());

		Book savedDDDD = bookRepository.save(bookDDD);

		System.out.println("Id: " + savedDDDD.getId());

		Book bookSIA = new Book("Spring In Action", "1888", "Onion");
		bookRepository.save(bookSIA);

		bookRepository.findAll().forEach(book -> {
			System.out.println("Book Id: "+book.getId());
			System.out.println("Book Title: "+book.getTitle());
		});
	}

}
