package com.aop.advisor.instance01;

// 目标类

public class SomeServiceImpl implements ISomeService {

    // 目标方法
    @Override
    public void doFirst() {
        System.out.println("执行doFirst()方法！");
    }

    // 目标方法
    @Override
    public void doSecond() {
        System.out.println("执行doSecond()方法！");
    }
}
