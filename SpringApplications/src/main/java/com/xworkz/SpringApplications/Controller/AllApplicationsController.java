package com.xworkz.SpringApplications.Controller;

import com.xworkz.SpringApplications.Dto.BankDto;
import com.xworkz.SpringApplications.Dto.PassportDto;
import com.xworkz.SpringApplications.Service.BankService;
import com.xworkz.SpringApplications.Service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AllApplicationsController {
public AllApplicationsController(){
    System.out.println("constructor of all allapplicationController ");
}

@Autowired
private BankService bankService;
@PostMapping("/apply")
public String bankController(BankDto bankDto){
    System.out.println("method of bankController");

   boolean see= this.bankService.validAndSave(bankDto);
    System.out.println(bankDto);
    if(see){
        System.out.println("data  saved");
    }else{
        System.out.println("data not saved");
    }
    return "Bank.jsp";
}

@Autowired
private PassportService passportService;
@RequestMapping("/save")
public String passportController(PassportDto p2){
    System.out.println("controller method of passport");
    System.out.println(p2);
    boolean watch=this.passportService.valid(p2);
    if(watch){
        System.out.println("passport application submitted");
    }else {
        System.out.println("failed to submit passport application");
    }
    return "Passport.jsp";
}
}
