public class TitiuloTerciario extends Titulo{

    private String validacion;

    public TitiuloTerciario(int cantMaterias, String fechaInicio, String fechaFinalizacion, boolean selladoMinisterio, boolean selladoInstituto, String validacion) {
        super(cantMaterias, fechaInicio, fechaFinalizacion, selladoMinisterio, selladoInstituto);
        this.validacion = validacion;
    }

   public boolean validarNacional(){

        return true;

    }

}
