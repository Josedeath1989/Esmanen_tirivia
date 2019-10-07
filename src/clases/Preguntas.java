
package clases;


public class Preguntas {
    
    String[] preguntas = {
        "¿Cuál es el lugar más frío de la tierra?", "¿Quién escribio la 0disea?", "¿En qué continente esta Ecuador ?",
        "¿Donde originaron los olímpicos?", "¿Cuál es el río más largo del mundo?", "¿Quién es el autor de el Quijote?", 
        "¿Quién pinto La ultima cena?", "¿Como se demonina el resultado de la multiplicación?", "¿Cuál es el Océano más grande?",
        "¿Que año llegó Critóbal Colón a América?", "¿Quién es el famoso Rey del Rock en los Estados Unidos?", "¿Cuál es el país más grande del mundo?", "¿Cuánto vale el número de PI?"   
    };
    
   public String getPregunta(int posicion){
        return preguntas[posicion];
    }
    
}
