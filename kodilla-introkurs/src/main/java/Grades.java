public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int getLastAdded() {
        if (this.size == 0) {
            throw new IllegalStateException("No grades added yet.");
        }
        return this.grades[this.size - 1];
    }

    public double calculateAverage() {
        if (this.size == 0) {
            throw new IllegalStateException("No grades added yet.");
        }

        double sum = 0;
        for (int i = 0; i < this.size; i++) {
            sum += this.grades[i];
        }

        double average = sum / this.size;
        return average;
    }


    public static void main(String[] args) {
    Grades grades = new Grades();
        grades.add(3);
        grades.add(4);
        grades.add(5);
        int lastAdded = grades.getLastAdded();
        double average = grades.calculateAverage();
        System.out.println("Last added: " + lastAdded);
        System.out.println(grades.grades[0]);
        System.out.println(grades.grades[1]);
        System.out.println(grades.grades[2]);
        System.out.println("Average grades: " + average);
    }

}