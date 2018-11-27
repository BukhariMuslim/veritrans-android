package com.midtrans.sdk.corekit.models.merchant.checkout.request.specific.banktransfer;

import com.midtrans.sdk.corekit.core.merchant.model.checkout.request.specific.banktransfer.BankTransferVirtualAccount;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BankTransferVirtualAccountTest {

    private BankTransferVirtualAccount bankTransferVirtualAccount;
    private String exampleTextPositive, exampleTextNegative;

    @Before
    public void test_setup() {
        this.bankTransferVirtualAccount = new BankTransferVirtualAccount();
        this.exampleTextPositive = "exampleTextPositive";
        this.exampleTextNegative = "exampleTextNegative";
    }

    @Test
    public void test_SetVaNumber_positive() {
        bankTransferVirtualAccount.setVaNumber(exampleTextPositive);
        assertEquals(bankTransferVirtualAccount.getVaNumber(), exampleTextPositive);
    }

    @Test
    public void test_SetVaNumber_negative() {
        bankTransferVirtualAccount.setVaNumber(exampleTextPositive);
        assertNotEquals(bankTransferVirtualAccount.getVaNumber(), exampleTextNegative);
    }

}