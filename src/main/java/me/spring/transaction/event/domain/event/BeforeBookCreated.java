package me.spring.transaction.event.domain.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author Lee Tae Su
 * @version 1.0
 * @project application-event-demo
 * @since 2018-07-18
 */
public class BeforeBookCreated extends ApplicationEvent {
	/**
	 * Create a new ApplicationEvent.
	 *
	 * @param source the object on which the event initially occurred (never {@code null})
	 */
	public BeforeBookCreated(Object source) {
		super(source);
	}
}
