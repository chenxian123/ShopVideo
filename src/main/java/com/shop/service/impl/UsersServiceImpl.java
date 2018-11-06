package com.shop.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.shop.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.shop.mapper.UsersMapper;
import com.shop.service.UsersService;

@Service("usersService")
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersMapper usersMapper;
	@Autowired
	private Users users;

	@Override
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED)
	public int insUsers(Users users) {
		try {
			usersMapper.insertUsers(users);
            System.out.println("新增用户");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		return 0;
	}
	@Override
	@Transactional(readOnly=true)
	public Users selUsers(int id) {
		// TODO Auto-generated method stub
		try {
			users = usersMapper.selectUsersById(id);
            System.out.println("查询用户信息");
		} catch (Exception e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}
	@Override
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED)
	public int updUsers(Users Users, int id) {
		// TODO Auto-generated method stub
		try {
			usersMapper.updateUsers(Users,id);
            System.out.println("修改用户信息");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		return 0;
	}
	@Override
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED)
	public int delUsers(int id) {
		// TODO Auto-generated method stub
		try {
			usersMapper.deleteUsers(id);
            System.out.println("删除用户");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		return 0;
	}
	@Override
	@Transactional(readOnly=true)
	public List<Users> selUsersAll() {
		// TODO Auto-generated method stub
		List<Users> users=new ArrayList<Users>();
		try {
			users=usersMapper.selectAllUsers();
			System.out.println("查询所有用户");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}
	@Override
	@Transactional(readOnly=true)
	public Users snpUsers(String name, String password) {
		// TODO Auto-generated method stub
		try {
			users=usersMapper.selectNamePwdUsers(name, password);
            System.out.println("用户登录");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;
	}
}