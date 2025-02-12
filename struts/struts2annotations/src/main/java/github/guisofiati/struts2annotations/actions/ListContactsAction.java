package github.guisofiati.struts2annotations.actions;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import github.guisofiati.struts2annotations.beans.Contact;
import github.guisofiati.struts2annotations.dao.ContactDAO;
import github.guisofiati.struts2annotations.dao.DaoFactory;

@Action(value = "list")
@Result(name = "SUCCESS", location = "/list.jsp")
public class ListContactsAction {
	
	ContactDAO contactDAO = DaoFactory.contactDaoInstance();
	
	private List<Contact> contacts = new ArrayList<Contact>();
	
	public String execute() throws Exception {
		contacts = contactDAO.findAll();
		return "SUCCESS";
	}
		
	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
}
