package ec.edu.ups.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class MiSaludo {

    public String saludar(String nombre) {	 
	return "Hola, " + nombre + ".";
    }
}

