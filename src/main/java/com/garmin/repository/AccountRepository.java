package com.garmin.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import com.garmin.entity.Account;

/**
 * 处理数据到mongodb数据库
 * 
 * @author garmin
 *
 */
@Component
public interface AccountRepository extends MongoRepository<Account, String> {
	/**
	 * 参照spring data jpa 可以根据方法名称查询出数据无需实现
	 * @param name
	 * @return
	 */
	Account findByName(String name);
}
