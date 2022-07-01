// piedra papel o tijera
// 1.entrada de datos ---2 procesamiento --- 3 salida
//let opcionUsuario = parseInt(prompt("piedra(1), papel(2), tijera(3)"))
//let random = parseInt(Math.random()*3+1);
//let opcionMaquina = random;

//console.log(opcionUsuario);
//console.log(opcionMaquina);

//*let resultado = " sin calcular aun";
    if(opcionUsuario == 1){
        if(opcionMaquina == 1){
            resultado = "empate";

        } 
        if(opcionMaquina == 2) {
            resultado ="derrota";
        }
        if(opcionMaquina == 3){
            resultado= "victoria";
        }
    }
    if(opcionUsuario == 2){
        if(opcionMaquina == 2){
            resultado = "empate";

        } 
        if(opcionMaquina == 1) {
            resultado ="derrota";
        }
        if(opcionMaquina == 3){
            resultado= "victoria";
        }
    }
    if(opcionUsuario == 3){
        if(opcionMaquina == 3){
            resultado = "empate";

        } 
        if(opcionMaquina == 2) {
            resultado ="derrota";
        }
        if(opcionMaquina == 1){
            resultado= "victoria";
        }
    }
    alert = resultado;


    let opcionMaquina
    let opcionUsuario
    const opciones = ["piedra", "papel", "tijera"];
    let ganador
    let numero

    //pedirJugada al usuario==entrada
    function pedirJugadaAlUsuario(){
        const numero = prompt("elija piedra(1), papel(2), tijera(3) ")
        cpnsole.log(typeof(numero))
        opcionUsuario = opciones[numero -1]
         console.log(opcionUsuario)
    }



    // genegarJugadaMaquina==entrada



    //compararResultados==procesamiento



    //mostrarResultado == salida





    