public class auto {
    // atributos de la clase coche
    String marca;
    String modelo;
    int peso;
    int puertas;
    int velocidad_maxima;

    public auto (String s_marca, String s_modelo, int i_peso, 
                                int i_puertas, int i_velocidad_maxima) {
        this.marca = s_marca;
        this.modelo = s_modelo;
        this.peso = i_peso;
        this.puertas = i_puertas;
        this.velocidad_maxima = i_velocidad_maxima;

        if (i_velocidad_maxima > 300) {
            i_velocidad_maxima = 300;
        } 


    }

    public void agregar_puertas( Integer i_nro_puertas){
        this.puertas += i_nro_puertas;
    }

}
