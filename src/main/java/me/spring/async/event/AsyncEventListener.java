package me.spring.async.event;

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
public class AsyncEventListener implements ApplicationListener<AsyncEvent> {
	@Override
	public void onApplicationEvent(AsyncEvent event) {
		log.info("Async event listener listen -> {}", event.getSource());
		log.info("Current thread name is {}", Thread.currentThread().getName());
	}
}
