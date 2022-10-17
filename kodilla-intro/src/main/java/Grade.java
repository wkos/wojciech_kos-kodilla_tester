public class Grade {
    private int[] grades;
    private int size;

    public Grade(){
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value){
        if(this.size == 10){
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int getLastGrade(){
        return this.grades[this.size - 1];
    }

    public  double getAverageGrade(){
        int grade = 0;
        for(int i = 0; i < this.size; i++){
            grade += this.grades[i];
        }
        return (double) grade / this.size;
    }
}
