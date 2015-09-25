package com.alpiresac.awore.managebean.backing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.event.PhaseId;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alpiresac.awore.domain.Tcontenido;
import com.alpiresac.awore.domain.Tcuenta;
import com.alpiresac.awore.domain.Timagenrepo;
import com.alpiresac.awore.domain.Tplantilla;
import com.alpiresac.awore.managebean.model.ConfiguracionFrontModel;
import com.alpiresac.awore.service.ImagenRepoService;
import com.alpiresac.awore.service.ParametroService;
import com.alpiresac.awore.service.PlantillaService;
import com.alpiresac.awore.util.Constantes;

@Component
@ManagedBean
@RequestScoped
public class ConfiguracionFrontManageBean extends GenericManageBean {

	@Autowired
	PlantillaService plantillaService;
	@Autowired
	ParametroService parametroService;
	
	@Autowired
	ImagenRepoService imagenRepoService;
	
	
	ConfiguracionFrontModel configuracionFrontModel;
	
	public ConfiguracionFrontManageBean() {
		
	}
	
	public void preLoadSeleccionPlantilla(ComponentSystemEvent event){
		this.getConfiguracionFrontModel().setIntIndexStep(0);
//		this.initCargarDatosDummys();
		this.getConfiguracionFrontModel().setLstPlantilla(
					plantillaService.obtenerPlantillasXTipo(Constantes.DEFAULT_COD_VALUE)
				);
		this.getConfiguracionFrontModel().setLstTipoPlantillas(plantillaService.obtenerTiposPlantillas());
	}
	
	

	public StreamedContent getImageStream() throws IOException {
        FacesContext context = FacesContext.getCurrentInstance();
        
        String id_img = this.getParameter("id_param");
        System.out.println("ID_IMG_PARAM:"+id_img);
        if (id_img!=null){
        	if(id_img.equals(""))id_img="0";
	        List<Timagenrepo> lstImg = imagenRepoService.obtenerImagenXIdPlantilla(Integer.parseInt(id_img));
	        if (lstImg==null || lstImg.size()==0){
	        	return new DefaultStreamedContent(new FileInputStream("G:\\recursos\\images\\imagen_no_disponible.png"));
	        }
	        if (context.getCurrentPhaseId() == PhaseId.RENDER_RESPONSE) {
	            // So, we're rendering the HTML. Return a stub StreamedContent so that it will generate right URL.
	            return new DefaultStreamedContent();
	        }
	        else {
	        	String strRuta = Constantes.STRING_EMPTY; 
	        	if(lstImg!=null && lstImg.size()>0){
	        		strRuta = lstImg.get(0).getRutaImag();
	        	 }
	            return new DefaultStreamedContent(new FileInputStream(strRuta));
	        }
        }else{
        	return new DefaultStreamedContent(new FileInputStream("G:\\recursos\\images\\imagen_no_disponible.png"));
        }
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
	
	public void filtrarPlantillas(ActionEvent actionEvent){
		this.getConfiguracionFrontModel().setLstPlantilla(
				plantillaService.obtenerPlantillasXTipo(this.getParameter("tipoPlantilla"))
			);
	}
	
	public void addMessage(String summary) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				summary, null);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public ConfiguracionFrontModel getConfiguracionFrontModel() {
		return configuracionFrontModel==null?configuracionFrontModel=new ConfiguracionFrontModel():configuracionFrontModel;
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
