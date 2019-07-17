package com.example.demo.mapper;

import com.example.demo.model.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookMapper {
    @Select("select * from book")
    List<Book> getAll();

    @Select("select * from book where id=#{id}")
    Book getOne(Long id);

    @Insert("insert into book( name, author) values(#{name}, #{author})")
    void insert(Book book);
}
