package com.kodilla.school;

public class Grades {
    private int[] values;
    private int size;

    public Grades() {
        this.values = new int[0];
        this.size = 0;
    }

    public void add(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value;
        values = newTab;
    }

    public int[] getValues() {
        return values;
    }

    public double getAverage(){
        if(values.length == 0){
            return 0;
        }
        double sum = 0;
        for(int i = 0; i < values.length; i++){
            sum += values[i];
        }
        return sum / values.length;
    }
}