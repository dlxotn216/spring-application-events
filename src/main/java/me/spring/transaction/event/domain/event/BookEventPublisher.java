package me.spring.transaction.event.domain.event;

import me.spring.transaction.event.domain.Book;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * @author Lee Tae Su
 * @version 1.0
 * @project application-event-demo
 * @since 2018-07-18
 */
@Component
public class BookEventPublisher {
	private ApplicationEventPublisher publisher;
	
	public BookEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
	
	public void onBeforeBookCreated(Book before){
		publisher.publishEvent(new BeforeBookCreated(before));
	}
	
	public void onAfterBookCreated(Book created){
		publisher.publishEvent(new AfterBookCreated(created));
	}
}
