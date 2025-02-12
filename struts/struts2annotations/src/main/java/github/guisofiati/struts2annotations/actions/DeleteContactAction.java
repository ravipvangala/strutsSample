package github.guisofiati.struts2annotations.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import github.guisofiati.struts2annotations.beans.Contact;
import github.guisofiati.struts2annotations.dao.ContactDAO;
import github.guisofiati.struts2annotations.dao.DaoFactory;

@Action(value = "delete", results = {
		@Result(name = "SUCCESS", location = "/index.jsp"),
		@Result(name = "ERROR", location = "/error.jsp")
})
public class DeleteContactAction {
	
	ContactDAO contactDAO = DaoFactory.contactDaoInstance();
	
	private Integer contactId;
	private Contact contact;
	
	public String execute() throws Exception {
		int result = contactDAO.deleteById(contactId);
		
		if (result == 1) {
			return "SUCCESS";
		}
		
		return "ERROR";
	}
	
	public Integer getContactId() {
		return contactId;
	}
	
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	
	public Contact getContact() {
		return contact;
	}
	
	public void setContact(Contact contact) {
		this.contact = contact;
	}
}
