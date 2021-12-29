
package cl;


public class Signo 
{
    private String data;

    public Signo(String data) {
        setData(data);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if(!data.equals(""))
            this.data = data;
    }
    
    public int getSigno()
    {
        String vet[] = new String[3];
        vet = data.split("-");
        int mes = Integer.parseInt(vet[1]),dia = Integer.parseInt(vet[2]);
        //int mes =4,dia=21;
        if((dia>=21 && mes==3) || (dia<20 && mes==4))//ARIES
            return 1;
        else if((dia>=21 && mes==4) || (dia<=20 && mes==5))//TOURO
            return 2;
        else if((dia>=21 && mes==5) || (dia<=20 && mes==6))//GEMEOS
            return 3;
        else if((dia>=21 && mes==6) || (dia<=22 && mes==7))//CANCER
            return 4;
        else if((dia>=23 && mes==7) || (dia<=22 && mes==8))//LEAO
            return 5;
        else if((dia>=23 && mes==8) || (dia<=22 && mes==9))//VIRGEM
            return 6;
        else if((dia>=23 && mes==9) || (dia<=22 && mes==10))//LIBRA
            return 7;
        else if((dia>=23 && mes==10) || (dia<=21 && mes==11))//ESCORPION
            return 8;
        else if((dia>=22 && mes==11) || (dia<=21 && mes==12))//SAGITARY
            return 9;
        else if((dia>=22 && mes==12) || (dia<=20 && mes==1))//CAPRICA
            return 10;
        else if((dia>=21 && mes==1) || (dia<=18 && mes==2))//AQUARIO
            return 11;
        else//PEIXES
            return 12;
    }
}
