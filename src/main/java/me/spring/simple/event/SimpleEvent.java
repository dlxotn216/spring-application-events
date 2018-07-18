package me.spring.simple.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * @author Lee Tae Su
 * @version 1.0
 * @project application-event-demo
 * @since 2018-07-18
 */
@Getter
public class SimpleEvent extends ApplicationEvent {
	private String message;
	
	public SimpleEvent(Object source, String message) {
		super(source);
		this.message = message;
	}
}
