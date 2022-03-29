public class Tevelisao {
    
    protected boolean estado = false;
    public String modelo = "LCD";
    public float polegadas = 20;
    public String marca = "sansung";

    public void clickButtonPower() {
        estado = !estado;
    }
    public void print() {
        if (estado) {
            System.out.println("estado: Ligada");
        } else {
            System.out.println("estado: Desligada");
        }
        System.out.println("modelo: "+modelo);
        System.out.println("polegadas: "+polegadas);
        System.out.println("marca: "+marca);
    }
}
