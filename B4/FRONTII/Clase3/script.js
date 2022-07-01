// refactorizar el ejercicio de ppt


// 1.entrada de datos -- 2.procesamiento -- 3.salida 


// 1 entrada datos
let opcionUsuario
let opcionMaquina
const opciones = ["piedra", "papel", "tijera"];
let ganador
let numero

// pedir juegada al usuario / entrada
function pedirJugadaUsuario() {

    do{
        numero =parseInt(prompt("elija piedra(1), papel(2) o tijera(3)"))
    }while(isNaN(numero) || numero > 3 || numero < 1 )   
    opcionUsuario = opciones[numero -1]
    console.log(opcionUsuario)
}

// generara jugada  / entrada
function generarJugadaMaquina(){
    const random = parseInt (Math.random() *3);
    opcionMaquina = opciones[random];
}

// comparar resultados /procesamiento
function calcularGanador(){
    switch (opcionUsuario){
        case opcionMaquina :
            ganador = "ninguno :/";
            break;

        case 'piedra':
            if(opcionMaquina == "tijera"){
                ganador = 'usuario: )';
            }else {
                ganador = 'maquina :(';
            }
            break;
        
        case 'papel':
            if(opcionMaquina == 'piedra'){
                ganador = 'usuario :)'
            }else{
                ganador = "maquina :("
            }
            break;
        case 'tijera':
            if(opcionMaquina == 'papel'){
                ganador = 'usuario :)';
            }else{
                ganador = 'maquina :(';
            }
            break;
    }
}


// mostrar el resultado / salida

function mostrarGanador(){
    alert('usted eligio ' + opcionUsuario + ' y la maquina ' + opcionMaquina + '. el ganador es ' + ganador)
}

pedirJugadaUsuario()
generarJugadaMaquina()
calcularGanador()
mostrarGanador()
 











/*let opcionUsuario = parseInt(prompt('piedra (1), papel(2), tijera(3)'))
let random = parseInt(Math.random()*3+1);
let opcionMaquina= random;
let resultado ;

console.log(opcionUsuario);
console.log(opcionMaquina);


    if(opcionUsuario == 1){
        resultado = opcionMaquina == 1 ? "empate":
                    opcionMaquina == 2 ? "derrota":
                    opcionMaquina == 3 ? "victpria":
  
    }

    if(opcionUsuario == 2){
        if(opcionMaquina == 1){
            resultado = "victoria";
        }
        if(opcionMaquina == 2){
            resultado= "empate";
        }
        if(opcionMaquina == 3){
            resultado = "victoria";
        }
    }
    if(opcionUsuario == 3){
        if(opcionMaquina == 1){
            resultado = "derrota";
        }
        if(opcionMaquina == 2){
            resultado ="victoria";
        }
        if(opcionMaquina == 3){
            resultado = "empate";
        }
    }

alert(resultado);*/
