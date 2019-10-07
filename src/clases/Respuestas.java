
package clases;

import java.util.StringTokenizer;

public class Respuestas {

    String[] respuestas = {
      "ANTARTIDA","HOMERO","NILO","AMERICA","GRECIA","MIGUEL DE CERVANTES","LEONARDO DA VINCI","PRODUCTO","PACIFICO","1492","ELVIS PRESLEY","RUSIA","3,1416"
    };
    
    String[] radioR = {
        "ANTARTIDA,SUECIA,POLO SUR ,POLO NORTE, POLO SUUR",
        "EURIPIDES,SOFOCLES,HOMERO,GABO",
        "MISISIPI,DANUBIO,NILO,AMAZONAS",
        "AFRICA,AMERICA,ASIA,OCEANIA",
        "GRECIA,RUSIA,BRASIL,COLOMBIA",
        "GABRIEL GRACIA MARQUEZ","DAVID SANCHES","MIGUEL DE CERVANTES","ERNESTO SABATO",
        "PÁBLO PICASSO","LEONARDO DA VINCI","FRANCISCO DE GOYA","BOTERO",
        "PRODUCTO","DIVISOR","SUSTRAENDO","LOGARITMO",
        "PACIFICO","ATLANTICO","ARTICO","LAGO TIMIZA",
        "1972","1510","1492","2012",
        "ELVIS PRESLEY","JHON LENNON","BOB MARLY","OZZY",
        "BRAZIL","RUSIA","FRANCIA","CHINA",
        "3,1482","2,1216","3,1416","3,1212"
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[12];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}
