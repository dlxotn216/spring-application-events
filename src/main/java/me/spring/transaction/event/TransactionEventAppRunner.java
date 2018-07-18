package me.spring.transaction.event;

import lombok.extern.slf4j.Slf4j;
import me.spring.transaction.event.domain.Book;
import me.spring.transaction.event.domain.BookRepository;
import me.spring.transaction.event.domain.BookService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * @author Lee Tae Su
 * @version 1.0
 * @project application-event-demo
 * @since 2018-07-18
 */
@Service
@Slf4j
public class TransactionEventAppRunner implements ApplicationRunner {
	private BookService bookService;
	private BookRepository bookRepository;
	
	public TransactionEventAppRunner(BookService bookService, BookRepository bookRepository) {
		this.bookService = bookService;
		this.bookRepository = bookRepository;
	}
	
	@Override
	public void run(ApplicationArguments applicationArguments) throws Exception {
		try {
			bookService.addBooks(Arrays.asList(
					new Book("1232343-123", "1author", "test book0", "test"),
					new Book("123-1324123", "2author", "test book1", "test"),
					new Book("12332423423", "3author", "test book2", "test"),
					new Book("123-734-123", "4author", "test book3", "test"),
					new Book("123-123-234", "5author", "test book4", "test"),
					new Book("123-1223423", "6author", "test book5", "test")
			));
		} catch (Exception e) {
			//Empty body
		}
		
		bookService.addBook(new Book("77-0343-123", "6author", "test book6", "test"));
	}
}
