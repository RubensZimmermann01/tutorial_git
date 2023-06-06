
import carro.Carro;

public class CarrosApp {
    
    public static void main(String[] args) throws Exception {
      
        criar("nivus", "verde", 2021);
    }

        public static void criar(String modelo, String cor, float ano) {
            Carro carro = new Carro();
            carro.cor = cor;
            carro.modelo = modelo;
            carro.ano = ano;
        
    
            carro.status();
        
    }
}
