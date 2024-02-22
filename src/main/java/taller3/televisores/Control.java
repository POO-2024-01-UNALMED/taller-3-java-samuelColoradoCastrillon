package taller3.televisores;

public class Control {
    //Atributos
    private TV tv;

    //Métodos
    public TV getTv() {
        return tv;
    }
    public void setTv(TV tv) {
        this.tv = tv;
    }
    public void turnOn() {
        tv.estado = true;
    }
    public void turnOff() {
        tv.estado = false;
    }
    public void canalUp() {
        if (tv.canal < 120 && tv.estado) {
            ++tv.canal;
        }
    }
    public void canalDown() {
        if (tv.canal > 1 && tv.estado) {
            --tv.canal;
        }
    }
    public void volumenUp() {
        if (tv.volumen < 7 && tv.estado) {
            ++tv.volumen;
        }
    }
    public void volumenDown() {
        if (tv.volumen > 0 && tv.estado) {
            --tv.volumen;
        }
    }
    public void setCanal(int canal) {
        if (canal >= 1 && canal <= 120 && tv.estado) {
            tv.canal = canal;
        }
    }
    public void setVolumen(int volumen) {
        if (volumen >= 0 && volumen <= 7 && tv.estado) {
            tv.volumen = volumen;
        }
    }
    public void enlazar(TV tv) {
        this.tv = tv;
        this.tv.setControl(this);
    }
}
