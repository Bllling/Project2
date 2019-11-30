package biz.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import biz.IComputerBiz;
import biz.IHardwareBiz;
import dao.IHardwareDao;
import dao.impl.HardwareDaoImpl;
import entity.Box;
import entity.Computer;
import entity.Cpu;
import entity.Disk;
import entity.Graphics;
import entity.Memory;
import entity.MotherBoard;
import entity.Source;
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

	@Override
	public Cpu findCPU(Integer cpuid) {
			if(cpuid==null){return null;}
			IHardwareDao hardwareDao = new HardwareDaoImpl();
			return hardwareDao.findCPU(cpuid);
		
	}

	@Override
	public MotherBoard findMotherboard(Integer motherboardid) {
			if(motherboardid==null){return null;}
			IHardwareDao hardwareDao = new HardwareDaoImpl();
			return hardwareDao.findMotherboard(motherboardid);
	}

	@Override
	public Memory findMemory(Integer memoryid) {
			if(memoryid==null){return null;}
			IHardwareDao hardwareDao = new HardwareDaoImpl();
			return hardwareDao.findMemory(memoryid);
	}

	@Override
	public Disk findDisk(Integer diskid) {
			if(diskid==null){return null;}
			IHardwareDao hardwareDao = new HardwareDaoImpl();
			return hardwareDao.findDisk(diskid);
	}

	@Override
	public Source findSource(Integer sourceid) {
			if(sourceid==null){return null;}
			IHardwareDao hardwareDao = new HardwareDaoImpl();
			return hardwareDao.findSource(sourceid);
	}

	@Override
	public Graphics findGraphics(Integer graphicsid) {
			if(graphicsid==null){return null;}
			IHardwareDao hardwareDao = new HardwareDaoImpl();
			return hardwareDao.findGraphics(graphicsid);
	}

	@Override
	public Box findBox(Integer boxid) {
			if( boxid==null){return null;}
			IHardwareDao hardwareDao = new HardwareDaoImpl();
			return hardwareDao.findBox(boxid);
	}

	@Override
	public Map<String, Object> findHardWareById(Integer id) {
		IComputerBiz computerBiz = new ComputerBizImpl();
		Computer computer =computerBiz.findHardWardIdById(id);
		int cpuid = computer.getCpuid();
		int motherboardid = computer.getMotherboardid();
		int memoryid = computer.getMemoryid();
		int diskid = computer.getDiskid();
		int sourceid = computer.getSourceid();
		int graphicsid = computer.getGraphicsid();
		int boxid = computer.getBoxid();
		Map<String, Object> map = new HashMap<String, Object>(); 
		Cpu cpu = this.findCPU(cpuid);
		MotherBoard motherboard = this.findMotherboard(motherboardid);
		Memory memory = this.findMemory(memoryid);
		Disk  disk = this.findDisk(diskid);
		Source source = this.findSource(sourceid);
		Graphics graphics =this.findGraphics(graphicsid);
		Box box = this.findBox(boxid);
		map.put("cpu", cpu);
		map.put("motherboard", motherboard);
		map.put("memory", memory);
		map.put("disk", disk);
		map.put("source", source);
		map.put("graphics", graphics);
		map.put("box", box);
		return map;
	}
	@Override
	public Map<String, Object> findByPage(int page, int rows, String id, String formName, String priceName, Class<?> c) {
		Map<String, Object> map = new HashMap<String, Object>();
		IHardwareDao hardwareDao = new HardwareDaoImpl();
		map.put("total", hardwareDao.getTotal(id, formName));
		map.put("rows", hardwareDao.findByPage(page, rows, id, formName, priceName, c));
		return map;
	}

	@Override
	public int delHardWare(Integer id, String idName, String formName) {
		if (id == null || "".equals(id)) {
			return 0;
		}
		if (StringUtil.CheckNull(idName, formName)) {
			return 0;
		}
		IHardwareDao hardwareDao = new HardwareDaoImpl();
		return hardwareDao.delHardWare(id, idName, formName);
	}

	@Override
	public <T> List<T> findHardWares(String priceName, String formName, String type, Class<?> c) {
		if (StringUtil.CheckNull(type, priceName, formName)) {
			return null;
		}
		IHardwareDao hardwareDao = new HardwareDaoImpl();
		return hardwareDao.findHardWares(priceName, formName, type, c);
	}

	@Override
	public int updateHardware(Integer id, String idName, String formName, String op, String value) {
		if (id == null) {
			return 0;
		}
		if (StringUtil.CheckNull(idName, formName, op, value)) {
			return 0;
		}
		IHardwareDao hardwareDao = new HardwareDaoImpl();
		return hardwareDao.updateHardware(id, idName, formName, op, value);
	}

	@Override
	public List<Cpu> findCpuByPage(String name, Double minprice, Double maxprice, Double minfrequency,
			Double maxfrequency, Integer cores,int page,int rows) {
		IHardwareDao hardwareDao = new HardwareDaoImpl();
		return hardwareDao.findCpuByPage(name, minprice, maxprice, minfrequency, maxfrequency, cores,page,rows);
	}

	@Override
	public List<MotherBoard> findMotherboardByPage(String name, Double minprice, Double maxprice, Integer minmaxmemory,
			Integer maxmaxmemory, int page, int rows) {
		IHardwareDao hardwareDao = new HardwareDaoImpl();
		return hardwareDao.findMotherboardByPage(name, minprice, maxprice, minmaxmemory, maxmaxmemory, page, rows);
	}

	@Override
	public List<Memory> findMemoryByPage(String name, Double minprice, Double maxprice, Integer minfrequency,
			Integer maxfrequency, Integer memorytype, Integer volume, int page, int rows) {

		IHardwareDao hardwareDao = new HardwareDaoImpl();
		return hardwareDao.findMemoryByPage(name, minprice, maxprice, minfrequency, maxfrequency, memorytype, volume, page, rows);
	}

	@Override
	public List<Disk> findDiskByPage(String name, Double minprice, Double maxprice, Integer minvolume,
			Integer maxvolume, Integer isssd, int page, int rows) {
		IHardwareDao hardwareDao = new HardwareDaoImpl();
		return hardwareDao.findDiskByPage(name, minprice, maxprice, minvolume, maxvolume, isssd, page, rows);
	}

	@Override
	public List<Graphics> findGraphicsByPage(String name, Double minprice, Double maxprice, Integer minmemory,
			Integer maxmemory, Integer minwidth, Integer maxwidth, int page, int rows) {
		IHardwareDao hardwareDao = new HardwareDaoImpl();
		return hardwareDao.findGraphicsByPage(name, minprice, maxprice, minmemory, maxmemory, minwidth, maxwidth, page, rows);
	}

	@Override
	public List<Source> findSourceByPage(String name, Double minprice, Double maxprice, Integer minpowers,
			Integer maxpowers, int page, int rows) {
		IHardwareDao hardwareDao = new HardwareDaoImpl();
		return hardwareDao.findSourceByPage(name, minprice, maxprice, minpowers, maxpowers, page, rows);
	}

	@Override
	public List<Box> findBoxByPage(String name, Double minprice, Double maxprice, int page, int rows) {
		IHardwareDao hardwareDao = new HardwareDaoImpl();
		return hardwareDao.findBoxByPage(name, minprice, maxprice, page, rows);
	}

	@Override
	public int getTotal(String id, String formName) {
		IHardwareDao hardwareDao = new HardwareDaoImpl();
		return hardwareDao.getTotal(id, formName);
	}

}
