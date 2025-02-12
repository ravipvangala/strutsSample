package github.guisofiati.struts2annotations.dao;

import java.util.List;

import github.guisofiati.struts2annotations.beans.Contact;

public interface ContactDAO {

	int insert(Contact obj);
	int update(Contact obj);
	int deleteById(Integer id);
	Contact findById(Integer id);
	List<Contact> findAll();
}
