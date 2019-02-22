package com.eomcs.lms.context;

import java.util.Map;

public interface ApplicationContextListener {
	
	//어플 시작
	void contextInitialized(Map<String,Object> context) throws ApplicationContextException;
	
	//어플 종료
	void contextDestroyed(Map<String,Object> context) throws ApplicationContextException;
	
}
