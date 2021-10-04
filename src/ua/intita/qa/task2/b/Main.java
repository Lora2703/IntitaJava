package ua.intita.qa.task2.b;

public class Main {
    public static void main(String[] args) {
        Paper copybook = new DrawingCopybook(24, "soft", "Lvivska fabryka",
                "A3", "coated");
        copybook.actionWithPaper();
    }
}
