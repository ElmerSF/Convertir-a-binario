/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidorbinario;

/**
 *
 * @author elmer
 */
public class formulaapasar {
    public int numeroinicial = 19;
  public String numerofinal="";
   public int residuo;
   public int resultado;
  public int base = 2;
  public String cadena="";
    int res, cont =0;
    int suma=0;
    
     public void convertir(int numeroinicial, int base){
        
    if(numeroinicial<base){
        
        cadena =(resultado+numerofinal);
    }
    else{
        residuo = numeroinicial%base;
        resultado = numeroinicial/base;
        numeroinicial=resultado;
        numerofinal=(residuo+numerofinal);
        
        convertir(numeroinicial, base);
    }
        
        
    }
    
    
}
