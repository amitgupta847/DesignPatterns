package creationalP.Singleton;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable {
	public static volatile DateUtil instance;

	private DateUtil() {
	}

	public static DateUtil getInstance() {
		if (instance == null) {
			synchronized (DateUtil.class) {
				if (instance == null) { // double check is necessary
					instance = new DateUtil();
				}
			}
		}

		return instance;
	}

	protected Object readResolve() {
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//return super.clone();
		throw new CloneNotSupportedException();
	}

}

//public static synchronized DateUtil getInstance() {
//	if (instance == null)
//		instance = new DateUtil();
//
//	return instance;
//}