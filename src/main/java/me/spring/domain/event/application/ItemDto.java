package me.spring.domain.event.application;

import lombok.Value;

/**
 * @author Lee Tae Su
 * @version 1.0
 * @project application-event-demo
 * @since 2018-07-18
 */
@Value
public class ItemDto {
	private String itemName;
	
	private String version;
	
	private String description;
}
