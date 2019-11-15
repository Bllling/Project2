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
}
