package projetoclasseabstrata;

public class ProjetoClasseAbstrata {

    public static void main(String[] args) {
        Forma f = new Circulo();
        f.desenhar();
        f.informacoes();
        Forma fe = new Retangulo();
        fe.desenhar();
        fe.informacoes();
        Forma fi = new Quadrado();
        fi.desenhar();
        fi.informacoes();
    }

}
