package com.cctv.daoImpl;

import com.cctv.bean.News;
import com.cctv.dao.NewsDao;
import com.cctv.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NewsDaoImpl implements NewsDao {

    @Autowired
    NewsMapper mapper;

    @Override
    public void saveOne() {


    }

    @Override
    public List<News> findAll() {
      return  mapper.newsList();
    }

    @Override
    public News newsDetails(int nid) {
        return  mapper.newsDetails(nid);
    }


}
