public abstract class serVivo implements Alimento{
    protected String raza;

    public serVivo(String raza) {
        this.raza = raza;
    }

    public abstract String nutrientes();
}
