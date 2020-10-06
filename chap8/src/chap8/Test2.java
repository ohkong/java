package chap8;
interface DataAccessObject{
	void select();
	void insert();
	void update();
	void delete();
}

class OracleDao implements DataAccessObject{
	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");
	}
	@Override
	public void insert() {
		System.out.println("Oracle DB에 삽입");
	}
	@Override
	public void update() {
		System.out.println("Oracle DB에 수정");
	}
	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
	}
}
class MySqlDao implements DataAccessObject{
	@Override
	public void select() {
		System.out.println("Mysql DB에서 검색");
	}
	@Override
	public void insert() {
		System.out.println("Mysql DB에 삽입");
	}
	@Override
	public void update() {
		System.out.println("Mysql DB에 수정");
	}
	@Override
	public void delete() {
		System.out.println("Mysql DB에서 삭제");
	}
}
public class Test2 {
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
	private static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
}
