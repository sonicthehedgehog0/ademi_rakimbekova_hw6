public class Skeleton extends Boss {

    private int amountOfArrows;


    public int getAmountOfArrows() {
        return amountOfArrows;
    }

    public void setAmountOfArrows(int amountOfArrows) {
        this.amountOfArrows = amountOfArrows;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + "\nAMOUNT OF ARROWS: " + getAmountOfArrows();
    }
}
