package com.masai.app.service;
import java.util.List;

import com.masai.app.entity.Devices;
public interface DeviceService {
	public boolean addNewDevice(Devices device);
	
	public boolean updateDevice(Devices device);
	
	public boolean deleteDevice(int id);
	
	public Devices getDevice(int id);
	
	public List<Devices> getAllDevices();
	
	

}
