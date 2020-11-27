package com.zhaoyubin.controller;

public class TestController {
    public void test(){
        int i =10;
        if(i==10){
            if(i==10){
                System.out.println("master冲突解决");
            }
      
            System.out.println("master冲突解决");
        }
    }
}
