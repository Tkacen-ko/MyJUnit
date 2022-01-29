package ru.tkach.dz.junit;

public class MyFavoriteTest {
    @TkachTest
    public void test1(){

    }
    @TkachTest
    public void test2(){
        throw new RuntimeException();
    }
    @TkachTest
    public void test3(){

    }
    @TkachTest
    public void test4(){

    }
    @TkachTest
    public void test5(){
        throw new RuntimeException();
    }

    public void noTestMethod(){

    }
}
