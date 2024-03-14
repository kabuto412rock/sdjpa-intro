package me.zongjia.sdjpademo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import me.zongjia.sdjpademo.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

	
}
