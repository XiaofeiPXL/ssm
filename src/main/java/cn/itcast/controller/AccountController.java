package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @program: ssm
 * @description: Controller
 * @author: Xiaofei Wang
 * @created: 2020/09/19 22:39
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll() {
        List<Account> accountList = accountService.findAll();
        for (Account account:accountList){
            System.out.println(account);
        }
        return "list";
    }
}
