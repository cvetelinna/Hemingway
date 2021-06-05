package com.company;

import java.util.UUID;

/*
В печатницата има няколко печатни машини, които се зареждат с определен максимален брой листове хартия и могат да
 отпечатват цветно или черно-бяло.

 Всяка от тях може да отпечатва определен брой страници в минута, ако бъде заредена с хартия.
Ако не е заредена с хартия, трябва да се хвърля изключение, което да показва колко е максималният брой на листовете хартия,
 в който тя може да се зареди. Печатницата разполага с няколко машини за печатане,
 трябва процесът на печатане на изданията да се извършва паралелно на всички машини.

  За тази цел, трябва всяка машина да отпечатва изданията в отделна нишка
  и да се показва на коя машина кое издание се отпечатва в момента.
*/
public class Machines {
    private Color color;
    private int maxCapacity;
    private int throughout;
    private final UUID uuid;


    public Machines(Color color, int maxCapacity, int throughout) {
        this.color = color;
        this.maxCapacity = maxCapacity;
        this.throughout = throughout;
        this.uuid = UUID.randomUUID();
    }

    public Color getColor() {
        return color;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getThroughout() {
        return throughout;
    }

    public UUID getUuid() {
        return uuid;
    }

    @Override
    public String toString() {
        return "Machines{" +
                "color=" + color +
                ", maxCapacity=" + maxCapacity +
                ", throughout=" + throughout +
                ", uuid" + uuid +
                '}';
    }

    public void print(Edition edition, int count){
        for (int i = 0; i < count; i++) {
            var str = String.format("Machine %s printed %s", this.uuid.toString(), edition.getTitle());
            System.out.println(str);
        }
    }

}
