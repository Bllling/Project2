package biz;

import java.util.List;
import java.util.Map;

import entity.Collection;
import entity.Computer;

public interface IComputerBiz {
	public int add(Integer uid,String cname,String detail,Integer cpuid,Integer motherboardid,Integer memoryid,Integer diskid,Integer sourceid,Integer graphicsid,Integer boxid,Double sumprice );
	 public List<Computer> findAll(String type);
	 public Computer findById(Integer id);
	 public  Computer findHardWardIdById(Integer id);
     public List<Computer> findPart(String type,String sumpriceMin,String sumpriceMax,String rtime,int page,int rows);
     public int getTotalPart(String sumpriceMin,String sumpriceMax,String rtime);
     public List<Computer> findByUid(Integer uid);
     public  List<Computer> findAllByMoreId(List<Collection> list);
     public int updateBnumber(Integer id);
     /**
      * 通过配置单ID查配置描述
      * @param id
      * @return
      */
     public Computer findDetailByID(Integer id);
     public int getTotalByUid(Integer uid);
 
     public int getBnumebrByUid(Integer uid);
     public Computer findID(String cname,Integer id);
      public int getZnumebrByUid(Integer uid);
}
