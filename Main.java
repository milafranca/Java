class Carro {
    private String marca;
    private String modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void velocidade() {
        System.out.println("Este carro alcança uma velocidade máxima de aproximadamente 420km/h.");
    }


//    @Override
    @Override
    public String toString() {
        return "Carro: " + marca +" "+ modelo;
    }
}

class Carro2 extends Carro {
    public Carro2(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void velocidade() {
        System.out.println("Este carro alcança uma velocidade máxima de aproximadamente 350km/h.");
    }
}

class Carro3 extends Carro {
    public Carro3(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void velocidade() {
        System.out.println("Este carro alcança uma velocidade máxima de aproximadamente 330km/h.");
    }
}

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Bugatti", "Chiron");
        Carro2 carro2 = new Carro2("Lamborghini", "Aventator SVJ");
        Carro3 carro3 = new Carro3("Porsche", "911 Turbo S");

        System.out.println(carro1);
        carro1.velocidade();
        
		System.out.println(carro2);
        carro2.velocidade();
        
		System.out.println(carro3);
        carro3.velocidade();
        
    }
}

