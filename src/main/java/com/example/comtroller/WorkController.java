package com.example.comtroller;


import com.example.pojo.Tuser;
import com.example.pojo.Userborrow;
import com.example.service.UserBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class WorkController {
    @Autowired
    private UserBorrowService userborrowService;

    @RequestMapping("/borrow_book")
    public String insert( Model model,String BooksISBN,String login_userid)  {
        System.out.println(BooksISBN+","+login_userid+",");
        long book_isbn = Long.parseLong(BooksISBN) ;
        long usersid = Long.parseLong(login_userid) ;
        Userborrow borrow = new Userborrow();
        borrow.setBooksisbn(book_isbn);
        borrow.setUsersid(usersid);

//        System.out.println(borrow.getBooksisbn()+","+borrow.getUsersid()+",");

        try {
            int count = userborrowService.insert(borrow);
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:login/main_book";
//            自己手动拼接url new ModelAndView("redirect:/orderloaninfo？attr1="+value1+"attr2="+value2);

        }


        return "status/success";
    }

    @RequestMapping("/returnBook")
    public String returnBook( Model model,String BooksISBN,String UsersID) throws Exception {
        System.out.println(BooksISBN+","+UsersID+",");
        long book_isbn = Long.parseLong(BooksISBN) ;
        long usersid = Long.parseLong(UsersID) ;
        Userborrow borrow = new Userborrow();
        borrow.setBooksisbn(book_isbn);
        borrow.setUsersid(usersid);

//        System.out.println(borrow.getBooksisbn()+","+borrow.getUsersid()+",");
        int count = userborrowService.deleteBorrow(borrow);


        return "status/success";
    }

}
