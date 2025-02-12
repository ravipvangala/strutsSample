package github.guisofiati.struts2xml.actions;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.Action;

import github.guisofiati.struts2xml.beans.Contact;
import github.guisofiati.struts2xml.dao.ContactDAO;
import github.guisofiati.struts2xml.dao.DaoFactory;

public class UpdateContactAction implements Action {
	
	ContactDAO contactDAO = DaoFactory.contactDaoInstance();
		
	private Integer id;
	private String name;
	private String number;
	
	private List<Contact> contacts = new ArrayList<>();
	
	@Override
	public String execute() throws Exception {
		Contact contact = new Contact(id, name, number);
		int result = contactDAO.update(contact);
		
		if (result == 1) {
			contacts = contactDAO.findAll();
			return SUCCESS;
		}
		
		return ERROR;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
