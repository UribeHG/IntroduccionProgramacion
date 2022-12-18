public class main {
    
        public static void main(String[] args) {
            suma(18, 38, 23);

            auto coche = new auto("mazda", "CX-5", 1500, 8, 150);

            coche.agregar_puertas (1);

            System.out.println("La cantidad de puertas es " + coche.puertas);
        }

        public static void suma( int a, int b, int c) {
            int resultado;
            resultado = a + b + c;
            System.out.println(resultado);
        }


    }

