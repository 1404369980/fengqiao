package com.example.comtroller;

import com.example.pojo.Tbook;
import com.example.pojo.Tuser;
import com.example.service.TbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private TbookService bookService;

    @RequestMapping("/book_select")
    public String findbookById(Model model,String BooksISBN) throws Exception{
        long book_isbn = Long.parseLong(BooksISBN) ;
        Tbook book = bookService.selectByPrimaryKey(book_isbn);
        model.addAttribute("book",book);
        return "book/book_select";
    }
    @RequestMapping("/book_insert")
    public String insert( Model model,String BooksISBN,String BooksName,String BooksAuthor,String BooksType,String BooksPrice,String BooksPublisher,String BooksStore,String BooksTotal) throws Exception{
        System.out.println(BooksISBN+","+BooksName+","+BooksAuthor+","+BooksType+","+BooksPrice+","+BooksPublisher+","+BooksStore+","+BooksTotal);
        long book_isbn = Long.parseLong(BooksISBN) ;
        long bookprice = Long.parseLong(BooksPrice) ;
        long bookstore = Long.parseLong(BooksStore) ;
        long booktotal = Long.parseLong(BooksTotal) ;
        Tbook book = new Tbook();
        book.setBooksisbn(book_isbn);
        book.setBooksname(BooksName);
        book.setBooksauthor(BooksAuthor);
        book.setBookstype(BooksType);
        book.setBooksprice(bookprice);
        book.setBookspublisher(BooksPublisher);
        book.setBooksstore(bookstore);
        book.setBookstotal(booktotal);
        System.out.println(book.getBooksauthor()+","+book.getBooksname()+","+book.getBookspublisher()+","+book.getBooksisbn()+","+book.getBookstype()+","+book.getBookstotal()+","+book.getBooksstore()+","+book.getBooksprice());
        int count = bookService.insert(book);
        return "book/book_insert";
    }
    @RequestMapping("/book_delete")
    public String deleteByPrimaryKey(Model model,String BooksISBN) throws Exception{
        long book_isbn = Long.parseLong(BooksISBN) ;
        int count = bookService.deleteByPrimaryKey(book_isbn);
        System.out.println(book_isbn);
        return "book/book_delete";
    }
    @RequestMapping("/book_update")
    public String updateByPrimaryKey( Model model,String BooksISBN,String BooksName,String BooksAuthor,String BooksType,String BooksPrice,String BooksPublisher,String BooksStore,String BooksTotal) throws Exception{
        System.out.println(BooksISBN+","+BooksName+","+BooksAuthor+","+BooksType+","+BooksPrice+","+BooksPublisher+","+BooksStore+","+BooksTotal);
        long book_isbn = Long.parseLong(BooksISBN) ;
        long bookprice = Long.parseLong(BooksPrice) ;
        long bookstore = Long.parseLong(BooksStore) ;
        long booktotal = Long.parseLong(BooksTotal) ;
        Tbook book = new Tbook();
        book.setBooksisbn(book_isbn);
        book.setBooksname(BooksName);
        book.setBooksauthor(BooksAuthor);
        book.setBookstype(BooksType);
        book.setBooksprice(bookprice);
        book.setBookspublisher(BooksPublisher);
        book.setBooksstore(bookstore);
        book.setBookstotal(booktotal);
        int count = bookService.updateByPrimaryKey(book);
        return "book/book_update";

    }

    @RequestMapping("/book_selectAll")
    public String selectAllbook(Model model) throws Exception{
        List<Tbook> list_book = bookService.selectAllBook();
        model.addAttribute("list_book",list_book);
        System.out.println(list_book.get(0).getBooksisbn());
        return "book/book_selectAll";

    }


    /*****************************************************************************************************/
    @RequestMapping("/view_book_select")
    public String bookselect(Model model) throws Exception{
        return "book/book_select";
    }
    @RequestMapping("/view_book_insert")
    public String book_insert(Model model) throws Exception{
        return "book/book_insert";
    }
    @RequestMapping("/view_book_update")
    public String book_update(Model model) throws Exception{
        return "book/book_update";
    }
    @RequestMapping("/view_book_delete")
    public String book_delete(Model model) throws Exception{
        return "book/book_delete";
    }
}
