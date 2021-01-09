package creationalP.AbstractFactory;

import creationalP.AbstractFactory.Dao.Dao;
import creationalP.AbstractFactory.Dao.DaoAbstractFactory;
import creationalP.AbstractFactory.Dao.DaoProducer;

public class aTester {

	public static void main(String[] args) {

		DaoAbstractFactory daf = DaoProducer.produce("xml");
		Dao dao = daf.createDao("emp");
		dao.save();

		daf = DaoProducer.produce("db");
		dao = daf.createDao("emp");
		dao.save();

		
		System.out.println("Abstract Factory: Dao creation test");
	}
}
