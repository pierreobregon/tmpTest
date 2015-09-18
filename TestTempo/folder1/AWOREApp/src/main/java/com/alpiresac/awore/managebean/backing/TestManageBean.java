package com.alpiresac.awore.managebean.backing;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alpiresac.awore.service.TestService;

@Component
@ManagedBean
@SessionScoped
public class TestManageBean {

	private String strCodigo="hello test1";
	private String strHtml = "<p>texto en negrita</p>";
	@Autowired
	TestService testService;
	
	public String navToBienvenidoCliente(ActionEvent actionEvent) {
		System.out.println("test print");
		return "to_BienvenidoCliente";
	}

	
	public void submitBoton(ActionEvent actionEvent){
		strCodigo="caso 2";
		addMessage("Welcome to Primefaces!!");
//		testService.insertPlan();
		this.generarHtml();
	}
	
	private void generarHtml() {
		this.setStrHtml("Codigo generado primefaces. <p:inputText value='#{testManageBean.strCodigo}' ></p:inputText>");
		
	}

	public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
	public String getStrCodigo() {
		return strCodigo;
	}

	public void setStrCodigo(String strCodigo) {
		this.strCodigo = strCodigo;
	}
	
	public TestManageBean() {
		System.out.println("Load TestManageBean");
	}

	public String getStrHtml() {
		return strHtml;
	}

	public void setStrHtml(String strHtml) {
		this.strHtml = strHtml;
	}

	
	
}
