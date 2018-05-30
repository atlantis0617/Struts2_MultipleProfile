package org.struts.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport{

	private static final long serialVersionUID = 2384610057465028662L;
	
	@Override
	public String execute() throws Exception {
		
		return SUCCESS;
		
	}

}
