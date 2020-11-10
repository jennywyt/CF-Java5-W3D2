package Jenny;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setName("Charlie and the chocolate factory");
        Author a1 = new Author();
        a1.setName("Roald Dahl");
        b1.setAuthor(a1);
        b1.setPrice(10);
        b1.setQuantity(2);

        System.out.println(b1.getName() + b1.getAuthor().getName() + b1.getPrice() + b1.getQuantity());
    }
}
