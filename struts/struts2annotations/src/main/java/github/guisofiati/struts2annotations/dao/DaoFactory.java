package github.guisofiati.struts2annotations.dao;

import github.guisofiati.struts2annotations.dao.impl.ContactDaoImpl;
import github.guisofiati.struts2annotations.db.DB;

public class DaoFactory {
	
	public static ContactDAO contactDaoInstance() {
		return new ContactDaoImpl(DB.getConnection());
	}
}
