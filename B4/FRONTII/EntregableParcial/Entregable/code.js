/* --------------------------- NO TOCAR DESDE ACÁ --------------------------- */
let datosPersona = {
  nombre: "",
  edad: 0,
  ciudad: "",
  interesPorJs: "",
};

const listado = [{
    imgUrl: "https://huguidugui.files.wordpress.com/2015/03/html1.png",
    lenguajes: "HTML y CSS",
    bimestre: "1er bimestre",
  },
  {
    imgUrl: "https://jherax.files.wordpress.com/2018/08/javascript_logo.png",
    lenguajes: "Javascript",
    bimestre: "2do bimestre",
  },
  {
    imgUrl: "https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/React.svg/1200px-React.svg.png",
    lenguajes: "React JS",
    bimestre: "3er bimestre",
  },
];

const profileBtn = document.querySelector("#completar-perfil");
const materiasBtn = document.querySelector("#obtener-materias");
const verMasBtn = document.querySelector("#ver-mas");
const cambiarTema = document.querySelector('#cambiar-tema');

profileBtn.addEventListener("click", renderizarDatosUsuario);
materiasBtn.addEventListener("click", recorrerListadoYRenderizarTarjetas);
cambiarTema.addEventListener("click", alternarColorTema);
/* --------------------------- NO TOCAR HASTA ACÁ --------------------------- */

function obtenerDatosDelUsuario() {
  /* --------------- PUNTO 1: Escribe tu codigo a partir de aqui --------------- */
 let nombre = prompt('Ingresa tu nombre:')
 let anio = prompt('Ingresa el año en que naciste:')
 let ciudad = prompt('Ingresa la ciudad en que naciste:')
let javascript = confirm('¿Te interesa JavaScript?')

let anioActual = 2022

if (javascript) {
  javascript = 'Sí'
} else {
  javascript = 'No'
}

datosPersona.nombre = nombre 
datosPersona.edad = anioActual - anio
datosPersona.ciudad = ciudad
datosPersona.interesPorJs = javascript


}

function renderizarDatosUsuario() {
  /* ------------------- NO TOCAR NI ELIMINAR ESTA FUNCION. ------------------- */
  obtenerDatosDelUsuario();
  /* --------------- PUNTO 2: Escribe tu codigo a partir de aqui --------------- */
  let nombre = document.getElementById('nombre')
  nombre.innerText = datosPersona.nombre
  let edad = document.getElementById('edad')
  edad.innerText = datosPersona.edad
  let ciudad = document.getElementById('ciudad')
  ciudad.innerText = datosPersona.ciudad
  let javascript = document.getElementById('javascript')
  javascript.innerText = datosPersona.interesPorJs

}


function recorrerListadoYRenderizarTarjetas() {
  /* ------------------ PUNTO 3: Escribe tu codigo desde aqui ------------------ */
  let fila = document.getElementById('fila')
 
  for (const item of listado) {
    let caja = document.createElement('div')
    caja.classList.add('caja')
    let imagen = document.createElement('img')
  imagen.setAttribute('src', item.imgUrl)
  let parrafo = document.createElement('p')
  parrafo.innerText = item.lenguajes
  let parrafo2 = document.createElement('p')
  parrafo2.innerText = item.bimestre

  caja.appendChild(imagen)
  caja.appendChild(parrafo)
  caja.appendChild(parrafo2)

  fila.appendChild(caja)
  }
  materiasBtn.removeEventListener('click', recorrerListadoYRenderizarTarjetas)


}

function alternarColorTema() {
  /* --------------------- PUNTO 4: Escribe tu codigo aqui --------------------- */
let temaOscuro = document.querySelector('body') 

temaOscuro.classList.toggle('dark')




}

/* --------------------- PUNTO 5: Escribe tu codigo aqui --------------------- */
const sobremi = document.getElementById('sobre-mi')

document.addEventListener('keydown', (event) => {
  event.preventDefault()
  const teclaF = event.key;
  console.log(teclaF);
  if (teclaF.toUpperCase() === 'F') {
    sobremi.classList.remove('oculto')
  } 
})
