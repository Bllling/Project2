package biz.impl;

import java.util.List;

import biz.IAddressBiz;
import dao.IAddressDao;
import dao.impl.AddressDaoImpl;
import entity.Address;
import util.StringUtil;

public class AddressBizImpl implements IAddressBiz {

	@Override
	public int addAddress(String province, String city, String county, String raddress, Integer isdefault, Integer uid,
			String addrname, String addtel, String postcode) {
		if (isdefault == null || uid == null) {
			return 0;
		}
		if (StringUtil.CheckNull(province, city, county, raddress, addrname, addtel, postcode)) {
			return 0;
		}
		IAddressDao addressDao = new AddressDaoImpl();
		return addressDao.addAddress(province, city, county, raddress, isdefault, uid, addrname, addtel, postcode);
	}

	@Override
	public int updateAddress(String province, String city, String county, String raddress, Integer isdefault,
			Integer arid, String addrname, String addtel, String postcode) {
		if (isdefault == null || arid == null) {
			return 0;
		}
		if (StringUtil.CheckNull(province, city, county, raddress, addrname, addtel, postcode)) {
			return 0;
		}
		IAddressDao addressDao = new AddressDaoImpl();
		return addressDao.updateAddress(province, city, county, raddress, isdefault, arid, addrname, addtel, postcode);
	}

	@Override
	public List<Address> findAllByUid(Integer uid) {
		if(uid==null){
			return null;
		}
		IAddressDao addressDao = new AddressDaoImpl();
		return addressDao.findAllByUid(uid);
	}

}
