package com.company;

public class Edition  {
    private String title;
    private int pageCount;
    private PageFormat pageFormat;
    private PaperType paperType;
    private int requrestedCount;

    public Edition(String title, int pageCount, PageFormat pageFormat, PaperType paperType, int requrestedCount){
        this.title = title;
        this.pageCount = pageCount;
        this.pageFormat = pageFormat;
        this.paperType = paperType;
        this.requrestedCount = requrestedCount;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public PageFormat getPageFormat() {
        return pageFormat;
    }

    public PaperType getPaperType() {
        return paperType;
    }

    public int getRequrestedCount() {
        return requrestedCount;
    }

    @Override
    public String toString() {
        return "Edition{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", pageFormat=" + pageFormat +
                ", paperType=" + paperType +
                ". requestedCount=" + requrestedCount +
                '}';
    }

    public double price() {

        return (this.pageFormat.getFormatValue() + this.paperType.getNumVal()) * this.pageCount;
    }

    public double calculateBookIncome(){
           double  increaseInPrice = price() + (price() * 0.4);
           return increaseInPrice * requrestedCount;
    }



}
