package com.iwscream.encrypt_test.controller;

import com.iwscream.encrypt_test.aes_service.Aes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Encrypt {
    @RequestMapping(value = "encrypt", method = RequestMethod.GET)
    public String encrypt(String message) throws Exception {
        System.out.println(message);
        System.out.println(Aes.aesEncrypt(message));
        return Aes.aesEncrypt(message);
    }

    @RequestMapping(value = "decrypt", method = RequestMethod.GET)
    public String decrypt(String message) throws Exception {
        System.out.println(message);
        System.out.println(Aes.aesDecrypt(message));
        return Aes.aesDecrypt(message);
    }

}
