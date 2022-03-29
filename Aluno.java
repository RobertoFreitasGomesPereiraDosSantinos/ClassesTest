public class Aluno {
    private String inteligencia = "130QI";
    public float altura = 1.65f;
    private float pesoKG = 57;
    public String style = "neo generation";

    public void chorar() {
        System.out.println("*lagrimas a cair*");
    }
    public void print() {
        System.out.println("Inteligência: "+inteligencia);
        System.out.println("Altura: "+altura);
        System.out.println("peso em KG"+pesoKG);
        System.out.println("estilo: "+style);
    }
}
