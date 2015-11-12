package edu.iut.app;

import java.util.ArrayList;

public interface IApplicationLog {
	/** TP1 : Créérr les méthodes :
	 - setMessage
	  - getMessage
	  - addListener
	  - getApplicationLogListeners();
	*/
	
	public void setMessage(String message);
	String getMessage();
	void addListener(IApplicationLogListener listener);
	public ArrayList<IApplicationLogListener> getpplicationLogListerners();
}
