/**
 * Array based storage for Employees
 */
public class ArrayStorage {
    Employee[] storage = new Employee[10000];
    static int number = 0;

    void clear() {
        for (int i = 0; i <= number; i++) {
            this.storage[i] = null;
            number = 0;
        }
    }

    void save(Employee employee) {
        this.storage[number] = employee;
        number++;
    }

    Employee get(String uuid) {
        for (int i = 0; i < number; i++) {
            if (this.storage[i].uuid.equals(uuid)) {
                return storage[i];
            }
        }
        System.out.println("No such employee");
        return null;
    }

    void delete(String uuid) {
        for (int i = 0; i < number; i++) {
            if (this.storage[i].uuid.equals(uuid)) {
                this.storage[i] = this.storage[number - 1];
                this.storage[number - 1] = null;
                number--;
            }
        }
    }

    /**
     * @return array, contains only Employees in storage (without null)
     */
    Employee[] getAll() {
        Employee[] allEmployees = new Employee[number];
        for (int i = 0; i < number; i++) {
            allEmployees[i] = this.storage[i];
        }
        return allEmployees;
    }

    int size() {
        return number;
    }
}
