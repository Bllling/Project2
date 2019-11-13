package dao;

import java.util.Map;

public interface IHardwareDao {
	/**
	 * 添加CPU
	 * @param map
	 * @return
	 */
	public int addCPU(Map<String, String> map);
	
	/**
	 * 添加主板
	 * @param map
	 * @return
	 */
	public int addMotherboard(Map<String, String> map);
	
	/**
	 * 添加内存
	 * @param map
	 * @return
	 */
	public int addMemory(Map<String, String> map);
	
	/**
	 * 添加硬盘
	 * @param map
	 * @return
	 */
	public int addDisk(Map<String, String> map);
	
	/**
	 * 添加电源
	 * @param map
	 * @return
	 */
	public int addSource(Map<String, String> map);
	
	/**
	 * 添加显卡
	 * @param map
	 * @return
	 */
	public int addGraphics(Map<String, String> map);
	
	/**
	 * 添加机箱
	 * @param map
	 * @return
	 */
	public int addBox(Map<String, String> map);
}
