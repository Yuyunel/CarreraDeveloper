package presencial;

public class IP {
    private int nro1;
    private int nro2;
    private int nro3;
    private int nro4;

    public IP(int nro1, int nro2, int nro3, int nro4) {
        this.nro1 = nro1;
        this.nro2 = nro2;
        this.nro3 = nro3;
        this.nro4 = nro4;
    }

    @Override
    public String toString(){
        return "IP: "+nro1+"."+nro2+"."+nro3+"."+nro4;
    }

    public String getPais(){
        String pais="";
        if (nro1<=49)
            pais="Argentina";
        else if (nro1<=99) {
            pais = "Brasil";
        }else if (nro1<=149){
            pais="Colombia";
        }
        return pais;
    }

    public int getNro1() {
        return nro1;
    }

    public void setNro1(int nro1) {
        this.nro1 = nro1;
    }

    public int getNro2() {
        return nro2;
    }

    public void setNro2(int nro2) {
        this.nro2 = nro2;
    }

    public int getNro3() {
        return nro3;
    }

    public void setNro3(int nro3) {
        this.nro3 = nro3;
    }

    public int getNro4() {
        return nro4;
    }

    public void setNro4(int nro4) {
        this.nro4 = nro4;
    }
}
