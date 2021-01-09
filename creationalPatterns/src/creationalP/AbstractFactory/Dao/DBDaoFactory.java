package creationalP.AbstractFactory.Dao;

public class DBDaoFactory extends DaoAbstractFactory {

	@Override
	public Dao createDao(String type) {

		if (type.equals("emp"))
			return new DBEmpDao();
		else if (type.equals("dept"))
			return new DBDeptDao();

		return null;
	}

}
