package projetoclasseabstrata;

class Circulo extends Forma{

    @Override
    public void desenhar() {
        System.out.println("Desenhando um circula"); 
   }
    public void informacoes() {
        System.out.println("Raio + o Pi");
    }
    
}
