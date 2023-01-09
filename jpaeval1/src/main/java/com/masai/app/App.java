package com.masai.app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

import com.masai.app.entity.Devices;
import com.masai.app.utils.DBUtils;

public class App {
	public static void main(String[] args) {
		System.out.println(getDevice());
		Devices device = new Devices(3,"phone","samsung",40000,"8","de4","wrev5","wef5","wrfrre");
		if(insertDevice(device)) {
			System.out.println("Record inserted");
		}
		
	}

	public static Devices getDevice() {
		String query="Select * from device where id = 1";
		DBUtils.getConnection("evaldb");
		
		Statement stmt=DBUtils.getStatement();
		
		Devices device=null;
		
		try {
			ResultSet rs = stmt.executeQuery(query);
			if(rs.next()) {
				device = new Devices(rs.getInt("id"), rs.getString("model"), rs.getString("brand"), rs.getInt("price"), rs.getString("type"), rs.getString("camera_spec"), rs.getString("processor_spec"), rs.getString("memory_spec"), rs.getString("os_spec"));
			}
			DBUtils.closeResources();
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return device;
	}
	
	public static boolean insertDevice(Devices device) {
		boolean deviceAdded=false;
		String query="insert into device value (?,?,?,?,?,?,?,?,?)";
		DBUtils.getConnection("evaldb");
		PreparedStatement pst=DBUtils.getPreparedStatement(query);
		try {
			pst.setInt(1, device.getId());
			pst.setString(2, device.getModel());
			pst.setString(3,device.getBrand());
			pst.setInt(4, device.getPrice());
			pst.setString(5, device.getCamera_spec());
			pst.setString(6, device.getProcessor_spec());
			pst.setString(7, device.getMemory_spec());
			pst.setString(8, device.getOs_spec());
			pst.setString(9, device.getSize_spec());
			
			int row = pst.executeUpdate();
			if(row>0)
				deviceAdded=true;
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return deviceAdded;
	}

}
