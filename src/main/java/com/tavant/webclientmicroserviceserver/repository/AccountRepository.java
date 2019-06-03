package com.tavant.webclientmicroserviceserver.repository;

import com.tavant.webclientmicroserviceserver.model.Account;

import java.util.List;

public interface AccountRepository {

    List<Account> getAllAccounts();
    Account getAccount(String number);
}
