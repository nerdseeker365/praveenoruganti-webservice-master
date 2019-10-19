package com.praveen.apachecx.soap.service;

import javax.jws.WebService;

@WebService(serviceName="BookService", endpointInterface="com.praveen.apachecx.soap.service.IBookService")
public class BookServiceImpl implements IBookService {
 
    public String getBookNameBasedOnISBN(String isbnNumber) {
 
        if(isbnNumber.equalsIgnoreCase("ISBN-2134")){
            return "Microbiology";
        }
        return "Invalid_ISBN_Number";
    }
}
