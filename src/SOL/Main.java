package SOL;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche4x4();
        boolean estaAcelerando = coche1.acelerar();
        System.out.println("Esta acelerando: " + estaAcelerando);

        Coche coche2 = new CocheDescapotable();
        boolean arribaVentanas = coche2.subirVentanas();
        System.out.println("Las ventanas estan abiertas: " + arribaVentanas);

        Coche coche3 = new cocheFamiliar();
        boolean mantenimiento = coche3.recibirMantenimiento();
        System.out.println("Tienes el mantenimiento echo: " + mantenimiento);

    }
}
