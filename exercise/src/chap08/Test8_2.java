package chap08;

public class Test8_2 {

	public static void main(String[] args) {
		
		//3
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
		
	}
	
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

}
