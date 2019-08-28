package com.wipro.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.wipro.bean.Bean;
import com.wipro.util.DBUtil;

public class Service {
	public  boolean storeData(Bean bean)
	{
		int i=0;
		try
		{
		String query="insert into userdata(firstname,lastname,emailid,userid)values(?,?,?,?);";
		Connection con=DBUtil.con();
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1, bean.getFirstname());
		pst.setString(2, bean.getLastnaame());
		pst.setString(3, bean.getEmail());
		pst.setString(4, bean.getUserid());
		i=pst.executeUpdate();
		if(i>0)
		{
			return true;
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	public boolean existingUser(Bean bean)
	{
		try
		{
			String query="select * from userdata where userid=?";
			Connection con=DBUtil.con();
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1, bean.getUserid());
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

}
