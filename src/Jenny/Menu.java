package Jenny;

public abstract class Menu {
    String mainDish;
    String dessert;
    String soupOfTheDay;

public abstract void printMenu();

    public String getMainDish() {
        return mainDish;
    }

    public void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public String getSoupOfTheDay() {
        return soupOfTheDay;
    }

    public void setSoupOfTheDay(String soupOfTheDay) {
        this.soupOfTheDay = soupOfTheDay;
    }


}
