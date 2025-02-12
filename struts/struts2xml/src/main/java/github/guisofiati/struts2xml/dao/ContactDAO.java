package github.guisofiati.struts2xml.dao;

import java.util.List;

import github.guisofiati.struts2xml.beans.Contact;

public interface ContactDAO {

	int insert(Contact obj);
	int update(Contact obj);
	int deleteById(Integer id);
	Contact findById(Integer id);
	List<Contact> findAll();
}
