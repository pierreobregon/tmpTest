package com.alpiresac.awore.managebean.backing;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

import org.springframework.stereotype.Component;

@Component
@ManagedBean
@RequestScoped
public class LoginManageBean extends GenericManageBean {
	
	public String login(ActionEvent actionEvent){
		return "";
	}
	
	public String logout(ActionEvent actionEvent){
		this.getSession().invalidate();
		return "to_login";
	}
}
