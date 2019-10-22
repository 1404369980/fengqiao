package com.example.comtroller;

import com.example.pojo.Tuser;
import com.example.service.TuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class UserController {

	@Autowired
	private TuserService tuserService;

	@RequestMapping("/user_select")
	public String findUserById(Model model,@RequestParam(required=false) String user_id) throws Exception{
		long id = Long.parseLong(user_id) ;
		Tuser user=tuserService.selectByPrimaryKey(id);
		model.addAttribute("user",user);
		model.addAttribute("word","hello word");
		return "user/user_select";
	}
	@RequestMapping("/user_insert")
	public String insert( String UsersID,String UsersName,String UsersPwd,String UsersTel) throws Exception{
	    Tuser record = new Tuser();
        long id = Long.parseLong(UsersID) ;
        record.setUsersid(id);
        record.setUsersname(UsersName);
        record.setUserspwd(UsersPwd);
        record.setUserstel(UsersTel);
		int count = tuserService.insert(record);
        System.out.println(UsersName);
		return "user/user_insert";
	}
	@RequestMapping("/user_delete")
	public String deleteByPrimaryKey(Model model,@RequestParam(required=false) String id) throws Exception{
		long long_id = Long.parseLong(id) ;
		int count = tuserService.deleteByPrimaryKey(long_id);

		return "user/user_delete";
	}
	@RequestMapping("/user_update")
	public String updateByPrimaryKey( String UsersID,String UsersName,String UsersPwd,String UsersTel) throws Exception{
		Tuser record = new Tuser();
		long id = Long.parseLong(UsersID) ;
		record.setUsersid(id);
		record.setUsersname(UsersName);
		record.setUserspwd(UsersPwd);
		record.setUserstel(UsersTel);
		System.out.println(record.getUsersid()+record.getUsersname()+record.getUserspwd()+record.getUserstel());
		int count = tuserService.updateByPrimaryKey(record);

		return "user/user_update";

	}

	@RequestMapping("/user_selectAll")
	public String selectAllUser(Model model) throws Exception{
        List<Tuser> list_use = tuserService.selectAllUser();
        model.addAttribute("list_user",list_use);
		System.out.println(list_use.get(0).getUsersid());
		return "user/user_selectAll";

	}

//	selectAllUser

	@RequestMapping("/view_user_select")
	public String user_select(Model model) throws Exception{
	    return "user/user_select";
	}
	@RequestMapping("/view_user_insert")
	public String user_insert(Model model) throws Exception{
	    return "user/user_insert";
	}
	@RequestMapping("/view_user_update")
	public String user_update(Model model) throws Exception{
		return "user/user_update";
	}
	@RequestMapping("/view_user_delete")
	public String findUserById(Model model) throws Exception{
		return "user/user_delete";
	}
}
