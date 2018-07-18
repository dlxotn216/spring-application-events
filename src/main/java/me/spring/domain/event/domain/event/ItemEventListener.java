package me.spring.domain.event.domain.event;

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
public class ItemEventListener implements ApplicationListener<ItemEvent> {
	@Override
	public void onApplicationEvent(ItemEvent event) {
		log.info("ItemEventListener listen event : {}", event.getSource());
	}
}
