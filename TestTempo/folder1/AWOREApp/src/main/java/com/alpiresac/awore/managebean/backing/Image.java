package com.alpiresac.awore.managebean.backing;

import java.io.FileInputStream;
import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

@ManagedBean
@RequestScoped
public class Image {

   public StreamedContent getImage() throws IOException {
        FacesContext context = FacesContext.getCurrentInstance();
        String id = context.getExternalContext().getRequestParameterMap().get("id_param");
        System.out.println("ID_IMAGEN_PARAM_IMAGE:"+id);
        if (context.getRenderResponse()) {
            // So, we're rendering the view. Return a stub StreamedContent so that it will generate right URL.
            return new DefaultStreamedContent();
        }
        else {
            // So, browser is requesting the image. Get ID value from actual request param.
            id = context.getExternalContext().getRequestParameterMap().get("id");
//            Image image = service.find(Long.valueOf(id));
            return new DefaultStreamedContent(new FileInputStream("G:\\recursos\\plantillas\\preview\\plantilla1.jpg"));
        }
    }

}
