package xyz.fengqing11.springbootmybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.fengqing11.springbootmybatis.pojo.Book;
import xyz.fengqing11.springbootmybatis.service.BookService;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/b")
    public void book(){
        Book b = new Book();
        b.setName("按实际嗲");
        b.setAuthor("爱就是");
        System.out.println(bookService.addBook(b));
    }
}
