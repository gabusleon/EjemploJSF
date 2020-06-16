package ec.edu.ups.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Navigator {

    private String page;
    private boolean login;

    public Navigator() {
    }

    public String process() {
	if (page == null || page.trim().isEmpty())
	    return "errorPage";
	else if (page.equals("page1"))
	    return "page1";
	else if (page.equals("pr1"))
	    return "r1";
	else if (page.equals("pr2"))
	    return "r2";
	else
	    return "errorPage";
    }

    // Getters & setters

    public String getPage() {
	return page;
    }

    public void setPage(String page) {
	this.page = page;
    }

    public boolean isLogin() {
	return login;
    }

    public void setLogin(boolean login) {
	this.login = login;
    }
}
