public class TituloLicenciatura extends  Titulo implements Comparable<TituloLicenciatura> {
    private String temaTesis;
    private String fechaEntrgaTesis;
    private int cantTrabajo;

    public TituloLicenciatura(int cantMaterias, String fechaInicio, String fechaFinalizacion, boolean selladoMinisterio, boolean selladoInstituto, String temaTesis, String fechaEntrgaTesis, int  cantTrabajo) {
        super(cantMaterias, fechaInicio, fechaFinalizacion, selladoMinisterio, selladoInstituto);
        this.temaTesis = temaTesis;
        this.fechaEntrgaTesis = fechaEntrgaTesis;
        this.cantTrabajo = cantTrabajo;
    }

    @Override
    public int compareTo(TituloLicenciatura o) {
        int cantTrabajo = this.cantTrabajo;
        int cantTrabajoOtro = o.cantTrabajo;


        if(cantTrabajo > cantTrabajoOtro){
            return 1;
        } else if(cantTrabajo < cantTrabajoOtro){
            return -1;
        }
        return 0;
    }
}
