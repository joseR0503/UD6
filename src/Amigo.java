public class Amigo {
   private String nombre;
    private String telefono;
   private boolean asistencia;
   private static final int LONG_TELF=9;

   // constructor con y sin parametros

   public Amigo(){
    this.nombre=null;
    this.telefono=null;
    this.asistencia=false;

   }

   public Amigo( String nombre, String telefono, boolean asistencia){
    this.nombre= nombre;
    this.setTelefono(telefono);
    this.asistencia= asistencia;
   }

   // getters y setters

   public String getNombre(){
    return this.nombre;
   }
   public void setNombre(String nombre){
    this.nombre=nombre;
   }
   public String getTelefono(){
    return this.telefono;
   }

   public void setTelefono(String telefono){
    // comprobar antes de introducir que es telefono valido
    // tiene que tener 9 digitos
    // cada digito debe ser numerico
    // si no es correcto telefono=null
    this.telefono=null;
    
    if(telefono !=null) {
        if (telefono.length()==LONG_TELF){
            boolean correcto=true;
            int contador=0;
            while(correcto && contador<LONG_TELF){
                if (telefono.charAt(contador)<48 || telefono.charAt(contador)>57){
                    correcto=false;
                }else {
                    contador++;
                }
                // valorar porque he salido del while
                if (correcto=true){
                    this.telefono = telefono;
    
                }
            }
        }
       }
    }
   public boolean isAsistencia(){
    return this.asistencia;
   }

   public void setAsistencia(boolean asistencia){
    this.asistencia=asistencia;
   }

@Override
public String toString() {
    return "Amigo [nombre=" + nombre + ", telefono=" + telefono + ", asistencia=" + asistencia + "]";
}

}
