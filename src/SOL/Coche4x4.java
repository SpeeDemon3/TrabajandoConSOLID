package SOL;

public class Coche4x4 extends Coche{

    boolean suspension = true;


    @Override
    public boolean acelerar() {
        return false;
    }

    @Override
    public boolean frenar() {
        return true;
    }

    @Override
    public boolean subirVentanas() {
        return true;
    }

    @Override
    public boolean recibirMantenimiento() {
        return false;
    }

    public boolean getAjustarsuspension() {
        return suspension;
    }


}
