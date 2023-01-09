package com.masai.app.dao;

import java.util.List;

import com.masai.app.entity.Devices;

public interface DeviceDao {
	public Devices findById(int id);
	
	public boolean insert(Devices device);
	
	public boolean remove(int id);
	
	public boolean update(Devices device);
	
	public List<Devices> findAll();

}
