public class Cadeira {
    
    public float altura = 100;
    public float largura = 30;
    public float comprimento = 30;
    protected String material = "madeira";

    public void estalar() {
        System.out.println("tec tec tec");
    }
    public void print() {
        System.out.println("altura em centimetros: "+altura);
        System.out.println("largura em centimetros: "+largura);
        System.out.println("comprimento em centimetros: "+comprimento);
        System.out.println("material: "+material);
    }
}
