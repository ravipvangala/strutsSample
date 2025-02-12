package github.guisofiati.struts2xml.actions;

import com.opensymphony.xwork2.Action;

import github.guisofiati.struts2xml.beans.Contact;
import github.guisofiati.struts2xml.dao.ContactDAO;
import github.guisofiati.struts2xml.dao.DaoFactory;

public class GetContactAction implements Action {
	
	ContactDAO contactDAO = DaoFactory.contactDaoInstance();
	
	private Integer contactId;
	private Contact contact;
	
	@Override
	public String execute() throws Exception {
		contact = contactDAO.findById(contactId);
		return SUCCESS;
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
