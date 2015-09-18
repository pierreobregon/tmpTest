package com.alpiresac.awore.managebean.backing;

import java.util.ArrayList;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ComponentSystemEvent;

import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alpiresac.awore.domain.Tcontenido;
import com.alpiresac.awore.domain.Tcuenta;
import com.alpiresac.awore.domain.Tplantilla;
import com.alpiresac.awore.managebean.model.ConfiguracionFrontModel;
import com.alpiresac.awore.service.TestService;
import com.alpiresac.awore.util.Constantes;

@Component
@ManagedBean
@RequestScoped
public class ConfiguracionFrontManageBean extends GenericManageBean {

	@Autowired
	TestService testService;
	
	ConfiguracionFrontModel configuracionFrontModel;
	
	public ConfiguracionFrontManageBean() {
		this.initCargarDatosDummys();
	}
	
	public void preLoadSeleccionPlantilla(ComponentSystemEvent event){
		this.getConfiguracionFrontModel().setIntIndexStep(0);
	}
	
	public void preLoadConfigContenidoPagina(ComponentSystemEvent event){
		this.getConfiguracionFrontModel().setIntIndexStep(1);
		this.initCargarDatosDummyConfigContenidoPagina();
		
	}
	
	public void preLoadDatosComplementarios(ComponentSystemEvent event){
		this.getConfiguracionFrontModel().setIntIndexStep(2);
		this.initCargarDatosDummyDatoComplementario();
	}
	public void preLoadDatosTecnicos(ComponentSystemEvent event){
		this.getConfiguracionFrontModel().setIntIndexStep(3);
		this.initCargarDatosDummyDatosTecnicos();
	}
	

	public String navToBienvenidoCliente() {
		System.out.println("to_BienvenidoCliente");
		return "to_BienvenidoCliente";
	}
	public void submitBoton(ActionEvent actionEvent) {
		addMessage("Welcome to Primefaces!!");
	}
	public void addMessage(String summary) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				summary, null);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}


	
	
	public ConfiguracionFrontModel getConfiguracionFrontModel() {
		return configuracionFrontModel;
	}
	public void setConfiguracionFrontModel(
			ConfiguracionFrontModel configuracionFrontModel) {
		this.configuracionFrontModel = configuracionFrontModel;
	}
	
	
	private void initCargarDatosDummys() {
		configuracionFrontModel = new ConfiguracionFrontModel();
		configuracionFrontModel.setLstPlantilla(new ArrayList<Tplantilla>());
		Tplantilla tplantilla = new Tplantilla();
		tplantilla.setId(1);
		tplantilla.setNombPlantilla("Plantilla de prueba");
		tplantilla.setDescPlantilla("Descripción de plantilla donde se habla generalmente de la pagina");
		tplantilla.setEstado(Constantes.estado.ACTIVO);
		configuracionFrontModel.getLstPlantilla().add(tplantilla);
		tplantilla.setId(2);
		configuracionFrontModel.getLstPlantilla().add(tplantilla);
		tplantilla.setId(3);
		configuracionFrontModel.getLstPlantilla().add(tplantilla);
		tplantilla.setId(4);
		configuracionFrontModel.getLstPlantilla().add(tplantilla);
		tplantilla.setId(5);
		configuracionFrontModel.getLstPlantilla().add(tplantilla);
		tplantilla.setId(6);
		configuracionFrontModel.getLstPlantilla().add(tplantilla);
		tplantilla.setId(7);
		configuracionFrontModel.getLstPlantilla().add(tplantilla);
	}
	
	private void initCargarDatosDummyConfigContenidoPagina() {
		this.getConfiguracionFrontModel().setLstContenido(new ArrayList<Tcontenido>());
		Tcontenido tcontenido = new Tcontenido();
		tcontenido.setNombCabeBloque("Bienvendidos");
		tcontenido.setTextBloque("Bienvenidos a esta pagina que esta bien chevere.");
		this.getConfiguracionFrontModel().getLstContenido().add(tcontenido);
		tcontenido = new Tcontenido();
		tcontenido.setNombCabeBloque("Mision y Visión");
		tcontenido.setTextBloque("Contribuir con el negocio de nuestros clientes brindando confianza a través de Servicios de TI con colaboradores altamente calificados y confiables. Y como visión Ser EL Socio de Negocios en TI reconocido a nivel Nacional con Proyección Regional por su extraordinaria calidad de servicio.");
		this.getConfiguracionFrontModel().getLstContenido().add(tcontenido);
		tcontenido = new Tcontenido();
		tcontenido.setNombCabeBloque("Servicios");
		tcontenido.setTextBloque("Ser una empresa referente en Tecnología de la Información. "
				+ "Posicionarnos como empresa referente en servicios de Outsourcing con capa de Gestión y Application Management. "
				+ "Penetrar en otros países de la región replicando el modelo de éxito desarrollado en Perú. "
				+ "Desarrollar nuevas líneas de Servicio. Ser una empresa referente en contratación y fidelización del talento.");
		this.getConfiguracionFrontModel().getLstContenido().add(tcontenido);
		tcontenido = new Tcontenido();
		tcontenido.setNombCabeBloque("Locales");
		tcontenido.setTextBloque("Visite nuestros locales");
		this.getConfiguracionFrontModel().getLstContenido().add(tcontenido);
		tcontenido = new Tcontenido();
		tcontenido.setNombCabeBloque("Clientes");
		tcontenido.setTextBloque("Algunos de nuestros principales clientes");
		this.getConfiguracionFrontModel().getLstContenido().add(tcontenido);
		tcontenido = new Tcontenido();
		tcontenido.setNombCabeBloque("Reservas");
		tcontenido.setTextBloque("Has tus reservas en linea.");
		this.getConfiguracionFrontModel().getLstContenido().add(tcontenido);
		tcontenido = new Tcontenido();
		tcontenido.setNombCabeBloque("Contacto");
		tcontenido.setTextBloque("Contacte con nosotros");
		this.getConfiguracionFrontModel().getLstContenido().add(tcontenido);
		
	}
	
	private void initCargarDatosDummyDatoComplementario() {
		this.getConfiguracionFrontModel().setLstCuentas(new ArrayList<Tcuenta>());
		Tcuenta tcuenta = new Tcuenta();
		tcuenta.setNroCta("014202123423409300");
		tcuenta.setPropCtaRef("Canchitas SA - Olivos");
		tcuenta.setDescCta("BBVA - Cuenta Ahorros Soles");
		this.getConfiguracionFrontModel().getLstCuentas().add(tcuenta);
		
		tcuenta = new Tcuenta();
		tcuenta.setNroCta("098765432345678");
		tcuenta.setPropCtaRef("Canchitas SA");
		tcuenta.setDescCta("ScotiaBank - Cuenta Ahorros Soles");
		this.getConfiguracionFrontModel().getLstCuentas().add(tcuenta);
		
		tcuenta = new Tcuenta();
		tcuenta.setNroCta("123456789009876543");
		tcuenta.setPropCtaRef("Canchitas SA");
		tcuenta.setDescCta("BCP - Cuenta Ahorros Soles");
		this.getConfiguracionFrontModel().getLstCuentas().add(tcuenta);
		
	}
	private void initCargarDatosDummyDatosTecnicos() {
		
	}
	
	
}
