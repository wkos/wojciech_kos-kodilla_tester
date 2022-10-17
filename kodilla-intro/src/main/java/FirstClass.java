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
    }

    public static void testGrades(){
        Grade grade = new Grade();
        grade.add(3);
        System.out.println("Added: 3, Last grade: " + grade.getLastGrade() + " Avg: " + grade.getAverageGrade());
        grade.add(5);
        System.out.println("Added: 5, Last grade: " + grade.getLastGrade() + " Avg: " + grade.getAverageGrade());
        grade.add(4);
        System.out.println("Added: 4, Last grade: " + grade.getLastGrade() + " Avg: " + grade.getAverageGrade());
        grade.add(2);System.out.println("Last grade: " + grade.getLastGrade() + " Avg: " + grade.getAverageGrade());
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
}
