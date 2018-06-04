
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ProyectoAutomatas {
 	public static ArrayList<String> lee(String path){
 		      ArrayList<String> lista = new ArrayList<String>(); 
              try {
                  FileReader fb =new FileReader(path);
                  BufferedReader  br = new BufferedReader(fb);
                  String linea;
                  while((linea = br.readLine())!= null){ 
                  StringTokenizer st = new StringTokenizer(linea, ";/./ /\n/:", true); 
                  while (st.hasMoreTokens()){ 
		  String token = st.nextToken();
						lista.add(token); } } }                  
               catch (FileNotFoundException ex) {
                  
              } catch (IOException ex) { }    
                  return (lista); }
    			           
        public static void comparacion(String dos[][], ArrayList<String> lista){//
             int i=0;
             String h;
             int j=0;       
                while (i < lista.size()) {
                    j=0;
                    h=lista.get(i).trim();
                    while(j < dos.length){ 
               		if(h.equals(dos[j][0])){
                        System.out.println(dos[j][1]);
                 		break; }
                	else
                       j=j+1; } }   
                       i=i+1; } 	
        
    public static void main(String[] args) {
      
       	ArrayList<String> lista = new ArrayList<>();
        lista = lee("F:\\texto.txt");		
   		String[][]dos= {{"java","pyhton "},
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
 		      		{" "," "}}; 
 		      				   		
    	comparacion(dos,lista);	
    } }


