package com.tavant.webclientmicroserviceserver.controller;

import com.tavant.webclientmicroserviceserver.model.Account;
import com.tavant.webclientmicroserviceserver.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AccountController {

    @Autowired
    AccountRepository accountRepository;

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("/accountList")
    public String accountList(Model model) {
        List<Account> accounts=accountRepository.getAllAccounts();
        System.out.println("***************"+accounts);
        model.addAttribute("accounts", accounts);
        return "accountList";
    }

    @RequestMapping("/accountDetails")
    public String accountDetails(@RequestParam("number") String id, Model model) {

        Account account=accountRepository.getAccount(id);
        System.out.println("$$$$$$$$$$$$$$$$$$$"+account);
        model.addAttribute("account", account);
        return "accountDetails";
    }
}
