package colin.fileupload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.apache.commons.io.IOUtils;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

@ManagedBean(name = "fileBean")
@RequestScoped
public class FileBean {

	public FileBean() {
	} 

	// it just work on the IE.
	public void handleFileUpload(FileUploadEvent event) {
		System.out.println("handleFileUpload");
		UploadedFile file = event.getFile();
		System.out.println("file:" + file.getFileName());
		saveTo(file);
		 FacesMessage msg = new FacesMessage("Succesful", event.getFile()
		 .getFileName() + " is uploaded.");
		 FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void saveTo(UploadedFile file) {
		try {
			String filename = "D:/tmp/upload/" + file.getFileName();
			IOUtils.copy(file.getInputstream(), new FileOutputStream(new File(filename)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
