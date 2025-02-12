package github.guisofiati.struts2xml.actions;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.Action;

import github.guisofiati.struts2xml.beans.Contact;
import github.guisofiati.struts2xml.dao.ContactDAO;
import github.guisofiati.struts2xml.dao.DaoFactory;

public class ListContactsAction implements Action {
	
	ContactDAO contactDAO = DaoFactory.contactDaoInstance();
	
	private List<Contact> contacts = new ArrayList<Contact>();
	
	@Override
	public String execute() throws Exception {
		contacts = contactDAO.findAll();
		return SUCCESS;
	}
		
	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
}
