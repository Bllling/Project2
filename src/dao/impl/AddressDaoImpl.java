package dao.impl;

import dao.DBHelper;
import dao.IAddressDao;

public class AddressDaoImpl implements IAddressDao{
	/**
	 * 新增地址信息
	 */
	@Override
	public int addAddress(String province, String city, String county, String raddress, Integer isdefault, Integer uid,
			String addrname, String addtel, String postcode) {
		DBHelper dbHelper = new DBHelper();
		String sql = "insert into address values(0, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		return dbHelper.update(sql, province, city, county, raddress, isdefault, uid, addrname, addtel, postcode);
	}

	/**
	 * 修改地址信息
	 */
	@Override
	public int updateAddress(String province, String city, String county, String raddress, Integer isdefault,
			Integer arid, String addrname, String addtel, String postcode) {
		DBHelper dbHelper = new DBHelper();
		String sql = "update address set province = ?, city = ?, county = ?, raddress = ?, isdefault = ?, addrname = ?, addrtel = ?, postcode = ? where arid = ?";
		return dbHelper.update(sql, province, city, county, raddress, isdefault, addrname, addtel, postcode, arid);
	}

}
