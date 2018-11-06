package com.shop.mapper;

import java.util.List;

import com.shop.entity.Users;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

public interface UsersMapper {
    /**
     * 新增用户
     * @param users
     * @return
     * @throws Exception
     */
    int insertUsers(Users users) throws Exception;
    /**
     *修改用户
     * @param users
     * @param id
     * @return
     * @throws Exception
     */
    int updateUsers(@Param("users") Users users, @Param("id") int id) throws Exception;
     /**
      * 删除用户
      * @param id
      * @return
      * @throws Exception
      */
    int deleteUsers(@Param("id") int id) throws Exception;
    /**
     * 根据id查询用户信息
     * @param id
     * @return
     * @throws Exception
     */
    Users selectUsersById(@Param("id") int id) throws Exception;
     /**
      * 查询所有用户信息
      * @return
      * @throws Exception
      */
    List<Users> selectAllUsers() throws Exception;
    /**
     * 根据用户名、密码查询用户信息
     * @return
     * @throws Exception
     */
    Users selectNamePwdUsers(@Param("name") String name, @Param("password") String password) throws Exception;
}