package dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.sun.org.apache.regexp.internal.recompile;

import dao.DBHelper;
import dao.IComputerDao;
import dao.IUsrDao;
import entity.Collection;
import entity.Computer;
import entity.Usr;
import util.StringUtil;

public class ComputerDaoImpl implements IComputerDao {

	@Override
	public int add(Map<String, String> map) {
		return 1;
	}

	@Override
	public List<Computer> findAll(String type) {
	   DBHelper db = new DBHelper();
	   String sql = "select cname,detail,sumprice,id,u.uname,cp.name,cp.pics,me.name as name1,me.pics as pics1,m.name as name2,m.pics as pics2,d.name as name3,d.pics as pics3,s.name as name4,s.pics as pics4,g.name as name5,g.pics as pics5,b.name as name6,b.pics as pics6, id ,c.uid,date_format(rtime,'%Y-%m-%d %H:%i:%s') rtime,znumber,bnumber from  computer c,cpu cp ,memory m,motherboard me ,disk d,source s,graphics g,box b,usr u where c.cpuid = cp.cpuid and c.memoryid=m.memoryid and me.motherboardid=c.motherboardid and d.diskid=c.diskid and s.sourceid=c.sourceid and g.graphicsid=c.graphicsid and b.boxid=c.boxid and u.uid = c.uid order by ";
	   sql += type+" DESC;";
	   return db.finds(sql, Computer.class); 
	}

	@Override
	public Computer findById(Integer id) {
		DBHelper db = new DBHelper();
	    String sql = "select cname,detail,sumprice,id,u.uname,cp.name,cp.pics,me.name as name1,me.pics as pics1,m.name as name2,m.pics as pics2,d.name as name3,d.pics as pics3,s.name as name4,s.pics as pics4,g.name as name5,g.pics as pics5,b.name as name6,b.pics as pics6, id ,c.uid,date_format(rtime,'%Y-%m-%d %H:%i:%s') rtime,znumber,bnumber from  computer c,cpu cp ,memory m,motherboard me ,disk d,source s,graphics g,box b,usr u where c.cpuid = cp.cpuid and c.memoryid=m.memoryid and me.motherboardid=c.motherboardid and d.diskid=c.diskid and s.sourceid=c.sourceid and g.graphicsid=c.graphicsid and b.boxid=c.boxid and u.uid = c.uid and id=? ";
		return db.find(sql, Computer.class, id);
	}

	@Override
	public Computer findHardWardIdById(Integer id) {
		DBHelper db = new DBHelper();
		String sql="select cpuid,motherboardid, memoryid,diskid,sourceid,graphicsid,boxid from computer where id = ?";
		return db.find(sql, Computer.class, id);
	}

	@Override
	public List<Computer> findPart(String type, String sumpriceMin,String sumpriceMax, String rtime,int page,int rows) {
		List <Object > list = new ArrayList<Object>(); 
		DBHelper db = new DBHelper();
		String sql = "select cname,detail,sumprice,id,u.uname,cp.name,cp.pics,me.name as name1,me.pics as pics1,m.name as name2,m.pics as pics2,d.name as name3,d.pics as pics3,s.name as name4,s.pics as pics4,g.name as name5,g.pics as pics5,b.name as name6,b.pics as pics6, id ,c.uid,date_format(rtime,'%Y-%m-%d %H:%i:%s') rtime,znumber,bnumber from  computer c,cpu cp ,memory m,motherboard me ,disk d,source s,graphics g,box b,usr u where c.cpuid = cp.cpuid and c.memoryid=m.memoryid and me.motherboardid=c.motherboardid and d.diskid=c.diskid and s.sourceid=c.sourceid and g.graphicsid=c.graphicsid and b.boxid=c.boxid and u.uid = c.uid ";
		
		if(!StringUtil.CheckNull(sumpriceMin)&&!"null".equals(sumpriceMin)){
			sql +="and sumprice>=? ";
			list.add(sumpriceMin);
		}
		if(!StringUtil.CheckNull(sumpriceMin)&&!"null".equals(sumpriceMax)){
			sql +="and sumprice<? "; 
			list.add(sumpriceMax);
		}
        if(!StringUtil.CheckNull(sumpriceMin)&&!"null".equals(rtime)){
        	sql +="and YEAR(rtime)=? ";
        	list.add(rtime);
        }
        
		sql += "order by "+type+" DESC ";
		sql +="limit ? , ?;";
		list.add((page-1)*rows);
		list.add(rows);
		return db.finds(sql, Computer.class, list);
	}

	@Override
	public int getTotalPart(String sumpriceMin, String sumpriceMax, String rtime) {
		DBHelper db = new DBHelper();
		String sql = "select count(*) from computer where 1=1 ";
		List <Object > list = new ArrayList<Object>(); 
		if(!StringUtil.CheckNull(sumpriceMin)&&!"null".equals(sumpriceMin)){
			sql +="and sumprice>=? ";
			list.add(sumpriceMin);
		}
		if(!StringUtil.CheckNull(sumpriceMin)&&!"null".equals(sumpriceMax)){
			sql +="and sumprice<? "; 
			list.add(sumpriceMax);
		}
        if(!StringUtil.CheckNull(sumpriceMin)&&!"null".equals(rtime)){
        	sql +="and YEAR(rtime)=? ";
        	list.add(rtime);
        }
		return db.getTotal(sql, list);
	}

	@Override
	public List<Computer> findByUid(Integer uid) {
		DBHelper db = new DBHelper();
	    String sql = "select cname,detail,sumprice,id,u.uname,cp.name,cp.pics,me.name as name1,me.pics as pics1,m.name as name2,m.pics as pics2,d.name as name3,d.pics as pics3,s.name as name4,s.pics as pics4,g.name as name5,g.pics as pics5,b.name as name6,b.pics as pics6, id ,c.uid,date_format(rtime,'%Y-%m-%d %H:%i:%s') rtime,znumber,bnumber from  computer c,cpu cp ,memory m,motherboard me ,disk d,source s,graphics g,box b,usr u where c.cpuid = cp.cpuid and c.memoryid=m.memoryid and me.motherboardid=c.motherboardid and d.diskid=c.diskid and s.sourceid=c.sourceid and g.graphicsid=c.graphicsid and b.boxid=c.boxid and u.uid = c.uid and c.uid = ? order by rtime desc ";
		return db.finds(sql, Computer.class, uid);
	}

	@Override
	public List<Computer> findAllByMoreId(List<Collection> list) {
		DBHelper db = new DBHelper();
		List <Object> list1 = new ArrayList<>();
	    String sql = "select cname,detail,sumprice,id,u.uid,u.uname,cp.name,cp.pics,me.name as name1,me.pics as pics1,m.name as name2,m.pics as pics2,d.name as name3,d.pics as pics3,s.name as name4,s.pics as pics4,g.name as name5,g.pics as pics5,b.name as name6,b.pics as pics6, id ,c.uid,date_format(rtime,'%Y-%m-%d %H:%i:%s') rtime,znumber,bnumber from  computer c,cpu cp ,memory m,motherboard me ,disk d,source s,graphics g,box b,usr u where c.cpuid = cp.cpuid and c.memoryid=m.memoryid and me.motherboardid=c.motherboardid and d.diskid=c.diskid and s.sourceid=c.sourceid and g.graphicsid=c.graphicsid and b.boxid=c.boxid and u.uid = c.uid and";
        for (Collection c:list){
        	sql+=" id = ? or";
        	list1.add(c.getId());
        }
        sql+=" 1=0";
	   return db.finds(sql, Computer.class, list1);
	}

	@Override
	public int updateBnumber(Integer id) {
		DBHelper db = new DBHelper();
		String sql="update computer set bnumber=bnumber+1 where id = ?";
		return db.update(sql, id);
	}

	@Override
	public Computer findDetailByID(Integer id) {
		DBHelper dbHelper = new DBHelper();
		String sql = "select detail from computer where id = ?";
		return dbHelper.find(sql, Computer.class, id);
	}

	@Override
	public int getTotalByUid(Integer uid) {
		DBHelper dbHelper = new DBHelper();
		String sql="select count(uid) from computer where uid = ?";
		return dbHelper.getTotal(sql, uid);
	}

	@Override
	public int getBnumebrByUid(Integer uid) {
		DBHelper dbHelper = new DBHelper();
		String sql="select sum(bnumber) from computer where uid =?";
		return dbHelper.getTotal(sql, uid);
	}

	@Override
	public int getZnumebrByUid(Integer uid) {
		DBHelper dbHelper = new DBHelper();
		String sql="select sum(znumber) from computer where uid =?";
		return dbHelper.getTotal(sql, uid);
	}

	

	

}
