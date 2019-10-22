package com.example.h2a2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FakeDatabase {

    public static Menu getMenuById(int menuID) {
        return menus.get(menuID);
    }

    public static ArrayList<Menu> getAllMenus() {
        return new ArrayList<Menu>((List) Arrays.asList(menus.values().toArray()));
    }

    private static final HashMap<Integer, Menu> menus = new HashMap<>();

    static {
        menus.put(1, new Menu(
                1,
                "10",
                "Box",
                "Classic"
        ));
        menus.put(2, new Menu(
                2,
                "5",
                "Chips",
                "More Chips"
        ));
    }

}
