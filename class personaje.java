class personaje{

    String nombre;
    String clase;
    int nivel;
    int puntosVida;
    int puntosExperiencia;
    int salud;

public personaje(String nombre, String clase, int nivel, int puntosVida, int salud, int puntosExperiencia){
    this.nombre = nombre;
    this.clase = clase;
    this.nivel = nivel;
    this.puntosVida = 100;
    this.puntosExperiencia = puntosExperiencia;
    this.salud = 100;
}

void recibirDaño(int daño){

this.puntosVida -= daño; 
if(this.puntosVida <= 0){
this.puntosVida = 0;
System.out.println("=====================================================================================================================");
System.out.println("[DAÑO] " + this.nombre + " recibió " + daño + " de daño y ha sido DERROTADO.");
    } else {
          System.out.println("=============================================================================================================");
        System.out.println("[DAÑO] " + this.nombre + " recibió " + daño + " de daño. Salud restante: " + this.puntosVida + "/" + this.salud);
        System.out.println("=============================================================================================================");
    }
}

void curacion(int cantidadCuracion){

this.puntosVida += cantidadCuracion;
if (this.puntosVida > this.salud) {
        this.puntosVida = this.salud;
          System.out.println("=============================================================================================================");
System.out.println("[CURACIÓN] " + this.nombre + " recuperó " + cantidadCuracion +  " de salud. Salud actual: " + this.puntosVida + "/" + this.salud);
  System.out.println("=============================================================================================================");
}
}

void experiencia(int puntosGanados){
    this.puntosExperiencia += puntosGanados;
      System.out.println("=============================================================================================================");
    System.out.println("[EXP] " + this.nombre + " ganó " +puntosGanados + " puntos de experiencia.");

    int xpNecesaria = 100;
    while (this.puntosExperiencia >= xpNecesaria) {
        this.nivel++;
        this.puntosExperiencia -= xpNecesaria;               
        this.puntosVida = this.salud;   

        System.out.println("¡SUBIDA DE NIVEL! " + this.nombre + " alcanzó el Nivel " + this.nivel + "!");
        System.out.println("-> Salud máxima aumentada a: " + this.salud + " (Salud restaurada)");
          System.out.println("=============================================================================================================");
    }
}

void mostrarInformacion(){
    System.out.println("================================");
    System.out.println("Nombre: " + nombre);
    System.out.println("Clase: " + clase);
    System.out.println("Nivel: " + nivel);
    System.out.println("Puntos de vida: " + puntosVida);
    System.out.println("Puntos de experiencia: " + puntosExperiencia);
    System.out.println("================================");
}

public static void main(String[] args) {
    
personaje p1 = new personaje("Lanzallamas432", "Fusilero", 0, 100, 100, 0);
personaje p2 = new personaje("Jja50020", "Apoyo", 0, 100, 100, 0);

p1.recibirDaño(50);
p1.curacion(10);
p1.experiencia(150);
p1.mostrarInformacion();


p2.recibirDaño(75);
p2.experiencia(643);
p2.mostrarInformacion();
}
}















    
