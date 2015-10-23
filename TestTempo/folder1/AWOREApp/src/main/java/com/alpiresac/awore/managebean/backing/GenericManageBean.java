package com.alpiresac.awore.managebean.backing;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

public class GenericManageBean {
	static final String SUCCESS = "success";
	static final String ERROR = "error";

	public String getParameter(String parameterName) {
		String parameter = FacesContext.getCurrentInstance()
				.getExternalContext().getRequestParameterMap()
				.get(parameterName);
 		return parameter;
	}
	
	public HttpSession getSession() {
 		return (HttpSession)FacesContext.getCurrentInstance()
				.getExternalContext().getSession(false);
	}

}
