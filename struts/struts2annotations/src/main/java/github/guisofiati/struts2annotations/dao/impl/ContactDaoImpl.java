package github.guisofiati.struts2annotations.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import github.guisofiati.struts2annotations.beans.Contact;
import github.guisofiati.struts2annotations.dao.ContactDAO;
import github.guisofiati.struts2annotations.db.DB;
import github.guisofiati.struts2annotations.db.errors.DbException;

public class ContactDaoImpl implements ContactDAO {
	
	private Connection conn;
	private Statement statement;
	private ResultSet rs;
	
	public ContactDaoImpl(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public int insert(Contact obj) {
		int rs = 0;
		
		try {
			statement = conn.createStatement();
			String sql = "INSERT INTO contact (name, number) VALUES ('" + obj.getName() + "', '" + obj.getNumber() + "');";
			rs = statement.executeUpdate(sql);
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(statement);
		}
		
		return rs;
	}

	@Override
	public int update(Contact obj) {
		int rs = 0;
		
		try {
			statement = conn.createStatement();
			String sql = "UPDATE contact SET name = '" + obj.getName() + "', number = '" + obj.getNumber() + "' WHERE id = " + obj.getId();
			rs = statement.executeUpdate(sql);
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(statement);
		}
		
		return rs;
	}

	@Override
	public int deleteById(Integer id) {
		int rs = 0;
		
		try {
			statement = conn.createStatement();
			String sql = "DELETE FROM contact WHERE id = " + id;
			rs = statement.executeUpdate(sql);
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(statement);
		}
		
		return rs;
	}

	@Override
	public Contact findById(Integer id) {
		Contact contact = null;
		
		try {
			statement = conn.createStatement();
			String sql = "SELECT * FROM contact WHERE id = " + id + " LIMIT 1";
			rs = statement.executeQuery(sql);
			while(rs.next()) {
				contact = instantiateContact(rs);
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(statement);
			DB.closeResultSet(rs);
		}
		
		return contact;
	}

	@Override
	public List<Contact> findAll() {
		List<Contact> contacts = new ArrayList<>();
		
		try {
			statement = conn.createStatement();
			String sql = "SELECT * FROM contact ORDER BY name";
			rs = statement.executeQuery(sql);
						
			while (rs.next()) {
				Contact contact = instantiateContact(rs);
				contacts.add(contact);
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(statement);
			DB.closeResultSet(rs);
		}
		
		return contacts;
	}
	
	private Contact instantiateContact(ResultSet rs) throws SQLException {
		Contact contact = new Contact();
		contact.setId(rs.getInt("id"));
		contact.setName(rs.getString("name"));
		contact.setNumber(rs.getString("number"));
		return contact;
	}
}
