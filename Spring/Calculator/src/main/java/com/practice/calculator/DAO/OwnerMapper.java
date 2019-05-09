package com.practice.calculator.DAO;

import com.practice.calculator.VO.AccountOwner;

public interface OwnerMapper {

	public int insertOwner(AccountOwner owner);
	
	public AccountOwner selectOwner(AccountOwner owner);
}
