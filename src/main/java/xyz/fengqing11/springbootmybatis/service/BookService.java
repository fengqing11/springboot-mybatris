package xyz.fengqing11.springbootmybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.fengqing11.springbootmybatis.mapper.BookMapper;
import xyz.fengqing11.springbootmybatis.pojo.Book;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookMapper bookMapper;
    public int addBook(Book book){
        return bookMapper.addBook(book);
    }

    public int updateBook(Book book){
        return bookMapper.updateBookById(book);
    }

    public int deleteBookById(Integer id){
        return bookMapper.deleteBookById(id);
    }

    public Book getBookById(Integer id){
        return bookMapper.getBookById(id);
    }

    public List<Book> getAllBooks(){
        return bookMapper.getAllBooks();
    }

}
