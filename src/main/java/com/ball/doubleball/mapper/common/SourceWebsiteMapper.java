package com.ball.doubleball.mapper.common;

import com.ball.doubleball.entity.SourceWebsite;
import com.ball.doubleball.entity.SourceWebsiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SourceWebsiteMapper {
    int countByExample(SourceWebsiteExample example);

    int deleteByExample(SourceWebsiteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SourceWebsite record);

    int insertSelective(SourceWebsite record);

    List<SourceWebsite> selectByExample(SourceWebsiteExample example);

    SourceWebsite selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SourceWebsite record, @Param("example") SourceWebsiteExample example);

    int updateByExample(@Param("record") SourceWebsite record, @Param("example") SourceWebsiteExample example);

    int updateByPrimaryKeySelective(SourceWebsite record);

    int updateByPrimaryKey(SourceWebsite record);
}