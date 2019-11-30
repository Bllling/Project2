package dao;

import java.util.List;
import java.util.Map;

import entity.Box;
import entity.Cpu;
import entity.Disk;
import entity.Graphics;
import entity.Memory;
import entity.MotherBoard;
import entity.Source;

public interface IHardwareDao {
	/**
	 * 添加CPU
	 * @param map
	 * @return
	 */
	public int addCPU(Map<String, String> map);
	
	public Cpu findCPU(Integer cpuid);
	
	/**
	 * 查询所有硬件 通过点赞数或使用次数排序
	 * @param priceName 价格名称
	 * @param formName  表名
	 * @param type      排序类型
	 * @param c         类名
	 * @return
	 */
	public <T> List<T> findHardWares(String priceName, String formName, String type, Class<?> c);
	
	/**
	 * 添加主板
	 * @param map
	 * @return
	 */
	public int addMotherboard(Map<String, String> map);
	
	public MotherBoard findMotherboard(Integer motherboardid);
	
	/**
	 * 添加内存
	 * @param map
	 * @return
	 */
	public int addMemory(Map<String, String> map);
	
	public Memory findMemory(Integer memoryid);
	/**
	 * 添加硬盘
	 * @param map
	 * @return
	 */
	public int addDisk(Map<String, String> map);
	
	public Disk findDisk(Integer diskid);
	/**
	 * 添加电源
	 * @param map
	 * @return
	 */
	public int addSource(Map<String, String> map);
	
	public Source findSource(Integer sourceid);
	/**
	 * 添加显卡
	 * @param map
	 * @return
	 */
	public int addGraphics(Map<String, String> map);
	
	public Graphics findGraphics(Integer graphicsid);
	/**
	 * 添加机箱
	 * @param map
	 * @return
	 */
	public int addBox(Map<String, String> map);
	
	public Box findBox(Integer boxid);
	
	/**
	 * 通过表名和id来删除硬件
	 * @param id
	 * @param formName  表名
	 * @param idName  id名
	 * @return
	 */
	public int delHardWare(Integer id, String idName, String formName);
	
	/**
	 * 分页查询各硬件
	 * @param page
	 * @param rows
	 * @param id  硬件id名
	 * @param formName  硬件表名
	 * @param priceName	硬件价格名称  
	 * @param c  实体类名
	 * @return
	 */
	public <T>List<T> findByPage(int page, int rows, String id, String formName, String priceName, Class<?> c);
	
	/**
	 * 查询总记录数
	 * @param id  id名
	 * @param formName  表名
	 * @return
	 */
	public int getTotal(String id, String formName);
	
	/**
	 * 修改硬件的属性 
	 * @param id         硬件ID
	 * @param formName   表名字
	 * @param op		  修改的硬件属性
	 * @param value      修改的属性值
	 * @return
	 */
	public int updateHardware(Integer id, String idName, String formName, String op, String value);
	
	public List<Cpu> findCpuByPage(String name,Double minprice,Double maxprice,Double minfrequency,Double maxfrequency,Integer cores,int page,int rows);
	public List<MotherBoard> findMotherboardByPage(String name,Double minprice,Double maxprice,Integer minmaxmemory,Integer maxmaxmemory,int page,int rows);
	public List<Memory> findMemoryByPage(String name,Double minprice,Double maxprice,Integer minfrequency,Integer maxfrequency,Integer memorytype,Integer volume,int page,int rows);
	public List<Disk> findDiskByPage(String name,Double minprice,Double maxprice,Integer minvolume,Integer maxvolume,Integer isssd,int page,int rows);
	public List<Graphics> findGraphicsByPage(String name,Double minprice,Double maxprice,Integer minmemory,Integer maxmemory,Integer minwidth,Integer maxwidth,int page,int rows);
	public List<Source> findSourceByPage(String name,Double minprice,Double maxprice,Integer minpowers,Integer maxpowers,int page,int rows);
	public List<Box> findBoxByPage(String name,Double minprice,Double maxprice,int page,int rows);
	
	public int getTotalCpuByPage(String name,Double minprice,Double maxprice,Double minfrequency,Double maxfrequency,Integer cores,int page,int rows);
	public int getTotalMotherboardByPage(String name,Double minprice,Double maxprice,Integer minmaxmemory,Integer maxmaxmemory,int page,int rows);
	public int getTotalMemoryByPage(String name,Double minprice,Double maxprice,Integer minfrequency,Integer maxfrequency,Integer memorytype,Integer volume,int page,int rows);
	public int getTotalDiskByPage(String name,Double minprice,Double maxprice,Integer minvolume,Integer maxvolume,Integer isssd,int page,int rows);
	public int getTotalGraphicsByPage(String name,Double minprice,Double maxprice,Integer minmemory,Integer maxmemory,Integer minwidth,Integer maxwidth,int page,int rows);
	public int getTotalSourceByPage(String name,Double minprice,Double maxprice,Integer minpowers,Integer maxpowers,int page,int rows);
	public int getTotalBoxByPage(String name,Double minprice,Double maxprice,int page,int rows);
	
	public int updateQuantiy(Integer id,  String formName,String idName);
	
}
