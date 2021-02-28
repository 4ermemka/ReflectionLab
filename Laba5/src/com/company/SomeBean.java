package com.company;
import reflection.SomeInterface;
import reflection.SomeOtherInterface;

public class SomeBean {
    @AutoInjectable
    private SomeInterface someField;
    @AutoInjectable
    private SomeOtherInterface otherField;

    public SomeBean() {
    }


    public void go(){
        someField.doSome();
        otherField.doSome();
    }
}