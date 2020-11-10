package Jenny;

class Author {
    private String name;
    private String email;
    private char gender;
    private String Instagram;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setInstagram(String Instagram) {
        this.Instagram = Instagram;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public char getGender() {
        return this.gender;
    }

    public String getInstagram() {
        return this.Instagram;
    }
}
