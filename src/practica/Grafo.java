
package practica;

public class Grafo {
   
    int aristas;
    int numVert = 15;
    
   public int [][] crearGrafo(){
        int [][] grafo = new int[numVert+1][numVert+1];
        aristas = 25;   
        grafo[1][2] = 300;
        grafo[1][8] = 800;
        grafo[2][3] = 450;
        grafo[2][6] = 220;
        grafo[2][8] = 770;
        grafo[3][4] = 445;
        grafo[3][7] = 125;
        grafo[4][5] = 906;
        grafo[4][6] = 880;
        grafo[5][15] = 361;
        grafo[6][5] = 140;
        grafo[6][13] = 75;
        grafo[7][4] = 308;
        grafo[8][9] = 930;
        grafo[8][10] = 335;
        grafo[8][11] = 460;
        grafo[9][14] = 440;
        grafo[10][6] = 23;
        grafo[10][13] = 326;
        grafo[11][10] = 106;
        grafo[11][12] = 173;
        grafo[12][9] = 220;
        grafo[13][11] = 406;
        grafo[14][13] = 320;
        grafo[14][15] = 348;
        
        return grafo;
  }
    
}
