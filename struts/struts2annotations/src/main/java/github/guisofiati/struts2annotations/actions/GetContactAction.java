package github.guisofiati.struts2annotations.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import github.guisofiati.struts2annotations.beans.Contact;
import github.guisofiati.struts2annotations.dao.ContactDAO;
import github.guisofiati.struts2annotations.dao.DaoFactory;

@Action(value = "get")
@Result(name = "SUCCESS", location = "/update.jsp")
public class GetContactAction {
	
	ContactDAO contactDAO = DaoFactory.contactDaoInstance();
	
	private Integer contactId;
	private Contact contact;
	
	public String execute() throws Exception {
		contact = contactDAO.findById(contactId);
		return "SUCCESS";
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
