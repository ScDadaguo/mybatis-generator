package com.mybatis.demo;


import com.mybatis.demo.Untils.SessionUtils;
import com.mybatis.demo.entity.Ueser;
import com.mybatis.demo.mapper.UeserMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Demo {
//    public static void main(String[] args) {
//        SqlSession sqlSession= SessionUtils.getSession();
//        User user=new User((long) 16,"郭浩",20);
//        sqlSession.insert("insertOneUser",user);
//        sqlSession.commit();
//    }

    //
//    public static void main(String[] args) {
//        User user=new User((long) 19,"郭浩1",200);
//        SqlSession sqlSession= SessionUtils.getSession();
//        UserDao dao =sqlSession.getMapper(UserDao.class);
//        dao.insertOneUser(user);
//        sqlSession.commit();
//        sqlSession.close();
//    }

//    public static void main(String[] args) {
//        SqlSession sqlSession= SessionUtils.getSession();
//        UserDao dao =sqlSession.getMapper(UserDao.class);
//        List<User> userList= dao.selectAllUser();
//        System.out.println(userList);
//        sqlSession.commit();
//        sqlSession.close();
//    }

    public static void main(String[] args) {
        SqlSession sqlSession = SessionUtils.getSession();
        UeserMapper ueserMapper = sqlSession.getMapper(UeserMapper.class);
        List<Ueser> bookList = ueserMapper.selectAll();
        for (Ueser ueser : bookList) {
            System.out.println(ueser);
            System.out.println();
        }
        sqlSession.commit();
        sqlSession.close();
    }


}
