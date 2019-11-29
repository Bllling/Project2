package dao;

public class Test {
public static void main(String[] args) {
	DBHelper dbHelper = new DBHelper();
	String sql="select sum(bnumber) from computer where uid =?";
	System.out.println(dbHelper.getTotal(sql, 1));
}
}
