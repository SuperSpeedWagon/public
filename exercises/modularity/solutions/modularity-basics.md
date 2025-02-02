# Solution: Modularity - Basics

## Rewriting long code

There are five main tasks which are being done:
- Loading the numbers
- Computing the mean
- Computing the standard deviation
- Normalizing the values
- Writing the results

We can split this behavior into separate functions, making it much easier to test and develop. It also has the benefit of making it significantly easier to understand.

Let's start by writing what we want our main method to contain:

```java
List<Double> numbers = loadFromFile("data");
double mean = mean(numbers);
double std = std(numbers, mean);
List<Double> normalized = normalize(numbers, mean, std);
System.out.println(normalized);
writeToFile(normalized);
```

We can then implement each method:

```java
public static List<Double> loadFromFile(String filepath) throws FileNotFoundException {
    File file = new File(filepath);
    Scanner scanner = new Scanner(file);
    List<Double> numbers = new ArrayList<>();
    while (scanner.hasNextDouble()) {
        double number = scanner.nextDouble();
        numbers.add(number);
    }
    scanner.close();
    return numbers;
}

public static double mean(List<Double> numbers) {
    double sum = 0;
    for (double f : numbers) {
        sum += f;
    }
    return sum / numbers.size();
}

public static double std(List<Double> numbers, double mean) {
    double sumSquare = 0;
    for (double f : numbers) {
        double diff = f - mean;
        sumSquare += diff * diff;
    }
    return Math.sqrt(sumSquare / numbers.size());
}

public static List<Double> normalize(List<Double> numbers, double mean, double std) {
    List<Double> normalized = new ArrayList<>();
    for (double f : numbers) {
        normalized.add((f - mean) / std);
    }
    return normalized;
}

public static void writeToFile(List<Double> numbers) throws IOException {
    try (FileWriter fw = new FileWriter("output")) {
        for (double n : numbers) {
            fw.write(Double.toString(n));
            fw.write("\n");
        }
    }
    System.out.println("Wrote output file.");
}
```