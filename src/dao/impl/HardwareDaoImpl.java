package dao.impl;

import java.util.List;
import java.util.Map;

import dao.DBHelper;
import dao.IHardwareDao;
import entity.Box;
import entity.Cpu;
import entity.Disk;
import entity.Graphics;
import entity.Memory;
import entity.MotherBoard;
import entity.Source;

public class HardwareDaoImpl implements IHardwareDao {

	@Override
	public int addCPU(Map<String, String> map) {
		DBHelper dbHelper = new DBHelper();
		String sql = "insert into cpu values(0,?,?,?,?,'0','0',?,?,?,?,?,?)";
		return dbHelper.update(sql, map.get("cname"), map.getOrDefault("cpics", ""), map.get("price"), 
		map.get("quantiy"), map.get("score"), map.get("powers"), map.get("cores"), map.get("threads"), map.get("frequency"),map.get("maxfrequency"));
	}

	@Override
	public int addMotherboard(Map<String, String> map) {
		DBHelper dbHelper = new DBHelper();
		String sql = "insert into motherboard values(0,?,?,?,?,'0','0',?,?,?)";
		return dbHelper.update(sql, map.get("name"), map.getOrDefault("bpics", ""), map.get("price"), map.get("quantiy"), map.get("score"), map.get("powers"), map.get("maxmemory"));
	}

	@Override
	public int addMemory(Map<String, String> map) {
		DBHelper dbHelper = new DBHelper();
		String sql = "insert into memory values(0,?,?,?,?,'0','0',?,?,?,?,?)";
		return dbHelper.update(sql, map.get("name"), map.getOrDefault("mpics", ""), map.get("memoryprice"), map.get("quantiy"), map.get("score"), map.get("powers"), map.get("volume"), map.get("memorytype"), map.get("frequency") );
	}

	@Override
	public int addDisk(Map<String, String> map) {
		DBHelper dbHelper = new DBHelper();
		String sql = "insert into disk values(0,?,?,?,?,'0','0',?,?,?,?,?)";
		return dbHelper.update(sql, map.get("name"), map.getOrDefault("dpics", ""), map.get("diskprice"), map.get("quantiy"), map.get("score"), map.get("powers"), map.get("volume"), map.get("isssd"), map.get("rpm"));
	}

	@Override
	public int addSource(Map<String, String> map) {
		DBHelper dbHelper = new DBHelper();
		String sql = "insert into source values(0,?,?,?,?,'0','0',?,?)";
		return dbHelper.update(sql, map.get("name"), map.getOrDefault("spics", ""), map.get("sourceprice"), map.get("quantiy"), map.get("score"), map.get("maxpowers"));
	}

	@Override
	public int addGraphics(Map<String, String> map) {
		DBHelper dbHelper = new DBHelper();
		String sql = "insert into graphics values(0,?,?,?,?,'0','0',?,?,?,?)";
		return dbHelper.update(sql, map.get("name"), map.getOrDefault("gpics", ""), map.get("graphicsprice"), map.get("quantiy"), map.get("score"), map.get("powers"), map.get("memory"), map.get("width"));
	}

	@Override
	public int addBox(Map<String, String> map) {
		DBHelper dbHelper = new DBHelper();
		String sql = "insert into box values(0,?,?,?,?,'0','0')";
		return dbHelper.update(sql, map.get("name"), map.getOrDefault("boxpics", ""), map.get("boxprice"), map.get("quantiy"));
	}

	@Override
	public Cpu findCPU(Integer cpuid) {
		DBHelper db = new DBHelper();
		String sql="select * from cpu where cpuid = ?";
		return db.find(sql, Cpu.class, cpuid);
	}

	@Override
	public MotherBoard findMotherboard(Integer motherboardid) {
		DBHelper db = new DBHelper();
		String sql="select * from motherboard where motherboardid = ?";
		return db.find(sql,MotherBoard.class, motherboardid);
	}

	@Override
	public Memory findMemory(Integer memoryid) {
		DBHelper db = new DBHelper();
		String sql="select * from memory where memoryid = ?";
		return db.find(sql, Memory.class, memoryid);
	}

	@Override
	public Disk findDisk(Integer diskid) {
		DBHelper db = new DBHelper();
		String sql="select * from disk  where diskid = ?";
		return db.find(sql, Disk.class, diskid);
	}

	@Override
	public Source findSource(Integer sourceid) {
		DBHelper db = new DBHelper();
		String sql="select * from  source where  sourceid = ?";
		return db.find(sql, Source.class,  sourceid);
	}

	@Override
	public Graphics findGraphics(Integer graphicsid) {
		DBHelper db = new DBHelper();
		String sql="select * from graphics where graphicsid = ?";
		return db.find(sql, Graphics.class, graphicsid);
	}

	@Override
	public Box findBox(Integer boxid) {
		DBHelper db = new DBHelper();
		String sql="select * from box where boxid = ?";
		return db.find(sql, Box.class, boxid);
	}
	@Override
	public <T> List<T> findByPage(int page, int rows, String id, String formName, String priceName, Class<?> c) {
		DBHelper dbHelper = new DBHelper();
		String sql = null;
		if ("box".equalsIgnoreCase(formName)) {
			sql = "select "+ id +", name, "+ priceName +", quantiy, usetimes from "+ formName +" where state = '1' limit ?, ?";
		} else {
			sql = "select "+ id +", name, "+ priceName +", quantiy, usetimes, score from "+ formName +" where state = '1' limit ?, ?";
		}
		return dbHelper.finds(sql, c, (page - 1) * rows, rows);
	}

	@Override
	public int getTotal(String id, String formName) {
		DBHelper dbHelper = new DBHelper();
		String sql = "select count(?) from " + formName;
		return dbHelper.getTotal(sql, id);
	}

	@Override
	public int delHardWare(Integer id, String idName, String formName) {
		DBHelper dbHelper = new DBHelper();
		String sql = "update "+ formName +" set state = '0' where "+ idName + " = ?";
		return dbHelper.update(sql, id);
	}

	@Override
	public <T> List<T> findHardWares(String priceName, String formName, String type, Class<?> c) {
		DBHelper dbHelper = new DBHelper();
		String sql = "select name, "+priceName+", praise, usetimes, pics from "+formName+" order by " + type +" desc limit 0, 10";
		return dbHelper.finds(sql, c);
	}


}
