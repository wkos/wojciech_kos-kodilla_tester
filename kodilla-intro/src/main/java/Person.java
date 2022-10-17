public class Person {
    String name;
    double age;
    double height;

    public Person(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void showInformationAboutAgeAndHeight(double limitAge, double limitHeight) {
        if (this.name != null) {
            if (this.age > limitAge && this.height > limitHeight) {
                System.out.println("User is older than " + limitAge + " and taller than " + limitHeight + "cm");
            } else {
                System.out.println("User is " + limitAge + " (or younger) or " + limitHeight + "cm (or shorter)");
            }
        }
    }
}
