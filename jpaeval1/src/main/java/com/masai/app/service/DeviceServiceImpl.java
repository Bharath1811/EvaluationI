package com.masai.app.service;

import java.util.List;

import com.masai.app.dao.DeviceDao;
import com.masai.app.dao.DeviceDaoImpl;
import com.masai.app.entity.Devices;

public class DeviceServiceImpl implements DeviceService {
	
	DeviceDao dao = new DeviceDaoImpl();

	@Override
	public boolean addNewDevice(Devices device) {
		// TODO Auto-generated method stub
		return dao.insert(device);
	}

	@Override
	public boolean updateDevice(Devices device) {
		// TODO Auto-generated method stub
		return dao.update(device);
	}

	@Override
	public boolean deleteDevice(int id) {
		// TODO Auto-generated method stub
		return dao.remove(id);
	}

	@Override
	public Devices getDevice(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Devices> getAllDevices() {
		// TODO Auto-generated method stub
		return null;
	}

}
