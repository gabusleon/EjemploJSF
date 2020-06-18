package ec.edu.ups.beans;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;

@Named
@RequestScoped
public class Validator {
    private String id;
    private String pass;
    private int age;
    private double offer;

    public Validator() {
    }

    public void validatorId(FacesContext context, UIComponent componentToValidate, Object value)
	    throws ValidatorException {
	String id = (String) value;
	if (id.equals("id")) {
	    FacesMessage message = new FacesMessage("id reservado");
	    throw new ValidatorException(message);
	}
    }

    public String process() {
	// Se valida con la capa de negocio o se relacionan campos
	FacesContext context = FacesContext.getCurrentInstance();
	if (this.getId().equals(this.getPass()))
	    context.addMessage("form", new FacesMessage("La clave no debe coincidir con el id"));
	if (context.getMessageList().size() > 0) {
	    System.out.println("nulo");
	    return (null);
	}

	else
	    return ("validatorOk");
    }
    // getters & setters

    public String getId() {
	return id;
    }

    public void setId(String id) {
	this.id = id;
    }

    public String getPass() {
	return pass;
    }

    public void setPass(String pass) {
	this.pass = pass;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

    public double getOffer() {
	return offer;
    }

    public void setOffer(double offer) {
	this.offer = offer;
    }

}