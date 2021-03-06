package xyz.fengqing11.springbootmybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import xyz.fengqing11.springbootmybatis.pojo.Book;

import java.util.List;

@Mapper
public interface BookMapper {
    int addBook(Book book);
    int deleteBookById(Integer id);
    int updateBookById(Book book);
    Book getBookById(Integer id);
    List<Book> getAllBooks();
}
