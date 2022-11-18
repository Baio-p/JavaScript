
public class RecibiMascota {

    private String nombrePerro;
    private int edad;
    private String raza;
    private String tamanio;
    private String nombreDuenio;

    public RecibiMascota(String nombrePerro, int edad, String raza, String tamanio, String nombreDuenio) {

        this.nombrePerro = nombrePerro;
        this.edad = edad;
        this.raza = raza;
        this.tamanio = tamanio;
        this.nombreDuenio = nombreDuenio;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

}