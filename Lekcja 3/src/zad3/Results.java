
package zad3;

import java.util.Arrays;
import java.util.Objects;

public class Results {
    private String firstName;
    private String lastName;
    private int[] results;

    public Results(String firstName, String lastName, int size) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.results = new int[size];
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int[] getResults() {
        return results;
    }

    public void setResults(int[] results) {
        this.results = results;
    }

    //Dodawanie wyniku
    public void addResult(int index, int result) {
        if (index >= 0 && index < results.length) {
            results[index] = result;
        } else {
            throw new IndexOutOfBoundsException("Nieprawidłowy indeks: " + index);
        }
    }

    //Obliczanie średniego wyniku
    public double averageResult() {
        if (results.length == 0) return 0.0;

        int sum = 0;
        for (int r : results) {
            sum += r;
        }
        return (double) sum / results.length;
    }

    @Override
    public String toString() {
        return String.format(
                "Results for %s %s: Average Score = %.2f, Results: %s.",
                firstName,
                lastName,
                averageResult(),
                Arrays.toString(results)
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Results)) return false;

        Results other = (Results) obj;
        return Objects.equals(firstName, other.firstName)
                && Objects.equals(lastName, other.lastName)
                && Arrays.equals(results, other.results);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstName, lastName);
        result = 31 * result + Arrays.hashCode(results);
        return result;
    }

}

