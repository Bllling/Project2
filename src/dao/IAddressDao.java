package dao;

import java.util.List;

import entity.Address;

public interface IAddressDao {
	public int addAddress(String province, String city, String county, String raddress, Integer isdefault, Integer uid, String addrname, String addtel, String postcode);
	public int updateAddress(String province, String city, String county, String raddress, Integer isdefault, Integer arid, String addrname, String addtel, String postcode);
    public List<Address> findAllByUid(Integer uid);
    public int updateAddrState(Integer state, Integer uid, String idName);
}
