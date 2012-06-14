package colin.rendered;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "renderedBean")
@ViewScoped
public class RenderedBean {
	private boolean editing;
	private String name;

	public void showRendredDialog(){
		this.editing = true;
		this.name = "123";
	}
	public void changeEditing() {
		System.out.println("changeEditing");
		this.editing = (!this.editing);
	}
	public boolean isEditing() {
		return editing;
	}


	public void setEditing(boolean editing) {
		this.editing = editing;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


}