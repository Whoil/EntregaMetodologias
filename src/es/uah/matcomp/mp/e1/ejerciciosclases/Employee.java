package es.uah.matcomp.mp.e1.ejerciciosclases;

// Clase que representa un empleado con datos básicos
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor que inicializa todos los atributos
    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName= firstName;
        this.lastName= lastName;
        this.salary= salary;
    }

    // Devuelve el id del empleado
    public int getId(){
        return id;
    }

    // Devuelve el nombre
    public String getFirstName(){
        return firstName;
    }

    // Devuelve el apellido
    public String getLastName(){
        return lastName;
    }

    // Devuelve el nombre completo (nombre + apellido)
    public String getName(){
        return firstName + lastName;
    }

    // Devuelve el salario mensual
    public int getSalary(){
        return salary;
    }

    // Modifica el salario solo si es positivo
    public void setSalary(int newSalary){
        if (newSalary < 0){
            System.out.println("Error, el salario debe ser positivo");
        }
        else {
            salary = newSalary;
        }
    }

    // Devuelve el salario anual
    public int getAnnualSalary(){
        return salary * 12;
    }

    // Aumenta el salario según un porcentaje
    public int raiseSalary(int percent){
        this.salary = salary + (salary * percent / 100);
        return salary;
    }

    // Devuelve la información del empleado en formato texto
    public String toString(){
        return "Employee[id=" + id + ",name=" + firstName + lastName + ",salary=" + salary + "]";
    }
}
