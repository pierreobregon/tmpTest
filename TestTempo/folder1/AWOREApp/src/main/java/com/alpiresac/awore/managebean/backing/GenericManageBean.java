package com.alpiresac.awore.managebean.backing;

import javax.faces.context.FacesContext;

public class GenericManageBean {
	static final String SUCCESS = "success";
	static final String ERROR = "error";

	public static String getParameter(String parameterName) {
		String parameter = FacesContext.getCurrentInstance()
				.getExternalContext().getRequestParameterMap()
				.get(parameterName);
 		return parameter;
	}

}
