
import ucn.*;

import java.awt.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        double min = -2.0;
        double max = 2.0;

        int escala1 = -10;
        int escala2 = 10;
        StdDraw.setXscale(-10,10);
        StdDraw.setYscale(-10,10);

        double x0 = min + (max-min) * Math.random();
        double y0 = min + (max-min) * Math.random();

        double x1 = min + (max-min) * Math.random();
        double y1 = min + (max-min) * Math.random();

        double velocidadX = 0.25 + (0.5-0.25) * Math.random();
        double velocidadY = velocidadX;


        double[] linea1 = {x0,y0,x1,y1};
        double[] linea2 = {0.0,0.0,0.0,0.0};
        double[] linea3 = {0.0,0.0,0.0,0.0};
        double[] linea4 = {0.0,0.0,0.0,0.0};
        double[] linea5 = {0.0,0.0,0.0,0.0};
        double[] linea6 = {0.0,0.0,0.0,0.0};

        // Como se puede apreciar, procedemos a ponerle color a nuestro código, literalmente.

        Color[] colores = {Color.blue,Color.red,Color.green,Color.pink,Color.magenta};

        /* Ahora toca darles velodidad a nuestras queridas líneas, vamos a darle cierto límite a la velocidad para que
        no explote todo, pero aún así va a tener cierta randomización.
        */

        int aux = 0;
        while (true){
            int numeroAlAzar = (int) (colores.length*Math.random());
            StdDraw.setPenColor(colores[numeroAlAzar]);
            StdDraw.clear(Color.black);
            if (linea1[0] > 10) {
                velocidadX = -(0.25 + (0.5-0.25) * Math.random());
            }
            if (linea1[1] < -10) {
                velocidadX = 0.25 + (0.5-0.25) * Math.random();
            }
            if (linea1[2] > 10) {
                velocidadY = -(0.25 + (0.5-0.25) * Math.random());
            }
            if (linea1[3] < -10) {
                velocidadY = 0.25 + (0.5-0.25) * Math.random();
            }

            // Comenzamos a trazar las líneas de nuestro magnífico y completamente cumplidor de parámetros salvapantallas.

            dibujarLinea(linea1, linea2, linea3, linea4, linea5, linea6, velocidadX, velocidadY, colores, numeroAlAzar);
            Thread.sleep(80);

        }
    }

    /**
     *
     * @param linea1 Coordenadas de la línea 1
     * @param linea2 Coordenadas de la línea 2
     * @param linea3 Coordenadas de la línea 3
     * @param linea4 Coordenadas de la línea 4
     * @param linea5 Coordenadas de la línea 5
     * @param linea6 Coordenadas de la línea 6
     * @param velocidadX Cálculos de la velocidad de las coordenadas basadas en el eje X
     * @param velocidadY Cálculos de la velocidad de las coordenadas basadas en el eje Y
     * @param colores Selección de colores para las líneas
     * @param numeroAlAzar Número al azar para seleccionar un color de la lista
     */
    public static void dibujarLinea(double[] linea1,double[] linea2,double[] linea3,double[] linea4,double[] linea5,double[] linea6, double velocidadX, double velocidadY, Color[] colores, int numeroAlAzar){
        StdDraw.line(linea1[0],linea1[1],linea1[2],linea1[3]);
        linea1[0]+=velocidadX;linea1[1]+=velocidadX;linea1[2]+=velocidadY;linea1[3]+=velocidadY;
        linea2 = linea1;
        numeroAlAzar = (int) (colores.length*Math.random());
        StdDraw.setPenColor(colores[numeroAlAzar]);
        StdDraw.line(linea2[0],linea2[1],linea2[2],linea2[3]);
        linea1[0]+=velocidadX;linea1[1]+=velocidadX;linea1[2]+=velocidadY;linea1[3]+=velocidadY;
        linea3 = linea2;
        numeroAlAzar = (int) (colores.length*Math.random());
        StdDraw.setPenColor(colores[numeroAlAzar]);
        StdDraw.line(linea3[0],linea3[1],linea3[2],linea3[3]);
        linea1[0]+=velocidadX;linea1[1]+=velocidadX;linea1[2]+=velocidadY;linea1[3]+=velocidadY;
        linea4 = linea3;
        numeroAlAzar = (int) (colores.length*Math.random());
        StdDraw.setPenColor(colores[numeroAlAzar]);
        StdDraw.line(linea4[0],linea4[1],linea4[2],linea4[3]);
        linea1[0]+=velocidadX;linea1[1]+=velocidadX;linea1[2]+=velocidadY;linea1[3]+=velocidadY;
        linea5 = linea4;
        numeroAlAzar = (int) (colores.length*Math.random());
        StdDraw.setPenColor(colores[numeroAlAzar]);
        StdDraw.line(linea5[0],linea5[1],linea5[2],linea5[3]);
        linea1[0]+=velocidadX;linea1[1]+=velocidadX;linea1[2]+=velocidadY;linea1[3]+=velocidadY;
        linea6 = linea5;
        numeroAlAzar = (int) (colores.length*Math.random());
        StdDraw.setPenColor(colores[numeroAlAzar]);
        StdDraw.line(linea6[0],linea6[1],linea6[2],linea6[3]);


        linea1[0]+=velocidadX;linea1[1]+=velocidadX;linea1[2]+=velocidadY;linea1[3]+=velocidadY;
    }
}