package biz;

import java.util.List;
import java.util.Map;

import entity.Box;
import entity.Cpu;
import entity.Disk;
import entity.Graphics;
import entity.Memory;
import entity.MotherBoard;
import entity.Source;

public interface IHardwareBiz {
	
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
	 * 通过表名和id来删除硬件
	 * @param id
	 * @param formName  表名
	 * @param idName  id名
	 * @return
	 */
	public int delHardWare(Integer id, String idName, String formName);
	
	/**
	 * 添加CPU
	 * @param map
	 * @return
	 */
	public int addCPU(Map<String, String> map);
	
	public Cpu findCPU(Integer cpuid);
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
	
	//public Map<String, Object> findHardWareById(Integer cpuid,Integer motherboardid,Integer memoryid,Integer diskid,Integer sourceid,Integer graphicsid,Integer boxid) ;
    public Map<String, Object> findHardWareById(Integer id) ;
    
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
	public Map<String, Object> findByPage(int page, int rows, String id, String formName, String priceName, Class<?> c);


}
