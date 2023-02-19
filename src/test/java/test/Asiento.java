package test;
public class Asiento
{
    String color;
    int precio;
    int registro;

    void cambiarColor (String color)
    {
        if (color=="rojo" || color=="verde" || color=="blanco" || color=="negro" || color=="amarillo")
        {
            this.color=color;
        }
    }
}