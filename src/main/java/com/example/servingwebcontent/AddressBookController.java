package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AddressBookController {
    AddressBook ab = new AddressBook();

    @GetMapping("/")
    public @ResponseBody
    String createAddBook(){
        return  new String("Hello there");
    }

    @GetMapping("/add")
    public String addBuddy(@RequestParam(name = "name")String name, @RequestParam(name = "add")String address, Model model){
        BuddyInfo b1 = new BuddyInfo(name, address);
        ab.addBuddy(b1);
        //System.out.println("Buddy Added");
        //model.addAttribute("name", name);
        //model.addAttribute("address", address);
        List<BuddyInfo> myli = ab.getBuds();
        model.addAttribute("buds", myli);
        return "addbook";
    }

    @GetMapping("/remove")
    public String removeBuddy(@RequestParam(name = "name")String name, @RequestParam(name = "add")String address, Model model){
        BuddyInfo b1 = new BuddyInfo(name, address);
        ab.delBuddy(b1);
        return "addbook";
    }

}
