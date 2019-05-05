package numero1;

public class Robo implements Controle {
    @Override
    public void andar() {
        System.out.println("O robo esta andando");
    }

    @Override
    public void virar() {
        System.out.println("O robo esta virando");
    }

    @Override
    public void falar() {
        System.out.println("O robo esta falando");
    }
}
