package com.cctv.dao;

import com.cctv.bean.News;

import java.util.List;

public interface NewsDao {

     void saveOne();

    List<News> findAll();

    News newsDetails(int nid);


}
