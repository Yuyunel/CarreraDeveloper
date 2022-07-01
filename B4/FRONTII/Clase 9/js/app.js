//variables

let cronometro
let contador = 0
let tiempo = 1000
let valor = document.querySelector('#valor')
let btnIniciar = document.querySelector('#iniciar')
let btnPausa = document.querySelector('#pausa')
let btnStop = document.querySelector('#stop')
let btnAcelerar = document.querySelector('#acelerar')

let times = document.querySelector('#times')


//Escuchadores de eventos (event listeners)
btnIniciar.addEventListener('click', iniciar)
btnPausa.addEventListener('click', pausa)


//funciones que se ejecutaran al presionar los botones 
function iniciar(){
    cronometro = setInterval(()=>{
        contador++
        console.log(contador)
        renderizarEnDom()
    },tiempo)
}
//funcion que renderiza el valor en el DOM
function renderizarEnDom(){
  valor.innerHTML = contador  
}

//funcion que detiene el cronometro
function pausa(){
    clearInterval(cronometro)
}