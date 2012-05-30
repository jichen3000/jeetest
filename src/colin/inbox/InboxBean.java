package colin.inbox;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;


@ManagedBean(name = "inboxBean")
@RequestScoped
public class InboxBean {
	public InboxBean() {
		System.out.println("InboxBean...");
	}
	@ManagedProperty(value="#{param.transParam}")
	private String transParam;
	public String getTransParam() {
		return transParam;
	}
	public void setTransParam(String transParam) {
		this.transParam = transParam;
	}
	@PostConstruct
	public void postConstruct(){
		System.out.println("InboxBean postConstruct...");
		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();

		System.out.println("trans_param:: " + request.getParameter("trans_param"));


	}

}
