
public abstract class Animal extends serVivo{
    String nombre;
    int edad;

    public Animal(String nombre, int edad, String raza){
        super(raza);
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String nutrientes(){
        System.out.println("se alimentan de carne");
        String animalito = "alimentado";


        //System.out.println(edad);
        //System.out.println(nombre);
        //System.out.println(raza);

        return animalito;
    }
}
