package Jenny;

class WeekendMenu extends Menu {
    String appetizer;

    public String getAppetizer() {
        return appetizer;
    }

    public void setAppetizer(String appetizer) {
        this.appetizer = appetizer;
    }

    @Override
    public void printMenu() {
        System.out.println(appetizer);
        System.out.println(mainDish);
        System.out.println(dessert);
        System.out.println(soupOfTheDay);
    }

    public static void main(String[] args) {
        WeekendMenu menu = new WeekendMenu();
        menu.setAppetizer("Cesar Salad");
        menu.setMainDish("Egg Fried Rice");
        menu.setDessert("Lemon Drizzle Cake");
        menu.setSoupOfTheDay("Chowder Soup");
        menu.printMenu();
    }
}
