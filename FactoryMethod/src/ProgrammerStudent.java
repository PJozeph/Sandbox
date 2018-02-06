public class ProgrammerStudent extends Student {


    private String favoritaProgramingLanguage;
    private String lastName;

    public ProgrammerStudent(String firstName, String lastName, String[] subjects,String favoritaProgramingLanguage) {
        super(firstName, lastName, subjects);
        this.lastName = lastName;
        this.favoritaProgramingLanguage = favoritaProgramingLanguage;
    }


    public void programming(){
        System.out.println(lastName + "is programming with " +favoritaProgramingLanguage + " language ");
    }

    @Override
    public String toString() {
        return "ProgrammerStudent{" +
                "favoritaProgramingLanguage='" + favoritaProgramingLanguage + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
