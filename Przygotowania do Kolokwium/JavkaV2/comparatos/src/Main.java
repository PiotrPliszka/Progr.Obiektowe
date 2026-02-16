import zad1.*;


void main() {
    Employee e1 = new Employee("Piotr", 20.20, LocalDate.of(2002, 3, 20));
    Employee e2 = new Employee("Piotr", 50.20, LocalDate.of(2002, 3, 20));
    Employee e3 = new Employee("Piotr", 0.20, LocalDate.of(2002, 3, 20));
    ArrayList<Employee> list = new ArrayList<>(Arrays.asList(e1, e2, e3));
    for (Employee e : list){
        System.out.println(e);
    }
    Collections.sort(list);
    for (Employee e : list){
        System.out.println(e);
    }


}
