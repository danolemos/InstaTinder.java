public class Data(){
    int dia, mes, ano;

    String toString(){
        return Integer.parseln(this.dia) + "/" + Integer.parseln(this.mes) + "/" + Integer.parseln(this.ano);
    }

    boolean anterior(data1, data2){ // ?????????????????
        if (ano1 < ano2){return true;}
        else{
        	if (mes1 < mes2) {
        		return true;
        	}
        	else{
        		if (dia1 < dia2){
        			return true;
        		}
        		else{return false;}
        	}
        }
        return false;
    }
}
