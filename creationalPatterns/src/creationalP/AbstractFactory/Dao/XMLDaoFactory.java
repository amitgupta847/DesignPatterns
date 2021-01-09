package creationalP.AbstractFactory.Dao;

public class XMLDaoFactory extends DaoAbstractFactory {

	@Override
	public Dao createDao(String type) {

		if (type.equals("emp"))
			return new XMLEmpDao();
		else if (type.equals("dept"))
			return new XMLDeptDao();

		return null;
	}

}
