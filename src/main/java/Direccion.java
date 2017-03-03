class Direccion {
    private String cp;
    private String provincia;
    private String poblacion;

    Direccion(String cp, String provincia, String poblacion) {
        this.cp = cp;
        this.provincia = provincia;
        this.poblacion = poblacion;
    }

    public String getCp() {
        return cp;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public String toString() {
        return provincia + ", " + poblacion + ", " + cp;
    }
}
