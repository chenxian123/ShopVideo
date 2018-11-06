package com.shop.mapper;

import com.shop.entity.Infor;
import com.shop.vo.InforMessage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InforMapper {
    /**
     * 发送信件
     * @param infor
     * @return
     * @throws Exception
     */
    int insertInfor(Infor infor) throws Exception;
    /**
     *修改信件信息
     * @param infor
     * @param id
     * @return
     * @throws Exception
     */
    int updateInfor(@Param("infor") Infor infor, @Param("id") int id) throws Exception;
    /**
     * 删除信件(标记数据库isdelete字段值为1)
     * @param id
     * @return
     * @throws Exception
     */
    int delInfor(@Param("id") int id) throws Exception;
     /**
      * 删除信件
      * @param id
      * @return
      * @throws Exception
      */
    int deleteInfor(@Param("id") int id) throws Exception;
    /**
     * 根据id查询信件信息
     * @param id
     * @return
     * @throws Exception
     */
    List<InforMessage> selectInforById(@Param("id") int id) throws Exception;
     /**
      * 查询所有信件信息
      * @return
      * @throws Exception
      */
    List<InforMessage> selectAllInfor() throws Exception;
    /**
     * 根据用发件人查询信件信息
     * @return
     * @throws Exception
     */
    List<InforMessage> selectSenderInfor(@Param("sender") int sender) throws Exception;
    /**
     * 根据用收件人查询信件信息
     * @return
     * @throws Exception
     */
    List<InforMessage> selectReceiverInfor(@Param("receiver") int receiver) throws Exception;
    /**
     * 垃圾箱
     * @return
     * @throws Exception
     */
    List<InforMessage> selectIsdeleteInfor() throws Exception;
}