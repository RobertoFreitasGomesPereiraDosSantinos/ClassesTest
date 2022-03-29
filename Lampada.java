public class Lampada {
    
    public String cor = "branco";
    public int voltagem = 220;
    public String marca = "lg";
    public int watts = 6;

    public void ligar() {
        System.out.println("Plimmm");
    }
    public void print() {
        System.out.println("cor: "+cor);
        System.out.println("voltagem: "+voltagem);
        System.out.println("marca: "+marca);
        System.out.println("watts: "+watts);
    }
}
