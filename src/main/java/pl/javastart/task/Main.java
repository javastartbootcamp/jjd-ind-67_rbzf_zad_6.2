package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        ArrayCreator creator = new ArrayCreator();
        int size = creator.readSize();
        System.out.println("Wprowadz " + size + " liczb:");
        double [] array = creator.createArray(size);
        double sum = creator.getSqrSum(array);
        System.out.println("Suma kwadratow wprowadzonych liczb to " + sum);

    }
}
