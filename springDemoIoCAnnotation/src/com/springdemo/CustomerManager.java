package com.springdemo;

public class CustomerManager implements ICustomerService{
	
	private ICustomerDal icustomerDal;
	
	/* set injection yerine cunstroction injection kullan�l�r
public void setIcustomerDal(ICustomerDal icustomerDal) {
		this.icustomerDal = icustomerDal;
	}
*/


	//cunstructor injection
	public CustomerManager(ICustomerDal icustomerDal) {		 
	this.icustomerDal = icustomerDal;
	}



	public void add() {  		
		//i� kurallar� �al���r kontroller ger�ekle�irse CustomerDal �a�r�l�r				
		icustomerDal.add();		
	}

}
