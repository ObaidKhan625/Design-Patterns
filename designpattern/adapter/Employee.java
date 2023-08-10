package net.media.training.designpattern.adapter;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 21, 2011
 * Time: 4:58:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class Employee {
    private String name;
    // ?
    private static Map<String, Employee> employeeMap = new Hashtable<String, Employee>();
    
    public Employee(String name) {
        this.name = name;
        employeeMap.put(name, this);
    }

    public String getName() {
        return name;
    }

    public static Employee getEmployeeFromName(String name) {
        return employeeMap.get(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return !(name != null ? !name.equals(employee.name) : employee.name != null);

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
