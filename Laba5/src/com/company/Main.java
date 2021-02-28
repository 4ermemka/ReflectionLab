package com.company;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException {
    	/**
         * ���� ���������������� ������ ������ SomeBean ��� ������ new,
         * �� � ����� ����� ���� someField � otherField �� ����� ����������������
         * � ��� ������ ������ go �� ������� NullPointerException.
         * ����� Injector ������������ ������������� ���� ����� �� ������ ����� ������������
         */
            SomeBean sb = (new Injector<SomeBean>("src/config/inj.properties").inject(new SomeBean()));
            sb.go();
    }
}