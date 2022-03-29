public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-----Aluno-----");
        Aluno al = new Aluno();
        al.print();        
        System.out.println("-----Microondas-----");
        Microondas mic = new Microondas();
        mic.print();
        System.out.println("-----Cadeira-----");
        Cadeira cad = new Cadeira();
        cad.print();
        System.out.println("-----DataShow-----");
        DataShow ds = new DataShow();
        ds.print();
        System.out.println("-----Lampada-----");
        Lampada lam = new Lampada();
        lam.print();
        System.out.println("-----Tevelisao-----");
        Tevelisao tv = new Tevelisao();
        tv.print();
        System.out.println("-----Elevador-----");
        Elevador el = new Elevador();
        el.toString();
    }
}
