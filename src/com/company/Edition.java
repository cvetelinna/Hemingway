package com.company;

public class Edition  {
    private String title;
    private int pageCount;
    private PageFormat pageFormat;
    private PaperType paperType;
    //TODO: editions count

    public Edition(String title, int pageCount, PageFormat pageFormat, PaperType paperType){
        this.title = title;
        this.pageCount = pageCount;
        this.pageFormat = pageFormat;
        this.paperType = paperType;
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

    @Override
    public String toString() {
        return "Edition{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", pageFormat=" + pageFormat +
                ", paperType=" + paperType +
                '}';
    }

    public double price() {
        return this.pageFormat.getFormatValue() * this.paperType.getNumVal() * pageCount;
    }



}
