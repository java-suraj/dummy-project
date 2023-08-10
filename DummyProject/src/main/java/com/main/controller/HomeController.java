package com.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home/page1")
    public String getPage1() {
        return "<html><head><style>body{font-family: Arial, sans-serif;background-color: #f4f4f4;text-align: center;margin: 0;}h1{color: #333;}footer{background-color: #333;color: #fff;text-align: center;padding: 10px;position: absolute;bottom: 0;width: 100%;}</style></head><body><h1>Welcome to Home Page 1</h1><footer>&copy; 2023 My Home Page. All rights reserved.</footer></body></html>";
    }

    @GetMapping("/home/page2")
    public String getPage2() {
        return "<html><head><style>body{font-family: Arial, sans-serif;background-color: #f4f4f4;text-align: center;margin: 0;}h1{color: #333;}footer{background-color: #333;color: #fff;text-align: center;padding: 10px;position: absolute;bottom: 0;width: 100%;}</style></head><body><h1>Welcome to Home Page 2</h1><footer>&copy; 2023 My Home Page. All rights reserved.</footer></body></html>";
    }

    @GetMapping("/home/page3")
    public String getPage3() {
        return "<html><head><style>body{font-family: Arial, sans-serif;background-color: #f4f4f4;text-align: center;margin: 0;}h1{color: #333;}footer{background-color: #333;color: #fff;text-align: center;padding: 10px;position: absolute;bottom: 0;width: 100%;}</style></head><body><h1>Welcome to Home Page 3</h1><footer>&copy; 2023 My Home Page. All rights reserved.</footer></body></html>";
    }

    @GetMapping("/home/page4")
    public String getPage4() {
        return "<html><head><style>body{font-family: Arial, sans-serif;background-color: #f4f4f4;text-align: center;margin: 0;}h1{color: #333;}footer{background-color: #333;color: #fff;text-align: center;padding: 10px;position: absolute;bottom: 0;width: 100%;}</style></head><body><h1>Welcome to Home Page 4</h1><footer>&copy; 2023 My Home Page. All rights reserved.</footer></body></html>";
    }

    @GetMapping("/home/page5")
    public String getPage5() {
        return "<html><head><style>body{font-family: Arial, sans-serif;background-color: #f4f4f4;text-align: center;margin: 0;}h1{color: #333;}footer{background-color: #333;color: #fff;text-align: center;padding: 10px;position: absolute;bottom: 0;width: 100%;}</style></head><body><h1>Welcome to Home Page 5</h1><footer>&copy; 2023 My Home Page. All rights reserved.</footer></body></html>";
    }
}
