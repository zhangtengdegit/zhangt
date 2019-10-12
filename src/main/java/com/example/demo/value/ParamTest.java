package com.example.demo.value;

public class ParamTest {

    public static void main(String[] args) {
        ParamTest pt = new ParamTest();

        User hollis = new User();
        hollis.setName("Hollis");
        hollis.setGender("Male");
        pt.pass(hollis);
        System.out.println("print in main , user is " + hollis.getName());
    }

    public void pass(User user) {
        user.setName("hollischuang");
        System.out.println("print in pass , user is " + user.getName());
    }

}
