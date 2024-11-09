import java.util.ArrayList;
import java.util.Scanner;

class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    // Constructor
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    // Métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    // Método para imprimir datos
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
}

class GestorEmpleados {
    private ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
    }

    public void mostrarEmpleados() {
        for (Empleado empleado : listaEmpleados) {
            empleado.imprimirDatos();
            System.out.println("------------------");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        GestorEmpleados gestor = new GestorEmpleados();

        // Crear empleados y agregarlos al gestor
        Empleado empleado1 = new Empleado("Juan Pérez", 30, 2500);
        gestor.agregarEmpleado(empleado1);

        Empleado empleado2 = new Empleado("María López", 25, 3000);
        gestor.agregarEmpleado(empleado2);

        // Mostrar los empleados
        gestor.mostrarEmpleados();
    }
}