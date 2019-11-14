package dao;


import java.util.List;
import java.util.Map;

import entity.Computer;

public interface IComputerDao {
     public int add(Map<String, String> map);
     public List<Computer> findAll(String type);
}
