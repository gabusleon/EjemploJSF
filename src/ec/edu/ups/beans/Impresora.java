package ec.edu.ups.beans;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Inject;
import javax.inject.Named;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@RequestScoped
public class Impresora implements Serializable {

    private static final long serialVersionUID = 1L;
    @Inject
    private MiSaludo miSaludo;

    public Impresora() {

    }

    public MiSaludo getMiSaludo() {
	return miSaludo;
    }
    
}

