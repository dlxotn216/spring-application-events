package me.spring.transaction.event.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Lee Tae Su
 * @version 1.0
 * @project application-event-demo
 * @since 2018-07-18
 */
@Entity
@Table
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "BookSeq", sequenceName = "BOOK_SEQ")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BookSeq")
	private Long bookKey;
	@Column(unique = true)
	private String isbn;
	private String author;
	private String title;
	private String description;
	
	public Book(String isbn, String author, String title, String description) {
		this.isbn = isbn;
		this.author = author;
		this.title = title;
		this.description = description;
		
	}
	
	@Override
	public String toString() {
		return "Book{" +
				"bookKey=" + bookKey +
				", isbn='" + isbn + '\'' +
				", author='" + author + '\'' +
				", title='" + title + '\'' +
				", description='" + description + '\'' +
				'}';
	}
}
