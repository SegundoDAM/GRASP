package ejercicio08;

public class CohesionExample01 {
    
    private int[] numbers;
    private String name;
    
    public CohesionExample01(int[] numbers, String name) {
        this.numbers = numbers;
        this.name = name;
    }
    
    public void printNumbers() {
        System.out.print("Numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    
    public void printName() {
        System.out.println("Name: " + name);
    }
    
    public void calculateSum() {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("la suma de "+name+ "es: " + sum);
        
    }
    
 
}

