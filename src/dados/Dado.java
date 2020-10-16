package dados;

public class Dado implements Runnable {
    Marcador marcador;
    public Dado(Marcador marcador) {
        this.marcador = marcador;
    }

    @Override
    public void run() {
        for(int i=0; i<10000; i++){
            int valor_tirada = (int) (Math.random()*(1-7)+7);
            marcador.incremento(valor_tirada);
        }

    }
}
