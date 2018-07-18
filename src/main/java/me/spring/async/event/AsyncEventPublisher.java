package me.spring.async.event;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * @author Lee Tae Su
 * @version 1.0
 * @project application-event-demo
 * @since 2018-07-18
 */
@Component
public class AsyncEventPublisher implements ApplicationRunner {
	private ApplicationEventPublisher publisher;
	
	public AsyncEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
	
	public void publishAsyncEvent() {
		publisher.publishEvent(new AsyncEvent("Async event!"));
	}
	
	@Override
	public void run(ApplicationArguments applicationArguments) throws Exception {
		this.publishAsyncEvent();
	}
}
