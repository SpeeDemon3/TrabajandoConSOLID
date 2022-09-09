package SOL;

public class cocheFamiliar extends Coche{

    int sillasBebe = 2;

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
        return false;
    }

    @Override
    public boolean recibirMantenimiento() {
        return true;
    }

    public int getSillasBebe(){
        return sillasBebe;
    }
}
