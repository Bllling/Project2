package dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
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
		String sql = "insert into cpu values(0,?,?,?,?,'0','0',?,?,?,?,?,?,1)";
		return dbHelper.update(sql, map.get("cname"), map.getOrDefault("cpics", ""), map.get("price"), 
		map.get("quantiy"), map.get("score"), map.get("powers"), map.get("cores"), map.get("threads"), map.get("frequency"),map.get("maxfrequency"));
	}

	@Override
	public int addMotherboard(Map<String, String> map) {
		DBHelper dbHelper = new DBHelper();
		String sql = "insert into motherboard values(0,?,?,?,?,'0','0',?,?,?,1)";
		return dbHelper.update(sql, map.get("name"), map.getOrDefault("bpics", ""), map.get("price"), map.get("quantiy"), map.get("score"), map.get("powers"), map.get("maxmemory"));
	}

	@Override
	public int addMemory(Map<String, String> map) {
		DBHelper dbHelper = new DBHelper();
		String sql = "insert into memory values(0,?,?,?,?,'0','0',?,?,?,?,?,1)";
		return dbHelper.update(sql, map.get("name"), map.getOrDefault("mpics", ""), map.get("memoryprice"), map.get("quantiy"), map.get("score"), map.get("powers"), map.get("volume"), map.get("memorytype"), map.get("frequency") );
	}

	@Override
	public int addDisk(Map<String, String> map) {
		DBHelper dbHelper = new DBHelper();
		String sql = "insert into disk values(0,?,?,?,?,'0','0',?,?,?,?,?,1)";
		return dbHelper.update(sql, map.get("name"), map.getOrDefault("dpics", ""), map.get("diskprice"), map.get("quantiy"), map.get("score"), map.get("powers"), map.get("volume"), map.get("isssd"), map.get("rpm"));
	}

	@Override
	public int addSource(Map<String, String> map) {
		DBHelper dbHelper = new DBHelper();
		String sql = "insert into source values(0,?,?,?,?,'0','0',?,?,1)";
		return dbHelper.update(sql, map.get("name"), map.getOrDefault("spics", ""), map.get("sourceprice"), map.get("quantiy"), map.get("score"), map.get("maxpowers"));
	}

	@Override
	public int addGraphics(Map<String, String> map) {
		DBHelper dbHelper = new DBHelper();
		String sql = "insert into graphics values(0,?,?,?,?,'0','0',?,?,?,?,1)";
		return dbHelper.update(sql, map.get("name"), map.getOrDefault("gpics", ""), map.get("graphicsprice"), map.get("quantiy"), map.get("score"), map.get("powers"), map.get("memory"), map.get("width"));
	}

	@Override
	public int addBox(Map<String, String> map) {
		DBHelper dbHelper = new DBHelper();
		String sql = "insert into box values(0,?,?,?,?,'0','0',1,?)";
		return dbHelper.update(sql, map.get("name"), map.getOrDefault("boxpics", ""), map.get("boxprice"), map.get("quantiy"), map.get("score"));
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
		
		sql = "select "+ id +", name, "+ priceName +", quantiy, usetimes, score from "+ formName +" where state = '1' limit ?, ?";
		
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

	@Override
	public int updateHardware(Integer id, String idName, String formName, String op, String value) {
		DBHelper dbHelper = new DBHelper();
		String sql = "update "+formName+" set "+op+" = ? where "+idName+" = ? ";
		return dbHelper.update(sql, value, id);
	}


	@Override
	public List<Cpu> findCpuByPage(String name, Double minprice, Double maxprice, Double minfrequency,
			Double maxfrequency, Integer cores ,int page,int rows) {
		System.out.println(rows+" "+page+" "+minprice+" "+maxprice+" "+minfrequency+" "+maxfrequency+" "+cores+"name"+name);
		DBHelper dbHelper = new DBHelper();
		List <Object > list = new ArrayList<Object>(); 
		String sql="select * from cpu where 1=1 ";
		if(minprice!=null){
			sql+="and cpuprice>? ";
			list.add(minprice);
		} if(maxprice!=null){
			sql+="and cpuprice<=? ";
			list.add(maxprice);
		} if(minfrequency!=null){
			sql+="and ?<SUBSTRING_INDEX(frequency,'G',1) ";
			list.add(minfrequency);
		}if(maxfrequency!=null){
			sql+="and ?>=SUBSTRING_INDEX(frequency,'G',1) ";
			list.add(maxfrequency);
		} if(cores!=null){
			sql+="and cores = ? ";
			list.add(cores);
		} if(name!=null&&!"请输入名称".equals(name)){
			sql+="and name=? ";
			list.add(name);
		}
		
		sql +="order by usetimes desc limit ? , ? ";
		list.add((page-1)*rows);
		list.add(rows);
		System.out.println(sql);
		return  dbHelper.finds(sql, Cpu.class, list);
	}

	@Override
	public List<MotherBoard> findMotherboardByPage(String name, Double minprice, Double maxprice, Integer minmaxmemory,
			Integer maxmaxmemory, int page, int rows) {
		DBHelper dbHelper = new DBHelper();
		List <Object > list = new ArrayList<Object>(); 
		String sql="select * from motherboard where 1=1  ";
		if(minprice!=null){
			sql+="and motherboardprice>? ";
			list.add(minprice);
		}if(maxprice!=null){
			sql+="and motherboardprice<=? ";
			list.add(maxprice);
		}if(minmaxmemory!=null){
			sql+="and ?<SUBSTRING_INDEX(maxmemory,'G',1) ";
			list.add(minmaxmemory);
		}if(maxmaxmemory!=null){
			sql+="and ?>=SUBSTRING_INDEX(maxmemory,'G',1) ";
			list.add(maxmaxmemory);
		}if(name!=null&&!"请输入名称".equals(name)){
			sql+="and name=? ";
			list.add(name);
		}
		sql +="order by usetimes desc limit ? , ? ";
		list.add((page-1)*rows);
		list.add(rows);
		System.out.println(minmaxmemory+"ss"+maxmaxmemory);
		System.out.println(sql);
		return dbHelper.finds(sql, MotherBoard.class, list);
	}

	@Override
	public List<Memory> findMemoryByPage(String name, Double minprice, Double maxprice, Integer minfrequency,
			Integer maxfrequency, Integer memorytype, Integer volume, int page, int rows) {
		DBHelper dbHelper = new DBHelper();
		List <Object > list = new ArrayList<Object>(); 
		String sql="select * from memory where 1=1  ";
		if(minprice!=null){
			sql+="and memoryprice>? ";
			list.add(minprice);
		}if(maxprice!=null){
			sql+="and memoryprice<=? ";
			list.add(maxprice);
		}if(minfrequency!=null){
			sql+="and ?<SUBSTRING_INDEX(frequency,'G',1) ";
			list.add(minfrequency);
		}if(maxfrequency!=null){
			sql+="and ?>=SUBSTRING_INDEX(frequency,'G',1) ";
			list.add(maxfrequency);
		}if(memorytype!=null){
			sql+="and ?=SUBSTRING(memorytype, 4) ";
			list.add(memorytype);
		}if(volume!=null){
			sql+="and ?=SUBSTRING_INDEX(volume,'G',1) ";
			list.add(volume);
		}if(name!=null&&!"请输入名称".equals(name)){
			sql+="and name=? ";
			list.add(name);
		}
		sql +="order by usetimes desc limit ? , ? ";
		list.add((page-1)*rows);
		list.add(rows);
		return dbHelper.finds(sql, Memory.class, list);
	}

	@Override
	public List<Disk> findDiskByPage(String name, Double minprice, Double maxprice, Integer minvolume,
			Integer maxvolume, Integer isssd,int page,int rows) {
		DBHelper dbHelper = new DBHelper();
		List <Object > list = new ArrayList<Object>(); 
		String sql="select * from disk where 1=1  ";
		if(minprice!=null){
			sql+="and diskprice>? ";
			list.add(minprice);
		}if(maxprice!=null){
			sql+="and diskprice<=? ";
			list.add(maxprice);
		}if(minvolume!=null){
			sql+="and ?<SUBSTRING_INDEX(volume,'G',1) ";
			list.add(minvolume);
		}if(maxvolume!=null){
			sql+="and ?>=SUBSTRING_INDEX(volume,'G',1) ";
			list.add(maxvolume);
		}if(isssd!=null){
			sql+="and isssd=? ";
			list.add(isssd);
		}if(name!=null&&!"请输入名称".equals(name)){
			sql+="and name=? ";
			list.add(name);
		}
		sql +="order by usetimes desc limit ? , ? ";
		list.add((page-1)*rows);
		list.add(rows);
		System.out.println("name:"+name+"   mp"+minprice+"  maxp"+maxprice+"    minvo"+minvolume+ "   maxvo"+maxvolume+"    issd"+isssd+"  "+page+"rows"+rows);
		System.out.println(sql);
		return dbHelper.finds(sql, Disk.class, list);
	}

	@Override
	public List<Graphics> findGraphicsByPage(String name, Double minprice, Double maxprice, Integer minmemory,
			Integer maxmemory, Integer minwidth, Integer maxwidth,int page,int rows) {
		DBHelper dbHelper = new DBHelper();
		List <Object > list = new ArrayList<Object>(); 
		String sql="select * from graphics where 1=1  ";
		if(minprice!=null){
			sql+="and graphicsprice>? ";
			list.add(minprice);
		}if(maxprice!=null){
			sql+="and graphicsprice<=? ";
			list.add(maxprice);
		}if(name!=null&&!"请输入名称".equals(name)){
			sql+="and name=? ";
			list.add(name);
		}if(minmemory!=null){
			sql+="and ?<=SUBSTRING_INDEX(memory,'G',1) ";
			list.add(minmemory);
		}if(maxmemory!=null){
			sql+="and ?>=SUBSTRING_INDEX(memory,'G',1) ";
			list.add(maxmemory);
		}if(minwidth!=null){
			sql+="and ?<=SUBSTRING_INDEX(width,'b',1) ";
			list.add(minwidth);
		}if(maxwidth!=null){
			sql+="and ?>=SUBSTRING_INDEX(width,'b',1) ";
			list.add(maxwidth);
		}
		sql +="order by usetimes desc limit ? , ? ";
		list.add((page-1)*rows);
		list.add(rows);
		return dbHelper.finds(sql, Graphics.class, list);
	}

	@Override
	public List<Box> findBoxByPage(String name, Double minprice, Double maxprice,int page,int rows) {
		DBHelper dbHelper = new DBHelper();
		List <Object > list = new ArrayList<Object>(); 
		String sql="select * from box where 1=1  ";
		if(minprice!=null){
			sql+="and boxprice>? ";
			list.add(minprice);
		}if(maxprice!=null){
			sql+="and boxprice<=? ";
			list.add(maxprice);
		}if(name!=null&&!"请输入名称".equals(name)){
			sql+="and name=? ";
			list.add(name);
		}
		sql +="order by usetimes desc limit ? , ? ";
		list.add((page-1)*rows);
		list.add(rows);
		return dbHelper.finds(sql, Box.class, list);
	}

	@Override
	public List<Source> findSourceByPage(String name, Double minprice, Double maxprice, Integer minpowers,
			Integer maxpowers, int page, int rows) {
		DBHelper dbHelper = new DBHelper();
		List <Object > list = new ArrayList<Object>(); 
		String sql="select * from source where 1=1  ";
		if(minprice!=null){
			sql+="and sourceprice>? ";
			list.add(minprice);
		}if(maxprice!=null){
			sql+="and sourceprice<=? ";
			list.add(maxprice);
		}if(name!=null&&!"请输入名称".equals(name)){
			sql+="and name=? ";
			list.add(name);
		}if(minpowers!=null){
			sql+="and SUBSTRING_INDEX(maxpowers,'W',1)>? ";
			list.add(minpowers);
		}if(maxpowers!=null){
			sql+="and SUBSTRING_INDEX(maxpowers,'W',1)<=? ";
			list.add(maxpowers);
		}
		sql +="order by usetimes desc limit ? , ? ";
		list.add((page-1)*rows);
		list.add(rows);
		System.out.println(minpowers+"sss"+maxpowers);
		System.out.println(sql);
		return dbHelper.finds(sql, Source.class, list);
	}

	@Override
	public int getTotalCpuByPage(String name, Double minprice, Double maxprice, Double minfrequency,
			Double maxfrequency, Integer cores, int page, int rows) {
		DBHelper dbHelper = new DBHelper();
		List <Object > list = new ArrayList<Object>(); 
		String sql="select count(*) from cpu where 1=1 ";
		if(minprice!=null){
			sql+="and cpuprice>? ";
			list.add(minprice);
		} if(maxprice!=null){
			sql+="and cpuprice<=? ";
			list.add(maxprice);
		} if(minfrequency!=null){
			sql+="and ?<SUBSTRING_INDEX(frequency,'G',1) ";
			list.add(minfrequency);
		}if(maxfrequency!=null){
			sql+="and ?>=SUBSTRING_INDEX(frequency,'G',1) ";
			list.add(maxfrequency);
		} if(cores!=null){
			sql+="and cores = ? ";
			list.add(cores);
		} if(name!=null&&!"请输入名称".equals(name)){
			sql+="and name=? ";
			list.add(name);
		}
		
		
		return dbHelper.getTotal(sql, list);
	}

	@Override
	public int getTotalMotherboardByPage(String name, Double minprice, Double maxprice, Integer minmaxmemory,
			Integer maxmaxmemory, int page, int rows) {
		DBHelper dbHelper = new DBHelper();
		List <Object > list = new ArrayList<Object>(); 
		String sql="select count(*) from motherboard where 1=1  ";
		if(minprice!=null){
			sql+="and motherboardprice>? ";
			list.add(minprice);
		}if(maxprice!=null){
			sql+="and motherboardprice<=? ";
			list.add(maxprice);
		}if(minmaxmemory!=null){
			sql+="and ?<SUBSTRING_INDEX(maxmemory,'G',1) ";
			list.add(minmaxmemory);
		}if(maxmaxmemory!=null){
			sql+="and ?>=SUBSTRING_INDEX(maxmemory,'G',1) ";
			list.add(maxmaxmemory);
		}if(name!=null&&!"请输入名称".equals(name)){
			sql+="and name=? ";
			list.add(name);
		}
		return dbHelper.getTotal(sql, list);
	}

	@Override
	public int getTotalMemoryByPage(String name, Double minprice, Double maxprice, Integer minfrequency,
			Integer maxfrequency, Integer memorytype, Integer volume, int page, int rows) {
		DBHelper dbHelper = new DBHelper();
		List <Object > list = new ArrayList<Object>(); 
		String sql="select count(*) from memory where 1=1  ";
		if(minprice!=null){
			sql+="and memoryprice>? ";
			list.add(minprice);
		}if(maxprice!=null){
			sql+="and memoryprice<=? ";
			list.add(maxprice);
		}if(minfrequency!=null){
			sql+="and ?<SUBSTRING_INDEX(frequency,'G',1) ";
			list.add(minfrequency);
		}if(maxfrequency!=null){
			sql+="and ?>=SUBSTRING_INDEX(frequency,'G',1) ";
			list.add(maxfrequency);
		}if(memorytype!=null){
			sql+="and ?=SUBSTRING(memorytype, 4) ";
			list.add(memorytype);
		}if(volume!=null){
			sql+="and ?=SUBSTRING_INDEX(volume,'G',1) ";
			list.add(volume);
		}if(name!=null&&!"请输入名称".equals(name)){
			sql+="and name=? ";
			list.add(name);
		}
		return dbHelper.getTotal(sql, list);
	}

	@Override
	public int getTotalDiskByPage(String name, Double minprice, Double maxprice, Integer minvolume, Integer maxvolume,
			Integer isssd, int page, int rows) {
		DBHelper dbHelper = new DBHelper();
		List <Object > list = new ArrayList<Object>(); 
		String sql="select count(*) from disk where 1=1  ";
		if(minprice!=null){
			sql+="and diskprice>? ";
			list.add(minprice);
		}if(maxprice!=null){
			sql+="and diskprice<=? ";
			list.add(maxprice);
		}if(minvolume!=null){
			sql+="and ?<SUBSTRING_INDEX(volume,'G',1) ";
			list.add(minvolume);
		}if(maxvolume!=null){
			sql+="and ?>=SUBSTRING_INDEX(volume,'G',1) ";
			list.add(maxvolume);
		}if(isssd!=null){
			sql+="and isssd=? ";
			list.add(isssd);
		}if(name!=null&&!"请输入名称".equals(name)){
			sql+="and name=? ";
			list.add(name);
		}
		return dbHelper.getTotal(sql, list);
	}

	@Override
	public int getTotalGraphicsByPage(String name, Double minprice, Double maxprice, Integer minmemory,
			Integer maxmemory, Integer minwidth, Integer maxwidth, int page, int rows) {
		DBHelper dbHelper = new DBHelper();
		List <Object > list = new ArrayList<Object>(); 
		String sql="select count(*) from graphics where 1=1  ";
		if(minprice!=null){
			sql+="and graphicsprice>? ";
			list.add(minprice);
		}if(maxprice!=null){
			sql+="and graphicsprice<=? ";
			list.add(maxprice);
		}if(name!=null&&!"请输入名称".equals(name)){
			sql+="and name=? ";
			list.add(name);
		}if(minmemory!=null){
			sql+="and ?<=SUBSTRING_INDEX(memory,'G',1) ";
			list.add(minmemory);
		}if(maxmemory!=null){
			sql+="and ?>=SUBSTRING_INDEX(memory,'G',1) ";
			list.add(maxmemory);
		}if(minwidth!=null){
			sql+="and ?<=SUBSTRING_INDEX(width,'b',1) ";
			list.add(minwidth);
		}if(maxwidth!=null){
			sql+="and ?>=SUBSTRING_INDEX(width,'b',1) ";
			list.add(maxwidth);
		}
		return dbHelper.getTotal(sql, list);
	}

	@Override
	public int getTotalSourceByPage(String name, Double minprice, Double maxprice, Integer minpowers, Integer maxpowers,
			int page, int rows) {
		DBHelper dbHelper = new DBHelper();
		List <Object > list = new ArrayList<Object>(); 
		String sql="select count(*) from source where 1=1  ";
		if(minprice!=null){
			sql+="and sourceprice>? ";
			list.add(minprice);
		}if(maxprice!=null){
			sql+="and sourceprice<=? ";
			list.add(maxprice);
		}if(name!=null&&!"请输入名称".equals(name)){
			sql+="and name=? ";
			list.add(name);
		}if(minpowers!=null){
			sql+="and SUBSTRING_INDEX(maxpowers,'W',1)>? ";
			list.add(minpowers);
		}if(maxpowers!=null){
			sql+="and SUBSTRING_INDEX(maxpowers,'W',1)<=? ";
			list.add(maxpowers);
		}
		
		return dbHelper.getTotal(sql, list);
	}

	@Override
	public int getTotalBoxByPage(String name, Double minprice, Double maxprice, int page, int rows) {
		DBHelper dbHelper = new DBHelper();
		List <Object > list = new ArrayList<Object>(); 
		String sql="select count(*) from box where 1=1  ";
		if(minprice!=null){
			sql+="and boxprice>? ";
			list.add(minprice);
		}if(maxprice!=null){
			sql+="and boxprice<=? ";
			list.add(maxprice);
		}if(name!=null&&!"请输入名称".equals(name)){
			sql+="and name=? ";
			list.add(name);
		}
		
		return dbHelper.getTotal(sql, list);
	}

	@Override
	public int updateQuantiy(Integer id,  String formName,String idName) {
		DBHelper dbHelper = new DBHelper();
		String sql = "update "+formName+" set quantiy=quantiy-1 where "+idName+" = ? ";
		return dbHelper.update(sql, id);
	}

}
