package com.example.comtroller;

import com.example.pojo.Tbook;
import com.example.pojo.Tuser;
import com.example.pojo.Userborrow;
import com.example.service.TbookService;
import com.example.service.TuserService;
import com.example.service.UserBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private TuserService tuserService;

    @Autowired
    private UserBorrowService userborrowService;

    @Autowired
    private TbookService bookService;

    @RequestMapping("/login_user")
    public String loginUser(Model model,@RequestParam(required=false) String username,String password) throws Exception{
        long id = Long.parseLong(username) ;
        Tuser user=tuserService.selectByPrimaryKey(id);
        model.addAttribute("user",user);
        if (user.getUserspwd().equals(password)){
            List<Userborrow> list_borrow = userborrowService.selectByPrimaryUserKey(user.getUsersid());
            model.addAttribute("list_borrow",list_borrow);
            return "mian/user";
        }
        return "index";
    }

    @RequestMapping("/main_book")
    public String main_book(Model model) throws Exception{
        List<Tbook> list_book = bookService.selectAllBook();
        model.addAttribute("list_book",list_book);
        System.out.println(list_book.get(0).getBooksisbn());
        return "mian/main_book";
    }

    @RequestMapping("/return_book")
    public String return_book(Model model) throws Exception{
        return "mian/main_delete";
    }
}
