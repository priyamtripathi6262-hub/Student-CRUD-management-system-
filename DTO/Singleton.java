package com.example.demo.DTO;

import org.springframework.stereotype.Service;

@Service
public class Singleton {
     private static Singleton instance;
     private Singleton (){

     }
     public static Singleton getInstance(){
        if(instance ==null){
            instance =new Singleton();

        }
        return instance;
     }

}
