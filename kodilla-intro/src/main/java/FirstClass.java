public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1500, 1999);
        System.out.println("Notebook: weight " + notebook.weight + " price " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkPriceAndYear();

        Notebook heavyNotebook = new Notebook(2000, 3000, 2010);
        System.out.println("Heavy notebook: weight " + heavyNotebook.weight + " price " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkPriceAndYear();

        Notebook oldNotebook = new Notebook(1200, 2000, 2021);
        System.out.println("Old notebook: weight " + oldNotebook.weight + " price " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkPriceAndYear();

        Notebook notebook1 = new Notebook(500, 300, 1987);
        notebook1.checkPriceAndYear();
        Notebook notebook2 = new Notebook(500, 300, 2010);
        notebook2.checkPriceAndYear();
        Notebook notebook3 = new Notebook(500, 800, 1987);
        notebook3.checkPriceAndYear();
        Notebook notebook4 = new Notebook(500, 800, 2010);
        notebook4.checkPriceAndYear();

        testGrades();

        System.out.println("Uczniowie z ocenami poniżej średniej:");
        testUser();

        RandomNumbers randomNumbers = new RandomNumbers(10000);
        randomNumbers.generateRandomNumbers(0, 30, 5000);
        System.out.println("Ilość wylosowanych liczb: " + randomNumbers.getSize());
        System.out.println("Minimum: " + randomNumbers.minNumber());
        System.out.println("Maximum: " + randomNumbers.maxNumber());
    }

    public static void testGrades() {
        Grade grade = new Grade();
        grade.add(3);
        System.out.println("Added: 3, Last grade: " + grade.getLastGrade() + " Avg: " + grade.getAverageGrade());
        grade.add(5);
        System.out.println("Added: 5, Last grade: " + grade.getLastGrade() + " Avg: " + grade.getAverageGrade());
        grade.add(4);
        System.out.println("Added: 4, Last grade: " + grade.getLastGrade() + " Avg: " + grade.getAverageGrade());
        grade.add(2);
        System.out.println("Last grade: " + grade.getLastGrade() + " Avg: " + grade.getAverageGrade());
        System.out.println("Added: 2, Last grade: " + grade.getLastGrade() + " Avg: " + grade.getAverageGrade());
        grade.add(1);
        System.out.println("Added: 1, Last grade: " + grade.getLastGrade() + " Avg: " + grade.getAverageGrade());
        grade.add(4);
        System.out.println("Added: 4, Last grade: " + grade.getLastGrade() + " Avg: " + grade.getAverageGrade());
        grade.add(3);
        System.out.println("Added: 3, Last grade: " + grade.getLastGrade() + " Avg: " + grade.getAverageGrade());
        grade.add(5);
        System.out.println("Added: 5, Last grade: " + grade.getLastGrade() + " Avg: " + grade.getAverageGrade());
        grade.add(2);
        System.out.println("Added: 2, Last grade: " + grade.getLastGrade() + " Avg: " + grade.getAverageGrade());
        grade.add(3);
        System.out.println("Added: 3, Last grade: " + grade.getLastGrade() + " Avg: " + grade.getAverageGrade());
        grade.add(7);
        System.out.println("Added: 7, Last grade: " + grade.getLastGrade() + " Avg: " + grade.getAverageGrade());
    }

    public static void testUser() {
        User[] users = new User[5];
        users[0] = new User("Marek", 55);
        users[1] = new User("Ula", 15);
        users[2] = new User("Ela", 25);
        users[3] = new User("Ala", 35);
        users[4] = new User("Jurek", 36);
        double avg = 0;
        for (int i = 0; i < 5; i++) {
            avg += users[i].getAge();
        }
        avg /= 5;
        System.out.println("Średni wiek wszystkich osób: " + avg);
        for (int i = 0; i < 5; i++) {
            if (users[i].getAge() < avg) {
                System.out.println(users[i].getName() + " jest w wieku " + users[i].getAge());
            }
        }
    }
}
