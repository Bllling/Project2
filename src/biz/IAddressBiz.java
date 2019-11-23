package biz;

public interface IAddressBiz {
	public int addAddress(String province, String city, String county, String raddress, Integer isdefault, Integer uid, String addrname, String addtel, String postcode);
	public int updateAddress(String province, String city, String county, String raddress, Integer isdefault, Integer arid, String addrname, String addtel, String postcode);
}
