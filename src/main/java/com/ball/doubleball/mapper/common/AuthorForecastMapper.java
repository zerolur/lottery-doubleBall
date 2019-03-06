package com.ball.doubleball.mapper.common;

import com.ball.doubleball.entity.AuthorForecast;
import com.ball.doubleball.entity.AuthorForecastExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AuthorForecastMapper {
    int countByExample(AuthorForecastExample example);

    int deleteByExample(AuthorForecastExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthorForecast record);

    int insertSelective(AuthorForecast record);

    List<AuthorForecast> selectByExample(AuthorForecastExample example);

    AuthorForecast selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthorForecast record, @Param("example") AuthorForecastExample example);

    int updateByExample(@Param("record") AuthorForecast record, @Param("example") AuthorForecastExample example);

    int updateByPrimaryKeySelective(AuthorForecast record);

    int updateByPrimaryKey(AuthorForecast record);
}