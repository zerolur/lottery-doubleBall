package com.ball.doubleball.service;

import com.ball.doubleball.entity.Author;
import com.ball.doubleball.entity.AuthorExample;
import com.ball.doubleball.mapper.common.AuthorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mr.chen
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2019/3/59:54
 */
@Service
public class AuthorService {
    @Autowired
    AuthorMapper authorMapper;

    // 根据姓名查询作者 不存在返回null
    public Author getAuthorByName(String name,Integer sourceId){
        Author author = null;
        if (null != name && "".equals(name.trim()) && null != sourceId && sourceId > 0){
            AuthorExample example = new AuthorExample();
            example.createCriteria().andNameEqualTo(name.trim()).andSourceIdEqualTo(sourceId);
            List<Author> authorList = authorMapper.selectByExample(example);
            author = authorList == null?null:authorList.size()>0?authorList.get(0):null;
        }
        return author;
    }
    // 初始化新增作者
    public int initAuthor(String name,Integer sourceId,String sourceName){
        if (null != name && !"".equals(name.trim()) && sourceId > 0 && sourceName != null){
            Author author = new Author();
            author.setName(name);
            author.setSourceId(sourceId);
            author.setSourceName(sourceName);
            return authorMapper.insertSelective(author);
        }
        return 0;
    }
}
