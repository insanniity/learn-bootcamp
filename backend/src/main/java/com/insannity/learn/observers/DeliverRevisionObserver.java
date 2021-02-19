package com.insannity.learn.observers;

import com.insannity.learn.entities.Deliver;

public interface DeliverRevisionObserver {
	
	void onSaveRevision(Deliver deliver);
	
}
