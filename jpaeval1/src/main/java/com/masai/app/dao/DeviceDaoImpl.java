package com.masai.app.dao;

import java.util.List;

import com.masai.app.entity.Devices;

public class DeviceDaoImpl implements DeviceDao {

	@Override
	public Devices findById(int id) {
		String query = "select * from device where id="+id;
		return null;
	}

	@Override
	public boolean insert(Devices device) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Devices device) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Devices> findAll() {
		// TODO Auto-generated method stub
		return null;
	}



}
