package me.spring.domain.event.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.spring.domain.event.domain.event.ItemEvent;
import org.springframework.data.domain.AbstractAggregateRoot;

import javax.persistence.*;

/**
 * @author Lee Tae Su
 * @version 1.0
 * @project application-event-demo
 * @since 2018-07-18
 */
@Entity
@Table
@Getter
@NoArgsConstructor
@SequenceGenerator(name = "ItemSeq", sequenceName = "ITEM_SEQ")
public class Item extends AbstractAggregateRoot<Item> {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ItemSeq")
	private Long itemKey;
	
	private String itemName;
	
	private String version;
	
	private String description;
	
	public Item(String itemName, String version, String description) {
		this.itemName = itemName;
		this.version = version;
		this.description = description;
		
		super.registerEvent(new ItemEvent(this));
	}
	
	@Override
	public String toString() {
		return "Item{" +
				"itemKey=" + itemKey +
				", itemName='" + itemName + '\'' +
				", version='" + version + '\'' +
				", description='" + description + '\'' +
				'}';
	}
}
