package ua.intita.qa.task2.b;

public class DrawingCopybook extends Copybook{
    private String size;
    private String kindOfPaper;


    public DrawingCopybook(int numberOfSheet, String typeOfCover, String producer, String size, String kindOfPaper) {
        super(numberOfSheet, typeOfCover, producer);
        this.size = size;
        this.kindOfPaper = kindOfPaper;
    }

    @Override
    public void actionWithPaper() {
        System.out.println("This copybook is for drawing");
    }
}
