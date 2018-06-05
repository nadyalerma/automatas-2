import java.io.*;
import java.util.*;

public class ProyectoAutomatas{
 	public static ArrayList<String> leer(String path){
 		      ArrayList<String> list = new ArrayList<String>();
              try {
                  FileReader fr =new FileReader(path);
                  BufferedReader  br = new BufferedReader(fr);
                  String linea;
                  while((linea = br.readLine())!= null){ //entra el arreglo en ciclo
                  	
                    StringTokenizer st = new StringTokenizer(linea, ";/./ /\n/:", true); //muestra hasta donde quiero separar por partes
                   
                    while (st.hasMoreTokens()){ 
						String token = st.nextToken();
						list.add(token);	      
                    } } }
              
              catch (FileNotFoundException ex) { }            
              catch (IOException ex) { }      
              return (list);//retorno la lista
    	}		      

        public static void comparacion(String dos[][], ArrayList<String> lista){//
            int i=0;
             String h;
             int j=0; 
    while (i < lista.size()) {//obtener un elemento de la lista
             j=0;
             h=lista.get(i).trim();// quitar espacios y alinear
                    while(j < dos.length){ 
               		if(h.equals(dos[j][0])){
                        System.out.println(dos[j][1]);
                 		break;//rompe ciclos 
                	}
                else{               	
                    j=j+1;   } } 
                    i=i+1; 	
                             } }
    public static void main(String[] args) {
      
       	ArrayList<String> lista = new ArrayList<>();
        lista = leer("D:\\bloc.txt");
	
   		String[][]dos= {{"java","pyhton"},
 		      		{"import"," "},
 		      		{"public static","Def"},
 		      		{"Scanner"," "},
 		      		{"void","from import"},
 		      		{"static","def"},
 				{"main"," "},
	      			{"out"," "},
 		      		{"print","print"},
 		      		{"args"," "},
 		      		{"int","int"},
 				{"input","input"},
 	      			{"nextInt","str"},
 	      			{"for","for"},
 		      		{" "," "},
                                {"()","()"}}; 
 		      				   		
    	comparacion(dos,lista);		
    } }
