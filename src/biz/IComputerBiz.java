package biz;

import java.util.List;
import java.util.Map;

import entity.Computer;

public interface IComputerBiz {
	 public int add(Map<String, String> map);
	 public List<Computer> findAll(String type);
	 public Computer findById(Integer id);
	 public  Computer findHardWardIdById(Integer id);
     public List<Computer> findPart(String type,String sumpriceMin,String sumpriceMax,String rtime,int page,int rows);
     public int getTotalPart(String sumpriceMin,String sumpriceMax,String rtime);
     public List<Computer> findByUid(Integer uid);
}
