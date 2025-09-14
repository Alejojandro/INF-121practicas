package com.mycompany.p2ejer1;
public class AlgebraVectorial {
    private double a[];
    private double b[];
    private int n;

    public AlgebraVectorial(double a[], double b[], int n) {
        this.a = a;
        this.b = b;
        this.n = n;
    }
    public double[] getSuma(){
        double[]c = new double[n];
        for(int i=0;i<n;i++){
            c[i]=a[i]+b[i];
        }
        return c;
    }
    public double[] getRestaAb(){
        double []r= new double [n];
        for(int i=0;i<n;i++){
            r[i]=a[i]-b[i];
        }
        return r;
    }
    public double[] getRestaBa(){
        double[] r2= new double [n];
        for(int i=0;i<n;i++){
            r2[i]=b[i]-a[i];
        }
        return r2;
    }
    public double getProducto(){
        double []c= new double [n];
        double p=0;
        for(int i=0;i<n;i++){
            c[i]=a[i]*b[i];
            p=p+c[i];
        }
        return p;
    }
    public double[] getCruz() {
        if (n != 3) return null;
        double[] r = new double[3];
        r[0] = a[1]*b[2] - a[2]*b[1];
        r[1] = a[2]*b[0] - a[0]*b[2];
        r[2] = a[0]*b[1] - a[1]*b[0];
        return r;
    }
    public double getNorma(double []v){
        double suma = 0;
        for (int i = 0; i < v.length; i++) {
            suma += v[i] * v[i];
        }
        return Math.sqrt(suma);
    }
    public boolean Perpendicular(){
        double i=Math.abs(getNorma(getSuma()));
        double j=Math.abs(getNorma(getRestaAb()));
        return i==j;
    }
    public boolean Perpendicular(boolean mutuamente){
        if(!mutuamente) return Perpendicular();
        double i=Math.abs(getNorma(getRestaAb()));
        double j=Math.abs(getNorma(getRestaBa()));
        return i==j;
    }
    public boolean Perpendicular(int punto){
        if (punto != 0) return Perpendicular();
        return getProducto() == 0;
    }
    public boolean Perpendicular(double f){
        if(f!=2.5) return Perpendicular();
        double i=Math.pow(Math.abs(getNorma(getSuma())), 2);
        double j=Math.pow(Math.abs(getNorma(a)), 2)+Math.pow(Math.abs(getNorma(b)), 2);
        return i==j;
    }
    public boolean Paralela(int r){
        for (int i=0;i<n;i++){
            b[i]=r*b[i];
        }
        return a == b;
    }
    public boolean Paralela(){
        return getNorma(getCruz()) == 0 ;
    }
    public double[] ProyeccionAB(){
        double nor = Math.pow(getNorma(b), 2);
        double[] proy = new double[b.length];
        double x = getProducto()/nor;
        for (int i = 0; i < n; i++) proy[i] = x * b[i];
        return proy;
    }
    public double ComponenteAB(){
        double y= getProducto()/getNorma(b);
        return y;
    }
    public static void mostrar(double[] v){
        System.out.println("[");
        for (int i=0;i<v.length;i++){
            System.out.printf("%.1f", v[i]);
            if (i < v.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}

