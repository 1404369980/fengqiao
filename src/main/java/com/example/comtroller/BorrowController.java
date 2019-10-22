package com.example.comtroller;

import com.example.pojo.Userborrow;
import com.example.service.UserBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BorrowController {

    @Autowired
    private UserBorrowService userborrowService;

    @RequestMapping("/borrow_select")
    public String findborrowById(Model model,String BooksISBN,String UsersID) throws Exception{
        if (BooksISBN != null) {
            long book_isbn = Long.parseLong(BooksISBN);
            List<Userborrow> list_borrow = userborrowService.selectByPrimaryBookKey(book_isbn);
            model.addAttribute("list_borrow", list_borrow);
        }
        else if (UsersID != null){
            long users_id = Long.parseLong(UsersID);
            List<Userborrow> list_borrow = userborrowService.selectByPrimaryUserKey(users_id);
            model.addAttribute("list_borrow", list_borrow);
        }
        else{
            model.addAttribute("null",null);
        }
        return "borrow/borrow_select";
    }
    @RequestMapping("/borrow_insert")
    public String insert( Model model,String BooksISBN,String UsersID) throws Exception{
        System.out.println(BooksISBN+","+UsersID+",");
        long book_isbn = Long.parseLong(BooksISBN) ;
        long usersid = Long.parseLong(UsersID) ;
        Userborrow borrow = new Userborrow();
        borrow.setBooksisbn(book_isbn);
        borrow.setUsersid(usersid);
        System.out.println(borrow.getBooksisbn()+","+borrow.getUsersid()+",");
        int count = userborrowService.insert(borrow);
        return "borrow/borrow_insert";
    }
    @RequestMapping("/borrow_delete")
    public String deleteByPrimaryKey(Model model,String BooksISBN,String UsersID) throws Exception{
        if (UsersID != null) {
            long users_id = Long.parseLong(UsersID);
            int count = userborrowService.deleteByPrimaryUserKey(users_id);
        }
        else if (BooksISBN != null){
            long book_isbn = Long.parseLong(BooksISBN);
            int count = userborrowService.deleteByPrimaryBookKey(book_isbn);
        }
        System.out.println(BooksISBN+","+UsersID);
        return "borrow/borrow_delete";
    }
    @RequestMapping("/borrow_update")
    public String updateByPrimaryKey( Model model,String BooksISBN,String UsersID) throws Exception{
        System.out.println(BooksISBN+","+UsersID+",");
        long book_isbn = Long.parseLong(BooksISBN) ;
        long usersid = Long.parseLong(UsersID) ;
        Userborrow record = new Userborrow();
        record.setBooksisbn(book_isbn);
        record.setUsersid(usersid);
        int count = userborrowService.updateByPrimaryBookKey(record);
        return "borrow/borrow_update";

    }

    @RequestMapping("/borrow_selectAll")
    public String selectAllborrow(Model model) throws Exception{
        List<Userborrow> list_borrow = userborrowService.selectAllBorrow();
        model.addAttribute("list_borrow",list_borrow);
        System.out.println(list_borrow.get(0).getBooksisbn()+list_borrow.get(0).getUsersid());
        return "borrow/borrow_selectAll";

    }


    /*****************************************************************************************************/
    @RequestMapping("/view_borrow_select")
    public String borrowselect(Model model) throws Exception{
        return "borrow/borrow_select";
    }
    @RequestMapping("/view_borrow_insert")
    public String borrow_insert(Model model) throws Exception{
        return "borrow/borrow_insert";
    }
    @RequestMapping("/view_borrow_update")
    public String borrow_update(Model model) throws Exception{
        return "borrow/borrow_update";
    }
    @RequestMapping("/view_borrow_delete")
    public String borrow_delete(Model model) throws Exception{
        return "borrow/borrow_delete";
    }
}
