import java.util.Random;

public class RandomNumbers {
    private int[] randomNumbers;
    private int size;
    public RandomNumbers(int size){
        this.randomNumbers = new int[size];
        this.size = 0;
    }
    public void generateRandomNumbers(int firstValue, int lastValue, int maxSum){
        Random random = new Random();
        int sum = 0;
        int i = 0;
        while(sum < maxSum) {
            this.randomNumbers[i] = firstValue + random.nextInt(lastValue - firstValue + 1);
            sum += this.randomNumbers[i];
            this.size++;
        }
    }

    public int maxNumber(){
        int max = this.randomNumbers[0];
        for(int i = 1; i < this.size; i++){
            if(this.randomNumbers[i] > max){
                max = this.randomNumbers[i];
            }
        }
        return  max;
    }

    public int minNumber(){
        int min = this.randomNumbers[0];
        for(int i = 1; i < this.size; i++){
            if(this.randomNumbers[i] < min){
                min = this.randomNumbers[i];
            }
        }
        return  min;
    }

    public int getSize(){
        return size;
    }
}
