
public class Pez{
    private String  tipo;
    private double  tamaño;
    private String  tipoDeAgua;
    private String  color;
    //Solo se consideran 2 tipos de agua : dulce y salada
 public Pez(String tipoPez, double tam, String agua, String color){
    tipo       = tipoPez;
    tamaño     = tam;
    this.color = color;
    tipoDeAgua = agua;
    }
 public boolean estaVivo(String tipoDeAgua){
    boolean estaVivo;
    if(this.tipoDeAgua == tipoDeAgua){
       estaVivo = true;
      }else{
            estaVivo = false;
           }
    return estaVivo;       
    }
 public double crecer(double tam){
    if(tam >= 0){
       tamaño = tamaño + tam;
      }
    return tamaño;
    }
 public String getTipo(){
    return tipo; 
 }
 public double getTamaño(){
    return tamaño;
 }
 public String getTipoDeAgua(){
    return tipoDeAgua;
 }
 public String getColor(){
    return color;
 }
 public String setTipo(String tipo){
    this.tipo = tipo;
    return tipo; 
 }
 public double setTamaño(double tam){
    tamaño = tam; 
    return tamaño;
 }
 public String setTipoDeAgua(String agua){
    tipoDeAgua = agua; 
    return tipoDeAgua;
 }
 public String setColor(String color){
    this.color = color; 
    return color;
 }
}
