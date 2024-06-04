public class Data {
    int dia, mes, ano;

    public String toString(){
        return Integer.parseInt(String.valueOf(this.dia)) + "/" + Integer.parseInt(String.valueOf(this.mes)) + "/" + Integer.parseInt(String.valueOf(this.ano));
    }

    boolean anterior(Data data1, Data data2){
        if (data1.ano < data2.ano){return true;}
        else{
        	if (data1.mes < data2.mes) {
        		return true;
        	}
        	else{
                return data1.dia < data2.dia;
        	}
        }
    }
}
