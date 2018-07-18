package me.spring.domain.event.application.service;

import me.spring.domain.event.application.ItemDto;
import me.spring.domain.event.domain.Item;
import me.spring.domain.event.domain.ItemRepository;
import org.springframework.stereotype.Service;

/**
 * @author Lee Tae Su
 * @version 1.0
 * @project application-event-demo
 * @since 2018-07-18
 */
@Service
public class ItemService {
	private ItemRepository itemRepository;
	
	public ItemService(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}
	
	public Item addItem(ItemDto itemDto) {
		return itemRepository.save(new Item(itemDto.getItemName(), itemDto.getVersion(), itemDto.getDescription()));
	}
}
