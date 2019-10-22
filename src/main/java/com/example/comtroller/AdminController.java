package com.example.comtroller;

import com.example.pojo.Tadmin;
import com.example.pojo.Tadmin;
import com.example.pojo.Tadmin;
import com.example.service.TadminService;
import com.example.service.TadminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private TadminService adminService;

    @RequestMapping("/admin_select")
    public String findadminById(Model model,String AdminID) throws Exception{
        long admin_id = Long.parseLong(AdminID) ;
        Tadmin admin = adminService.selectByPrimaryKey(admin_id);
        model.addAttribute("admin",admin);
        return "admin/admin_select";
    }
    @RequestMapping("/admin_insert")
    public String insert( Model model,String AdminID,String AdminPwd,String AdminName) throws Exception{
        long admin_id = Long.parseLong(AdminID);
//        long admin_id = Long.parseLong(new Date().getTime())
        Tadmin admin = new Tadmin();
        admin.setAdminid(admin_id);
        admin.setAdminname(AdminName);
        admin.setAdminpwd(AdminPwd);
        admin.setAdminaddtime(new Date());
        int count = adminService.insert(admin);
        System.out.println(admin.getAdminid()+","+admin.getAdminname()+","+admin.getAdminpwd()+","+admin.getAdminaddtime());

        return "admin/admin_insert";
    }
    @RequestMapping("/admin_delete")
    public String deleteByPrimaryKey(Model model,String AdminID) throws Exception{
        long admin_id = Long.parseLong(AdminID) ;
        int count = adminService.deleteByPrimaryKey(admin_id);
        System.out.println(admin_id);
        return "admin/admin_delete";
    }
    @RequestMapping("/admin_update")
    public String updateByPrimaryKey(Model model,String AdminID,String AdminPwd,String AdminName) throws Exception{
        long admin_id = Long.parseLong(AdminID);
//        long admin_id = Long.parseLong(new Date().getTime())
        Tadmin admin = new Tadmin();
        admin.setAdminid(admin_id);
        admin.setAdminname(AdminName);
        admin.setAdminpwd(AdminPwd);
        admin.setAdminaddtime(new Date());
        System.out.println(admin.getAdminid()+","+admin.getAdminname()+","+admin.getAdminpwd()+","+admin.getAdminaddtime());
        int count = adminService.updateByPrimaryKey(admin);
        return "admin/admin_update";

    }

    @RequestMapping("/admin_selectAll")
    public String selectAlladmin(Model model) throws Exception{
        List<Tadmin> list_admin = adminService.selectAllAdmin();
        model.addAttribute("list_admin",list_admin);
        System.out.println(list_admin.get(0).getAdminid());
        return "admin/admin_selectAll";

    }

    /*****************************************************************************************************/
    @RequestMapping("/view_admin_select")
    public String adminselect(Model model) throws Exception{
        return "admin/admin_select";
    }
    @RequestMapping("/view_admin_insert")
    public String admin_insert(Model model) throws Exception{
        return "admin/admin_insert";
    }
    @RequestMapping("/view_admin_update")
    public String admin_update(Model model) throws Exception{
        return "admin/admin_update";
    }
    @RequestMapping("/view_admin_delete")
    public String admin_delete(Model model) throws Exception{
        return "admin/admin_delete";
    }
}
