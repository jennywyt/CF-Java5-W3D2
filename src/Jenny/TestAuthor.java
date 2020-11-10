package Jenny;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author();
        a1.setName("Roald Dahl");
        a1.setEmail("xyz@xyz.com");
        a1.setGender('m');
        a1.setInstagram("Roald-Dahl");
        System.out.println(a1.getName()+ a1.getInstagram()+ a1.getEmail()+ a1.getGender());
    }
}
