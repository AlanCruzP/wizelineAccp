package com.example.wizeline.mvn.WizelineMvn.service;

/*
 * Copyright (c) 2022 Nextiva, Inc. to Present.
 * All rights reserved.
 */

import java.util.List;

import com.example.wizeline.mvn.WizelineMvn.model.BankAccountDTO;

/**
 *
 * Created by jose.vazquez on 07/09/22
 */
public interface BankAccountService {

    /**
     * Gets accounts.
     *
     * @return todas las cuentas existentes en formato de lista.
     */
    List<BankAccountDTO> getAccounts();

    /**
     * Gets account details.
     *
     * @param user      nombre de usuario.
     * @param lastUsage último uso de la cuenta.
     * @return detalles de una sola cuenta.
     */
    BankAccountDTO getAccountDetails(String user, String lastUsage);

    void deleteAccounts();

    List<BankAccountDTO> getAccountByUser(String user);

}