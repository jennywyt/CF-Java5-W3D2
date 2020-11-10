package Jenny;

class WeekdayMenu extends Menu{


    @Override
    public void printMenu() {
        System.out.println(mainDish);
        System.out.println(dessert);
        System.out.println(soupOfTheDay);
    }

    public static void main(String[] args) {
        Menu menu = new WeekdayMenu();
        menu.setMainDish("Egg Fried Rice");
        menu.setDessert("Lemon Drizzle Cake");
        menu.setSoupOfTheDay("Chowder Soup");
        menu.printMenu();
    }
}
