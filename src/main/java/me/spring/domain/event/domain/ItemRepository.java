package me.spring.domain.event.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Lee Tae Su
 * @version 1.0
 * @project application-event-demo
 * @since 2018-07-18
 */
public interface ItemRepository extends JpaRepository<Item, Long> {
}
