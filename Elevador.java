public class Elevador {
    private float metQ = 25;
    private float metC = 5;
    protected String music = "comatose";
    private String material = "Titânio";

    public void subir() {
        System.out.println("*subindo...*");
    }

    @Override
    public String toString() {
        return "material:" + material + "\nmetros cubicos:"+ metC + "\nmetros quadrados:" + metQ + "\nmusica:" + music;
    }
}
