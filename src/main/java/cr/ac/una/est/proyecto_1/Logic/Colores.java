package cr.ac.una.est.proyecto_1.Logic;

import java.util.Random;

public class Colores {
    private String _color1;
    private String _color2;
    private String _color3;
    private String _color4;
    //--------------------------------------------------------------------------
    public Colores(){
        _color1 = "";
        _color2 = "";
        _color3 = "";
        _color4 = "";
    }
    public Colores(String color1, String color2, String color3, String color4){
        _color1 = color1;
        _color2 = color2;
        _color3 = color3;
        _color4 = color4;
    }
    public void setColor1(String color){
        _color1 = color;
    }
    public String getColor1(){
        return _color1;
    }
    public void setColor2(String color){
        _color2 = color;
    }
    public String getColor2(){
        return _color2;
    }
    public void setColor3(String color){
        _color3 = color;
    }
    public String getColor3(){
        return _color3;
    }
    public void setColor4(String color){
        _color4 = color;
    }
    public String getColor4(){
        return _color4;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append(_color1).append(", ").append(_color2).append(", ").append(_color3).append(", ")
                .append(_color4).append("\n");
        
        return sb.toString();
    }
    public void generateColors(){
        int num[] = {1,2,3,4};
        String colors[] = {"","","",""};
        Random rand = new Random();
        
        for(int i=0;i<4;i++){
            num[i] = rand.nextInt(4)+1;
            
            switch(num[i]){
                case 1: colors[i] = "Verde"; break;
                case 2: colors[i] = "Azul"; break;
                case 3: colors[i] = "Amarillo"; break;
                case 4: colors[i] = "Rojo"; break;
            }
        }
        
        _color1 = colors[0];
        _color2 = colors[1];
        _color3 = colors[2];
        _color4 = colors[3];
    }
}
