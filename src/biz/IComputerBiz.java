package biz;

import java.util.List;
import java.util.Map;

import entity.Computer;

public interface IComputerBiz {
	 public int add(Map<String, String> map);
	 public List<Computer> findAll(String type);
}
