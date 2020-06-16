package com.example.spring.application.basics.springbasics.three;
  
import javax.inject.Inject;
import javax.inject.Named;

import com.example.spring.application.basics.springbasics.three.CDITestDao;
  
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
	  
	public Integer calldb() { 
		return cdiTestDao.accessDB(); 
	} 
}
 