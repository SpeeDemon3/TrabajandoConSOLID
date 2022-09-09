package SOL;

public class CocheDescapotable extends Coche{

    String descapotar;
    @Override
    public boolean acelerar() {
        return true;
    }

    @Override
    public boolean frenar() {
        return false;
    }

    @Override
    public boolean subirVentanas() {
        return false;
    }

    @Override
    public boolean recibirMantenimiento() {
        return true;
    }

    public String getDescapotar() {
        return "si";
    }
}
