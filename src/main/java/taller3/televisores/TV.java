package taller3.televisores;

public class TV {
    //Atributos
    private Marca marca;
    public int canal = 1;
    private int precio = 500;
    public boolean estado;
    public int volumen = 1;
    private Control control;
    private static int numTV;

    //Constructores
    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
    }

    //Métodos
    public Marca getMarca() {
        return marca;
    }
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getVolumen() {
        return volumen;
    }
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    public Control getControl() {
        return control;
    }
    public void setControl(Control control) {
        this.control = control;
    }
    public static int getNumTV() {
        return numTV;
    }
    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }
    public void turnOn() {
        estado = true;
    }
    public void turnOff() {
        estado = false;
    }
    public boolean getEstado() {
        return estado;
    }
    public void canalUp() {
        if (canal < 120 && estado) {
            ++canal;
        }
    }
    public void canalDown() {
        if (canal > 1 && estado) {
            --canal;
        }
    }
    public void volumenUp() {
        if (volumen < 7 && estado) {
            ++volumen;
        }
    }
    public void volumenDown() {
        if (volumen > 0 && estado) {
            --volumen;
        }
    }
}
