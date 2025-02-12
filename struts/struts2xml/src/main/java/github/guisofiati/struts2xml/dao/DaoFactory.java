package github.guisofiati.struts2xml.dao;

import github.guisofiati.struts2xml.dao.impl.ContactDaoImpl;
import github.guisofiati.struts2xml.db.DB;

public class DaoFactory {
	
	public static ContactDAO contactDaoInstance() {
		return new ContactDaoImpl(DB.getConnection());
	}
}
