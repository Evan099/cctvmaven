package com.cctv.mapper;

import com.cctv.bean.News;

import java.util.List;

public interface NewsMapper {

    List<News> newsList();

    News newsDetails(int nid);
}
