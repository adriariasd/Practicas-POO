package mx.desasof.casas;
public class Casa {
    private String tipo;
    private int hab;
    private float costo;
    public Casa(String tipo, int hab, float costo){
        this.tipo = tipo;
        this.hab = hab;
        this.costo = costo;
    }
    public Casa(String tipo){
        this(tipo, 2, 2000000f);
    }
    public int hashCode(){
        int x = (int)costo;
        return tipo.hashCode()*hab*x;
    }
    public boolean equals(Object o){
        if (o != null && o instanceof Casa){
            Casa p = (Casa) o;
            if (tipo.equals(p.tipo) && costo == p.costo){
                return true;
            }
        }
        return false;
    }
    public String toString(){
        return tipo+" "+hab+" "+costo;
    }
}