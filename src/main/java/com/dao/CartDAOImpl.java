package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.entity.Cart;

public class CartDAOImpl implements CartDAO{
	private Connection  conn;
	
	public CartDAOImpl(Connection conn) {
		this.conn=conn;
	}
	
	
	@Override
	public boolean AddCart(Cart c) {
		boolean f=false;
		try {
			String sql="insert into cart(BID,UID,BookName,Author,Price,Total) values(?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1 , c.getBID());
			ps.setInt(2 , c.getUID());
			ps.setString(3 , c.getBookName());
			ps.setString(4 , c.getAuthor());
			ps.setInt(5 , c.getPrice());
			ps.setInt(6 , c.getTotal());
			
			int i=ps.executeUpdate();
			if(i==1) {
				f=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	
	
}
