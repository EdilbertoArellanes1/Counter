package com.juangabrielgomila.counter;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by JuanGabriel on 6/11/17.
 */

public class SomeClass { // Se crea una clase

    int day; // se declara una variable day de tipo entero


    public void aMethod(){ //se crea un metodo

        final String stringNice = "S"; // se declara una variable de tipo final string que quiere decir que servira como constante

        class AnonymousClass{
            int holaQueAse; // se inicializa una variable de tipo entero

            public AnonymousClass(){

            }

            private void sayHello(){ // se crea un metodo

                //se crea un mensaje de tipo informacion donde se concatenan las variables creadas en los metodos

                Log.i("HOLA", "sayHello: "+stringNice+holaQueAse+day);

            }

        }



    }




    public class InnerClass{
        int age;
        String name;

        public InnerClass(){

        }

        public int addOne(){
            return age+1;
        }

        public void innerMethod(){
            day = day+1;
        }
    }


}



/*public class OtherClass{

}*/