package me.spring.domain.event;

import me.spring.domain.event.application.ItemDto;
import me.spring.domain.event.application.service.ItemService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

/**
 * @author Lee Tae Su
 * @version 1.0
 * @project application-event-demo
 * @since 2018-07-18
 */
@Service
public class DomainEventRunner implements ApplicationRunner {
	private ItemService itemService;
	
	public DomainEventRunner(ItemService itemService) {
		this.itemService = itemService;
	}
	
	@Override
	public void run(ApplicationArguments applicationArguments) throws Exception {
		itemService.addItem(new ItemDto("test1", "0.1", "desc1"));
		itemService.addItem(new ItemDto("test2", "0.2", "desc2"));
		itemService.addItem(new ItemDto("test3", "0.4", "desc3"));
		itemService.addItem(new ItemDto("test4", "1.0", "desc4"));
	}
}
