public class Application {
    public static void main(String[] args) {
        Person person = new Person("Adam", 50.5, 178);
        person.showInformationAboutAgeAndHeight(30, 160);

        Person person1 = new Person("Marek", 80.5, 108);
        person1.showInformationAboutAgeAndHeight(30, 160);
    }
}