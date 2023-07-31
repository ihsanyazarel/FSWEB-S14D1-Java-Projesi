package com.workintech.main;

import com.workintech.company.*;
import com.workintech.model.Circle;
import com.workintech.model.Cuboid;
import com.workintech.model.Cylinder;
import com.workintech.model.Rectangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------");
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
        System.out.println("-------------------------------------------------------");

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

        System.out.println("-------------------------------------------------------");

        System.out.println("****************************************************");

        JuniorDeveloper test1 = new JuniorDeveloper(1, "test1", 20000);
        JuniorDeveloper test2 = new JuniorDeveloper(2, "test2", 20000);
        JuniorDeveloper[] juniors = new JuniorDeveloper[]{test1, test2};

        MidDeveloper test3 = new MidDeveloper(1, "test3", 30000);
        MidDeveloper test4 = new MidDeveloper(2, "test4", 30000);
        MidDeveloper[] mids = new MidDeveloper[]{test3, test4};

        SeniorDeveloper test5 = new SeniorDeveloper(1, "test5", 40000);
        SeniorDeveloper test6 = new SeniorDeveloper(2, "test6", 40000);
        SeniorDeveloper[] seniors = new SeniorDeveloper[]{test5, test6};

        HRManager manager = new HRManager(1,"manager", 25000, juniors, mids, seniors);

        System.out.println("Juniors: " + Arrays.toString(manager.getJuniors()));
        System.out.println("Mids: " + Arrays.toString(manager.getMids()));
        System.out.println("Seniors: " + Arrays.toString(manager.getSeniors()));

    }
}