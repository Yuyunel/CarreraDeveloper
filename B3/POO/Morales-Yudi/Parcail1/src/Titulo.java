public abstract class Titulo {
    private int cantMaterias;
    private String fechaInicio;
    private String fechaFinalizacion;
    private boolean selladoMinisterio;
    private boolean selladoInstituto;


    public Titulo(int cantMaterias, String fechaInicio, String fechaFinalizacion, boolean selladoMinisterio, boolean selladoInstituto) {
        this.cantMaterias = cantMaterias;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.selladoMinisterio = selladoMinisterio;
        this.selladoInstituto = selladoInstituto;
    }

    public Titulo() {

    }

    public void ejercer() {
        if(selladoMinisterio && selladoInstituto ){
            System.out.println("Puede ejercer ");

        }else {
            System.out.println("no puede ejercer");

        }

    }

    public int getCantMaterias() {
        return cantMaterias;
    }

    public void setCantMaterias(int cantMaterias) {
        this.cantMaterias = cantMaterias;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(String fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public boolean isSelladoMinisterio() {
        return selladoMinisterio;
    }

    public void setSelladoMinisterio(boolean selladoMinisterio) {
        this.selladoMinisterio = selladoMinisterio;
    }

    public boolean isSelladoInstituto() {
        return selladoInstituto;
    }

    public void setSelladoInstituto(boolean selladoInstituto) {
        this.selladoInstituto = selladoInstituto;
    }
}
