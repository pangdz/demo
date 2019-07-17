package com.example.demo.controller;

import com.example.demo.SayHi;
import com.example.demo.mapper.BookMapper;
import com.example.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    //首页
    @RequestMapping("/index")
    public String home() {
        return "index";
    }

    //hello
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }


    @Autowired
    SayHi s;

    @RequestMapping("/say")
    public String say() {
        return s.say();
    }

    @Autowired
    BookMapper bookMapper;

    @RequestMapping("/gets")
    public List<Book> queryAll() {
        List<Book> books = bookMapper.getAll();
        return books;
    }

    @RequestMapping("/get")
    public Book queryOne(Long id) {
        Book book = bookMapper.getOne(id);
        return book;
    }

    @RequestMapping("/add")
    public void addOne(Book book) {
        bookMapper.insert(book);
    }
}
