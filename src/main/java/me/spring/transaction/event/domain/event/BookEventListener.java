package me.spring.transaction.event.domain.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 * @author Lee Tae Su
 * @version 1.0
 * @project application-event-demo
 * @since 2018-07-18
 */
@Component
@Slf4j
public class BookEventListener {
	
	@TransactionalEventListener(phase = TransactionPhase.BEFORE_COMMIT)
	public void onBeforeCommit(BeforeBookCreated beforeBookCreated) {
		log.info("onBeforeCommit {}", beforeBookCreated.getSource());
	}
	
	@TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
	public void onAfterCommit(AfterBookCreated afterBookCreated) {
		log.info("onAfterCommit {}", afterBookCreated.getSource());
	}
	
	/**
	 * Rollback 된 후 Event Listener
	 */
	@TransactionalEventListener(phase = TransactionPhase.AFTER_ROLLBACK)
	public void onAfterRollBack(BeforeBookCreated beforeBookCreated) {
		log.info("onAfterRollBack {}", beforeBookCreated.getSource());
	}
	
	/**
	 * Commit 또는 Rollback 된 후 Event listener
	 */
	@TransactionalEventListener(phase = TransactionPhase.AFTER_COMPLETION)
	public void onCompletion(AfterBookCreated afterBookCreated) {
		log.info("onCompletion {}", afterBookCreated.getSource());
	}
}
