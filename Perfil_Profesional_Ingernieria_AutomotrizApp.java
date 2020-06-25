//EXPERIENCIA_PERFIL_PROFESIONAL

package perfil_profesional_ingernieria_automotriz;

/**
 *
 * @author hp
 */
class Perfil_Profesional_Ingernieria_Automotriz {
//atributos
    private String ingeniero;
    private double experiencia_laboral;
    
//constructores
public Perfil_Profesional_Ingernieria_Automotriz(String ingeniero){
    this(ingeniero, 2);//SOBRECARGA
}
public Perfil_Profesional_Ingernieria_Automotriz(String ingeniero, double experiencia_laboral){
    this.ingeniero = ingeniero;
      //SI la experiencia_laboral en anios es menor que 2 anios
      //LO PONEMOS a CERO o no ESTA CONTRATADO
      if(experiencia_laboral< 2){
           this.experiencia_laboral= 2;
      }else{
          this.experiencia_laboral= experiencia_laboral;
      }
}


    //metodos
    public void setIngeniero(String ingeniero){
        this.ingeniero=ingeniero;
    }
    public String getIngeniero(){
        return ingeniero;
    }
    
    public void setExperiencia_Laboral(double experiencia_laboral){
        this.experiencia_laboral= experiencia_laboral;
}
    public double getExperiencia_Laboral(){
        return experiencia_laboral;
    }
    
  public void Contratar_Ingeniero(double experiencia_laboral){
        if(experiencia_laboral > 2){
            this.experiencia_laboral += experiencia_laboral;
            
            //experiencia_labora += experiencia_laboral 
            //(experiencia_labora que tengo)+experiencia (que voy a ganar dentro de esa empresa)
        }
    }
  //si la experiencia_laboral es menor a 2 anios
  //se da de baja ala carpeta y nose contrata al ingeniero
  public void Dar_Baja_Carpeta (double experiencia_laboral){
        if(experiencia_laboral < 2){
            this.experiencia_laboral = experiencia_laboral;
        }
        else{
            this.experiencia_laboral -=experiencia_laboral;
         }//experiencia_laboral -= experiencia_laboral (que tiene) - experiencia laboral (que piden)
    }
    @Override
    public String toString (){
        return"el Ingeniero Automotriz "+ingeniero+" posee una experiencia laboral de "+experiencia_laboral+
                " anios fuera de la universidad";
    }
}     
  //clase ejecutable
 public class Perfil_Profesional_Ingernieria_AutomotrizApp{
     
     public static void main (String [] args){

Perfil_Profesional_Ingernieria_Automotriz postulante1= new Perfil_Profesional_Ingernieria_Automotriz("Jhonatan Hidalgo");
Perfil_Profesional_Ingernieria_Automotriz postulante2= new Perfil_Profesional_Ingernieria_Automotriz("Juan Rea", 5);
     
 //ingreso la experiencia en anios de cada postulante
       postulante1.Contratar_Ingeniero(2);
       postulante2.Contratar_Ingeniero(8);
       
       //se disminuye cierto tiempo que nop es considerado experiencia laboral
       //al estar dentro de la universidad
       postulante1.Dar_Baja_Carpeta(6);
       postulante2.Dar_Baja_Carpeta(5);
       
       // presentacion de informacion de los postulantes
       System.out.println(postulante1);
       System.out.println(postulante2);    
       
      if (postulante1.getExperiencia_Laboral()> postulante2.getExperiencia_Laboral()){
        System.out.println(postulante1.getExperiencia_Laboral()+" nes mas experiencia laboral, por lo tanto dicho ingeniero, esta contratado");
    }
    else{
            System.out.println(postulante2.getExperiencia_Laboral()+" es mas experiencia laboral, por lo tanto dicho ingeniero esta contratado");
            }
 }}

   
