package github.guisofiati.struts2annotations.actions;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import github.guisofiati.struts2annotations.beans.Contact;
import github.guisofiati.struts2annotations.dao.ContactDAO;
import github.guisofiati.struts2annotations.dao.DaoFactory;

@Action(value = "create", results = {
		@Result(name = "SUCCESS", location = "/index.jsp"),
		@Result(name = "ERROR", location = "/error.jsp"),
})
public class CreateContactAction {
	
	ContactDAO contactDAO = DaoFactory.contactDaoInstance();
		
	private String name;
	private String number;
	
	private List<Contact> contacts = new ArrayList<>();
	
	public String execute() throws Exception {
		Contact contact = new Contact(name, number);
		int result = contactDAO.insert(contact);
		
		if (result == 1) {
			contacts = contactDAO.findAll();
			return "SUCCESS";
		}
		
		return "ERROR";
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
}
