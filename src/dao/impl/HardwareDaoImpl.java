package dao.impl;

import java.util.Map;

import dao.DBHelper;
import dao.IHardwareDao;

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

}
