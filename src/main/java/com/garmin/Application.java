package com.garmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.garmin.entity.Account;
import com.garmin.repository.AccountRepository;

@SpringBootApplication()
@EnableAutoConfiguration()
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	//-----------------下面代码处理初始化一个用户-------------
	//用户名:garmin 用户密码:Aa123456 用户角色:ROLE_USER
	@Autowired
	AccountRepository accountRepository;
	
//	@Autowired
//	public void init(){
//		try {
//			Account account=new Account();
//			account.setName("garmin");
//			account.setPassword("Aa123456");
//			account.setRoles(new String []{"ROLE_USER"});
//			accountRepository.deleteAll();
//			accountRepository.save(account);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
}
