package biz.impl;

import java.util.Map;

import biz.IHardwareBiz;
import dao.IHardwareDao;
import dao.impl.HardwareDaoImpl;
import util.StringUtil;

public class HardwareBizImpl implements IHardwareBiz {

	@Override
	public int addCPU(Map<String, String> map) {
		//判空
		if (StringUtil.CheckNull(map.get("cname"), map.get("cpics"), map.get("price"), 
		map.get("quantiy"), map.get("score"), map.get("powers"), map.get("cores"), map.get("threads"), map.get("frequency"),map.get("maxfrequency"))){
			return -1;
		}
		IHardwareDao hardwareDao = new HardwareDaoImpl();
		return hardwareDao.addCPU(map);
	}

	@Override
	public int addMotherboard(Map<String, String> map) {
		if (StringUtil.CheckNull(map.get("name"), map.get("bpics"), map.get("price"), map.get("quantiy"), map.get("score"), map.get("powers"), map.get("maxmemory"))) {
			return -1;
		}
		IHardwareDao hardwareDao = new HardwareDaoImpl();
		return hardwareDao.addMotherboard(map);
	}

	@Override
	public int addMemory(Map<String, String> map) {
		if (StringUtil.CheckNull(map.get("name"), map.getOrDefault("mpics", ""), map.get("memoryprice"), map.get("quantiy"), map.get("score"), map.get("powers"), map.get("volume"), map.get("memorytype"), map.get("frequency"))) {
			return -1;
		}
		IHardwareDao hardwareDao = new HardwareDaoImpl();
		return hardwareDao.addMemory(map);
	}

	@Override
	public int addDisk(Map<String, String> map) {
		if (StringUtil.CheckNull(map.get("name"), map.getOrDefault("dpics", ""), map.get("diskprice"), map.get("quantiy"), map.get("score"), map.get("powers"), map.get("volume"), map.get("isssd"), map.get("rpm"))) {
			return -1;
		}
		IHardwareDao hardwareDao = new HardwareDaoImpl();
		return hardwareDao.addDisk(map);
	}

	@Override
	public int addSource(Map<String, String> map) {
		if (StringUtil.CheckNull(map.get("name"), map.getOrDefault("spics", ""), map.get("sourceprice"), map.get("quantiy"), map.get("score"), map.get("maxpowers"))) {
			return -1;
		}
		IHardwareDao hardwareDao = new HardwareDaoImpl();
		return hardwareDao.addSource(map);
	}

	@Override
	public int addGraphics(Map<String, String> map) {
		if (StringUtil.CheckNull(map.get("name"), map.getOrDefault("gpics", ""), map.get("graphicsprice"), map.get("quantiy"), map.get("score"), map.get("powers"), map.get("memory"), map.get("width"))) {
			return -1;
		}
		IHardwareDao hardwareDao = new HardwareDaoImpl();
		return hardwareDao.addGraphics(map);
	}

	@Override
	public int addBox(Map<String, String> map) {
		if (StringUtil.CheckNull(map.get("name"), map.getOrDefault("boxpics", ""), map.get("boxprice"), map.get("quantiy"))) {
			return -1;
		}
		IHardwareDao hardwareDao = new HardwareDaoImpl();
		return hardwareDao.addBox(map);
	}

}
