package com.company;
import java.util.UUID;
public class Machine{
    private Color color;
    private int maxCapacity;
    private int printPerMinute;
    private final UUID uuid;


    public Machine(Color color, int maxCapacity, int printPerMinute) {
        this.color = color;
        this.maxCapacity = maxCapacity;
        this.printPerMinute = printPerMinute;
        this.uuid = UUID.randomUUID();
    }

    public Color getColor() {
        return color;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getPrintPerMinute() {
        return printPerMinute;
    }

    public UUID getUuid() {
        return uuid;
    }

    @Override
    public String toString() {
        return "Machines{" +
                "color=" + color +
                ", maxCapacity=" + maxCapacity +
                ", printPerMinute=" + printPerMinute +
                ", uuid" + uuid +
                '}';
    }

    protected void print(Edition edition) {
        var printingDelay = (long)((double)60 / (double)this.printPerMinute * 1000);
        for (int i = 0; i < edition.getRequrestedCount(); i++) {
            try {
                Thread.sleep(printingDelay);
                var str = String.format("Machine %s printed %s in %s color", this.uuid.toString(), edition.getTitle(), getColor());
                System.out.println(str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
