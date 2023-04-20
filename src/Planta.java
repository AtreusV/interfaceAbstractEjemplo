

public abstract class Planta extends serVivo {
    String nombre;
    int numHojas;

    public Planta(String nombre, int numHojas, String raza) {
        super(raza);
        this.nombre = nombre;
        this.numHojas = numHojas;
    }

    @Override
    public String nutrientes(){
        System.out.println("se alimentan de agua");
        String animalito = "alimentado";
        return animalito;
    }

}