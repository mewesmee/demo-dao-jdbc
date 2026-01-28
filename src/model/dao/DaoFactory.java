package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static createSellerDao() {
		return new SellerDaoJDBC();
	}
}