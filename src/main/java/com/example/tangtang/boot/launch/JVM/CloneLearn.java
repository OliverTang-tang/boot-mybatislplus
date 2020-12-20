package com.example.tangtang.boot.launch.JVM;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CloneLearn {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address=new Address(110,"BeiJing");
        People p1=new People(1,"古力娜扎",address);
        People p2 = p1.clone();
        p1.getAddress().setCity("NanJing");
        System.out.println(p1.getAddress().city);
        System.out.println(p2.getAddress().city);

    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class People implements Cloneable{
     private Integer id;
     private String name;
     private Address address;

     @Override
     protected People clone() throws CloneNotSupportedException{
         People people=(People) super.clone();
         people.setAddress( this.address.clone());
         return people;
     }
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class Address implements Cloneable{
        private Integer id;
        private String city;

        @Override
        protected Address clone() throws CloneNotSupportedException{
            return (Address) super.clone();
        }
    }
}
