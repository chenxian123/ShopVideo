package com.shop.service;

import java.util.List;

import com.shop.entity.Users;

public interface UsersService {
	/**
	 * 新增用户
	 * @param users
	 * @return
	 * @throws Exception
	 */
	int insUsers(Users users);
	/**
	 * 根据id查询用户信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	Users selUsers(int id);
	/**
	 * 修改用户
	 * @param users
	 * @param id
	 * @return
	 * @throws Exception
	 */
	int updUsers(Users users, int id);
	/**
	 * 删除用户
	 * @param id
	 * @return
	 * @throws Exception
	 */
	int delUsers(int id);
	/**
	 * 查询所有用户信息
	 * @return
	 * @throws Exception
	 */
	List<Users> selUsersAll();
	/**
	 * 根据用户名、密码查询用户信息
	 * @return
	 * @throws Exception
	 */
	Users snpUsers(String name, String password);
}
