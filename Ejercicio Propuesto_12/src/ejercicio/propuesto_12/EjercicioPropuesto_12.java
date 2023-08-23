package ejercicio.propuesto_12;

public class EjercicioPropuesto_12 {
   
    public static void main(String[] args) {
        int horastra;
        int hora;      
        float porcentaje = 0.125f;
        horastra = 48;
        hora = 5000;
        int semana = horastra*5000;
        int mes = semana*4;
        float retencion = mes*porcentaje;
        int retencionentero = (int) retencion;
        int neto = mes - retencionentero;
        System.out.println("El salario bruto es: " + mes);  
        System.out.println("La retención de la fuente es: " + retencionentero);
        System.out.println("El salario neto es: " + neto);
    }
}
