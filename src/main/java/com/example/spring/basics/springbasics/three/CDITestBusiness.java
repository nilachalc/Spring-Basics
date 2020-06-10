package com.example.spring.basics.springbasics.three;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CDITestBusiness {
	@Inject
	private CDITestDao cdiTestDao;

	public CDITestDao getCdiTestDao() {
		return cdiTestDao;
	}

	public void setCdiTestDao(CDITestDao cdiTestDao) {
		this.cdiTestDao = cdiTestDao;
	}
}
