public class MainProgram {
    public static void main(String[] args) {
        LinkLst <Employee> employeesList = new LinkLst<>();
        employeesList.addFirst(new Employee("Иванов", 43));
        employeesList.addFirst(new Employee("Петров", 25));
        employeesList.addFirst(new Employee("Кузнецов", 32));
        employeesList.addFirst(new Employee("Смирнов", 55));
        employeesList.addFirst(new Employee("Тихонов", 19));
        employeesList.addFirst(new Employee("Ковалев", 22));

        System.out.println(employeesList);

        employeesList.reverse();

        System.out.println(employeesList);
    }
}
