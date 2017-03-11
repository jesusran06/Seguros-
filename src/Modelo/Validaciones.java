

package Modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Validaciones 
{
    
public static int CStr_Integer(String numero) 
   { 
       Integer num; 
 
       	try {
		num=Integer.parseInt(numero);
		return num;
	} catch (NumberFormatException nfe){
		return -1;
	}
   }    
   //---------------------
   public static String Cint_String(int numero) 
   { 
       String num; 
 
	num= String.valueOf(numero);
	return num;
   }    
   //-----------------------------
   public static String Cbool_String(Boolean numero) 
   { 
       String num; 
 
	num= Boolean.toString(numero);
	return num;
   }    
   
   //-----------------------
      public static Float CStr_Float(String numero) 
   { 
       Float num; 
 
       	try {
		num=Float.parseFloat(numero);
		return num;
                
	} catch (NumberFormatException nfe){
		return -1.0f;
	}
   }    
//-----------------------------    
    
     public static void Aviso(String Mensaje,String CaptionWin) 
     {

      JOptionPane.showMessageDialog(null,
      Mensaje,
      CaptionWin,
      JOptionPane.WARNING_MESSAGE);
    }
     
//-----------------------------------     
   public static String getFechaActual() 
   {
      Date ahora = new Date();
      SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
      return formateador.format(ahora);
    }          
//--------------------------------
public static boolean isDate(String fechax)
 {
  try {
      SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
      formatoFecha.setLenient(false);
      formatoFecha.parse(fechax);
      return true;
  } catch (ParseException e) 
     {
      return false;
     }  
}     
//----------------------------------
public static Date CnvStringFecha(String fecha)
{
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    Date fechaDate = null;
    try {
        fechaDate = formato.parse(fecha);
    }
    catch (ParseException ex)
    {
        System.out.println(ex);
    }
    return fechaDate;
}

//---------------------------------
public static int DialogConfirm(String Pregunta,String Titulo) 
 {              
   int respuesta = JOptionPane.showConfirmDialog(null,
                                                 Pregunta,
                                                 Titulo,
                                                 JOptionPane.YES_NO_OPTION,     //Botones que apareceran                       
                                                 JOptionPane.QUESTION_MESSAGE); //Icono que se desea que aparezca
      
      return respuesta;
    }
//----------------------------------
 public static int Opciones(String Op1,String Op2,String Op3)
{        
  int optionType = JOptionPane.DEFAULT_OPTION;
int messageType = JOptionPane.PLAIN_MESSAGE; // no standard icon

Object[] selValues = { Op1, Op2, Op3 };

// Shows message, choices appear as buttons
int res = JOptionPane.showOptionDialog(null, "Selecciona una Opcion", "Accion",
                                       optionType, messageType,null ,
                                       selValues, selValues[0]);

return res;
}   
 public static int Opciones2(String Op1,String Op2,String Op3)
{        
  int optionType = JOptionPane.DEFAULT_OPTION;
int messageType = JOptionPane.PLAIN_MESSAGE; // no standard icon

Object[] selValues = { Op1, Op2, Op3 };

// Shows message, choices appear as buttons
int res = JOptionPane.showOptionDialog(null, "¿Seguro desea eliminarlo?", "Accion",
                                       optionType, messageType,null ,
                                       selValues, selValues[0]);

return res;
}    
 
//-----------------------------
 public static int Generar_Aleatorio(int limite) 
 { 
    return (int) (Math.random()*limite+1)-1;
 }
//----------------------------------------
public static Date sumarFechasDias(Date fch, int dias) 
    {
        Calendar cal = new GregorianCalendar();
        cal.setTimeInMillis(fch.getTime());
        cal.add(Calendar.DATE, dias);
        return new java.sql.Date(cal.getTimeInMillis());
    } 

//------------------------------
public static String Apost(String Texto)
    {
         return "'"+Texto+"'";    
    }   


}