/*
    Nama : Djulizah Bonita L.
    NIM : H071211073
*/

class Author {
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    String getName() {
        return name;
    }
    String getEmail() {
        return email;
    }
    char getGender() {
        return gender;
    }

    //override agar output string
    public String toString() {
        return name;
    }
}