/*primer sección: codigo de usuario*/
/*aqui debe ir codigo java*/
%%

/*Segunda Sección: configuración*/
%class Ejercicio2
%unicode
%line
%column
%int
%public

%{
 private String [] vocales ={"a","e","i","o","u"};
private int cantidadMaximaVocales= 5;

 public String lexema;
 private ArrayList<Token> tokensGramatica = llenarArray(cantidadMaximaVocales);
private ArrayList<String> numeros = new ArrayList<>();

public void contarVocales(String lexema){
char [] caracteres = lexema.toCharArray();
int contador = 0;
for(int i = 0; i< caracteres.length; i++){
for(int j = 0; j< vocales.length; j++){
 if (String.valueOf(caracteres[i]).equalsIgnoreCase(vocales[j])){
contador++;
break;
};


};


};

if  (contador != 0 && contador <= cantidadMaximaVocales){

      tokensGramatica.get(contador-1).aumentarCantidad();
};


};

public ArrayList<Token> llenarArray(int cantidadMaximaVocales){
 ArrayList<Token> arreglo = new ArrayList<>();

for(int j = 0; j< cantidadMaximaVocales; j++){
 arreglo.add(new Token(j+1, 0));
};

return arreglo;
};

public void añadirNumero(String lexema){
 numeros.add(lexema);
};

public ArrayList<Token> getTokensGramatica(){
return tokensGramatica;
}

public ArrayList<String> getNumeros(){
return numeros;
}

%}

%%

/*tercer seccion: reglas lexicas, expresiones regulares descritas en mi archivo*/

(a|b|c|d|e|f|g|h|i|j|k|l|m|n|ñ|o|p|q|r|s|t|u|v|w|x|y|z|A|B|C|D|E|F|G|H|I|J|K|L|M|N|Ñ|O|P|Q|R|S|T|U|V|W|X|Y|Z)+ {lexema=yytext(); contarVocales(lexema);}
(0|1|2|3|4|5|6|7|8|9) {lexema="valor: " +yytext()+"columna: "+yycolumn+" fila: "+yyline; añadirNumero(lexema);}
[^] {}/*mecanismo que permite que hacer cuando tenemos una palabra incorrecta*/