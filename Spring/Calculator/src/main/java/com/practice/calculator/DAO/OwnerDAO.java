package com.practice.calculator.DAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practice.calculator.VO.AccountOwner;

@Repository
public class OwnerDAO {

	@Autowired
	SqlSession sqlSession;

	public int insertOwner(AccountOwner owner) {

		int result = 0;
		OwnerMapper mapper = sqlSession.getMapper(OwnerMapper.class);

		try {
			result = mapper.insertOwner(owner);

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		return result;

	}

	public AccountOwner selectOwner(AccountOwner owner) {

		AccountOwner result = null;
		OwnerMapper mapper = sqlSession.getMapper(OwnerMapper.class);

		try {
			result = mapper.selectOwner(owner);

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return result;

	}

}
