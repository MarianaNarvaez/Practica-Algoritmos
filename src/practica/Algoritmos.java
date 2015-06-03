
package practica;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
/**
/**
 *
 * @author Mariana Narvaez
 * @autor Alejandra Colorado 
 *
 */
public class Algoritmos {
    
     int max;
     int fin;
     int[] adyacente;
     Queue<Integer> pila;
     int numvert;
     boolean[] visitado;
     Panel2 resul;
 
     public Algoritmos(){}    
     
     public Algoritmos(int vert){
       this.numvert = vert;
       this.pila = new LinkedList<Integer>();
       adyacente = new int[numvert + 1];
       visitado = new boolean[numvert + 1];		
    
     }


     public int max(int n){
        Grafo grafo = new Grafo();
        Algoritmos al = new Algoritmos(grafo.numVert);
        return al.fordFulkerson(grafo.crearGrafo(), 1, n);
     }  

     public static void main(String[] args){
        Frame f = new Frame();
        f.setVisible(true);
     }
     
     public int fordFulkerson(int grafo[][], int nodOri, int destino){
        int c, d;
        int maxFlujo = 0;
        int camFlujo;

        int[][] grafoResidual = new int[numvert + 1][numvert + 1];
        for (int i = 1; i <= numvert; i++){
           for (int j = 1; j <= numvert; j++){
               grafoResidual[i][j] = grafo[i][j];
            }
        }

        while (bfs(grafoResidual,nodOri ,destino)){
           camFlujo = Integer.MAX_VALUE;
           for (d = destino; d != nodOri; d = adyacente[d]){
               c = adyacente[d];
               camFlujo = Math.min(camFlujo, grafoResidual[c][d]);
            }
           for (d = destino; d != nodOri; d = adyacente[d]){
               c = adyacente[d];
               grafoResidual[c][d] -= camFlujo;
               grafoResidual[d][c] += camFlujo;
            }
           maxFlujo += camFlujo;	
        }

        return maxFlujo;
    }
     
    public boolean bfs(int grafo[][], int origen, int destino){
        boolean camEncon = false;
        int recorColu, elemFila;

        for(int i = 1; i <= numvert; i++){
            adyacente[i] = -1;
            visitado[i] = false;
        }

        pila.add(origen);
        adyacente[origen] = -1;
        visitado[origen] = true;

        while (!pila.isEmpty()){ 
            elemFila = pila.remove();
            recorColu = 1;

            while (recorColu <= numvert){
               if (grafo[elemFila][recorColu] > 0 &&  !visitado[recorColu]){
                  adyacente[recorColu] = elemFila;
                  pila.add(recorColu);
                  visitado[recorColu] = true;
                }
                recorColu++;
            }
        }
        if(visitado[destino]){
            camEncon = true;
        }
        return camEncon;
        }
    
}
