package com.ball.doubleball.mapper.common;

import com.ball.doubleball.entity.Algorithm;
import com.ball.doubleball.entity.AlgorithmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlgorithmMapper {
    int countByExample(AlgorithmExample example);

    int deleteByExample(AlgorithmExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Algorithm record);

    int insertSelective(Algorithm record);

    List<Algorithm> selectByExample(AlgorithmExample example);

    Algorithm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Algorithm record, @Param("example") AlgorithmExample example);

    int updateByExample(@Param("record") Algorithm record, @Param("example") AlgorithmExample example);

    int updateByPrimaryKeySelective(Algorithm record);

    int updateByPrimaryKey(Algorithm record);
}