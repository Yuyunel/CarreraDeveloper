let opcionUsuario = parseInt(prompt('piedra (1), papel(2), tijera(3)'))

let random = parseInt(Math.random()*3+1);
//while(opcionUsuario < 1 || opcionUsuario > 3 || isNaN(opcionUsuario)){
//    opcionUsuario =  parseInt(prompt('piedra (1), papel(2), tijera(3)'))

//}

let opcionMaquina= random;


console.log(opcionUsuario);
console.log(opcionMaquina);


let resultado = "sin calcular aun";
    if(opcionUsuario == 1){
        if(opcionMaquina == 1){
            resultado = "empate";
        }
        if(opcionMaquina == 2){
            resultado = "derrota";
        }
        if(opcionMaquina == 3){
            resultado = "victoria";
        }    
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
    alert(resultado);
