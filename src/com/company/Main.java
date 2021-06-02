package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	Edition editionTest = new Edition("Qnko", 30, PageFormat.А3, PaperType.GLOSSY);
        System.out.println(editionTest.price());

    PrintingHouse ph = new PrintingHouse(12000, 12200, 60, new ArrayList<Employee>());
    }
}
