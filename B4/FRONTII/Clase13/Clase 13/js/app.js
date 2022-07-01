//crear input parar que el usuario ingrese sus peliculas favoritas separadas por ;
//las peliculas se almacenan en un array usando split
//y posteriormente normalizar cada una de esas peliculas del arreglo(pasandolas a mayuscula) 
//y agregando ese array al objeto principal.

//entrada de datos 

let formulario = document.querySelector("form")
const nombre = document.querySelector("#nombre")
const password = document.querySelector("#pass")
const tel = document.querySelector("#tel")
const hobbies = document.querySelectorAll("#listado-hobbies input")
const nacionalidades = document.getElementsByName("nacionalidad")
const peliculas = document.querySelector("#peliculas")
const listaErrores = document.querySelector("#errorList")

formulario.addEventListener('submit', function (event) {
    //detenemos el envio del form
    //event.preventDefault()

    let peliculasSelected = toArraySplitUpper(peliculas.value.trim())
    //console.log(peliculasSelected)


   
    validarForm(event)
    console.log(normalizar(nombre.value, password.value, tel.value, peliculasSelected, getHobbiesSelected(), getPaisSelected()))

})

//procesamos la información
function normalizar(nombre, password, tel, peliculas, hobbies, nacionalidad) {
    const datos = {
        //Nombres comienzan con mayusculas, y luego todo min nombre.charAt(0).toUpperCase()
        nombre: nombre[0].toUpperCase() + nombre.slice(1).toLowerCase(),
        password: password.trim(),
        tel: tel,
        peliculas: peliculas,
        hobbies: hobbies,
        nacionalidad: nacionalidad
    }
    return datos
}

function validarForm(e){
    let errores = []

    let regexNombre = /[A-Za-z]/
    if(nombre.value == ""){
        errores.push("El nombre no debe estar vacío.")
    }else if(!regexNombre.test(nombre.value)){
        errores.push("El nombre debe tener formato de texto")
    }
    let regexPass = /^(?=(?:.*\d){1})(?=(?:.*[A-Z]){1})(?=(?:.*[a-z]){1})(?=(?:.*[@$?¡\-_]){1})\S{8,16}$/
    if(password.value == ""){
        errores.push("La contraseña no debe estar vacía.")
    }else if(password.value.length > 16 || password.value.length < 8){
        errores.push("La contraseña debe tener entre 8 y 16 caracteres")
    }else if(!regexPass.test(password.value)){
        errores.push("La contraseña debe tener 1 mayúscula.<br>La contraseña debe tener 1 minúscula,<br>La contraseña debe tener al menos 1 caracter especial.")
    }
    if(tel.value.length != 10){
        errores.push("El teléfono debe contener 10 números.")
    }
    if(peliculas.value == ""){
        errores.push("Debes colocar al menos 1 película.")
    }
    if(getHobbiesSelected().length < 1 || getHobbiesSelected().length > 4){
        errores.push("Debe seleccionar entre 1 y 4 hobbies.")
    }
    if(getPaisSelected() == undefined){
        errores.push("Debe seleccionar nacionalidad.")
    }

    if(errores.length > 0){
        e.preventDefault()
        
        for(let error of errores){
            listaErrores.innerHTML += "<li><span>"
                                        +error
                                        +"</span></li>"
        }
    }
    //SACAR PRREVENT PARA ENVIAR EL FORMULARIO
    e.preventDefault()
    listaErrores.innerHTML += "<li><span>"
    +"FORM ENVIADO"
    +"</span></li>"
}

function toArraySplitUpper(cadena) {
    let array = cadena.toUpperCase().split(';')
    return array
}

function getHobbiesSelected(){
    let hobbiesSelected = []
    hobbies.forEach(hobbie => {
        if (hobbie.checked) {
            hobbiesSelected.push(hobbie.id)
        }
    })
    return hobbiesSelected
}

function getPaisSelected(){
    let paisSelected
    nacionalidades.forEach(pais => {
        if (pais.checked) {
            paisSelected = pais.id
        }
    })
    return paisSelected
}