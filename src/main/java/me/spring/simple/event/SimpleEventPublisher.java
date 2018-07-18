package me.spring.simple.event;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * @author Lee Tae Su
 * @version 1.0
 * @project application-event-demo
 * @since 2018-07-18
 */
@Service
public class SimpleEventPublisher implements ApplicationRunner {
	private ApplicationEventPublisher publisher;
	
	public SimpleEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
	
	public void publishSimpleEvent() {
		publisher.publishEvent(new SimpleEvent(new Object(), "My Events..."));
	}
	
	@Override
	public void run(ApplicationArguments applicationArguments) throws Exception {
		this.publishSimpleEvent();
	}
}
