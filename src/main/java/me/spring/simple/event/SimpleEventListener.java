package me.spring.simple.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author Lee Tae Su
 * @version 1.0
 * @project application-event-demo
 * @since 2018-07-18
 */
@Component
@Slf4j
public class SimpleEventListener implements ApplicationListener<SimpleEvent> {
	@Override
	public void onApplicationEvent(SimpleEvent event) {
		log.info("SimpleEventListener listen event : {} and message is {}", event.getSource(), event.getMessage());
	}
}
