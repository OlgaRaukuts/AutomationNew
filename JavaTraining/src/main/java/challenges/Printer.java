package challenges;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount){
        int tempAmount = tonerAmount + tonerLevel;
        if(tempAmount < 0 || tempAmount > 100){
            return -1;
        }
        tonerLevel += tonerAmount;

        return tonerLevel;
    }
    public int printPages(int pages){
        int jobPages = (duplex) ? (pages/2) + (pages%2) : pages;
        pagesPrinted +=jobPages;
       return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
