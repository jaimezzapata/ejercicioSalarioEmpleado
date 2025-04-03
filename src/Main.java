import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        * Una empresa desea registrar la información de cada empleado
        * Para ello un empleado debe ingresar con su usuario y contraseña
        * Una vez ingresado el empleado debe registrar la siguiente información
        * 1 - Nombre completo
        * 2 - Documento de identidad
        * 3 - Valor de la hora
        * 4 - Cantidad de horas
        * 5 - Seleccionar un día de descanso a la semana (L-V)
        * EL sistema le debe mostrar al empleado:
        * Su salario Neto, Salario Bruto, Deducción por Pensión, Deducción
        * por salud, auxilio de transporte (si aplica) y bonificación del 10%
        * si no supera 2 SMMLV (sin incluir auxilio de transporte)
        * Toda la información del empleado se debe mostrar en un mensaje descriptivo
        * */

        /* Definición y asignación de variables */
        Scanner sc = new Scanner(System.in);
        String nombreEmpleado = "";
        String documentoIdentidad = "";
        String diaDescanso = "";
        String usuarioEmpleado = "";
        String contrasenaUsuario = "";
        double salarioBruto = 0;
        double salarioNeto = 0;
        double retencionSalud = 0;
        double retencionPension = 0;
        double valorHora = 0;
        double cantidadHoras = 0;
        double bonificacionEmpleado = 0;
        int auxilioTransporte = 200000;

        System.out.print("Ingrese su usuario: ");
        usuarioEmpleado = sc.nextLine();
        System.out.print("Ingrese su contraseña: ");
        contrasenaUsuario = sc.nextLine();
        if(usuarioEmpleado.equals("admin") && contrasenaUsuario.equals("admin")){
            System.out.println("Ha ingresado de forma correcta");
        } else {
            System.out.println("Error de credenciales");
        }

        /*if(usuarioEmpleado.equals("admin")){
            if(contrasenaUsuario.equals("admin")){
                System.out.println("Bienvenido al sistema");
            }
        }*/
    }
}