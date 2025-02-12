package github.guisofiati.struts2xml.db.errors;

public class DbException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public DbException(String msg) {
		super(msg);
	}
}
