package ar.com.xeven;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> alumnas = new ArrayList<>();
        // agregar elementos:
        alumnas.add("Agus");
        alumnas.add("Alba");
        alumnas.add("Jazmin");
        alumnas.add("Caro");
        // agrega un valor en la posición 3 y desplaza
        // los demás objetos 1 posición
        alumnas.add(3, "Sabri");
        // reemplaza el valor del objeto en la posición indicada (3)
        alumnas.set(3, "Sabri");

        System.out.println("Tamaño: "+alumnas.size());
        for(int cont = 0; cont < alumnas.size(); cont++){
            System.out.print(cont+": ");
            System.out.println(alumnas.get(cont));
        }
    }
}
