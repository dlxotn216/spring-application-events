package me.spring.transaction.event.domain;

import lombok.extern.slf4j.Slf4j;
import me.spring.transaction.event.domain.event.BookEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

/**
 * @author Lee Tae Su
 * @version 1.0
 * @project application-event-demo
 * @since 2018-07-18
 */
@Service
@Slf4j
public class BookService {
	private BookRepository bookRepository;
	private BookEventPublisher publisher;
	private static final boolean failOperation = true;
	
	public BookService(BookRepository bookRepository, BookEventPublisher publisher) {
		this.bookRepository = bookRepository;
		this.publisher = publisher;
	}
	
	/**
	 * Event will be not published.
	 * 
	 * @param book Book
	 * @return Saved book
	 */
	public Book addBook(Book book){
		log.info("Save book without @Transactional");
		
		publisher.onBeforeBookCreated(book);
		publisher.onAfterBookCreated(book);
		return bookRepository.save(book);
	}
	
	@Transactional
	public List<Book> addBooks(Collection<Book> books) {
		books.forEach(publisher::onBeforeBookCreated);
		books.forEach(publisher::onAfterBookCreated);
		if(failOperation) {
			throw new IllegalStateException();
		}
		return bookRepository.saveAll(books);
	}
	
}
