package org.camunda.bpm.analyseregist;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ServiceTask implements JavaDelegate {

	public void execute(DelegateExecution execution) throws Exception {
		// 
		execution.getProcessInstance();
	}
}