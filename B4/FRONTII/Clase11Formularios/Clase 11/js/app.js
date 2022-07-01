//normalizar los datos que ingresan por los inputs del form
//y almacenarlos en variables, 
//crear una funcion que normalice los datos y finalmente mostrarlos por consola

//entrada de datos o variables
//const formulario = document.forms[0]
const formulario = document.querySelector("form")
const nombre = document.querySelector("#nombre")
const password = document.querySelector("#pass")
const telefono = document.querySelector("#tel")
//const hobbies = document.querySelectorAll("form #listado-hobbies")
const hobbies = document.getElementsByName("hobbies")
const nacionalidades = document.getElementsByName("nacionalidad")

formulario.addEventListener("submit", event => {
    event.preventDefault()

    let hobbiesSelected = [] 
    hobbies.forEach(hobbie => {
        if(hobbie.checked){
            hobbiesSelected.push(hobbie.id) 
        }
    })

    let nacionalidad
    nacionalidades.forEach(pais => {
        if(pais.checked){
            nacionalidad = pais.id
        }
    })

    console.log(normalizar(nombre.value,password.value,telefono.value,hobbiesSelected,nacionalidad))
})

//Procesamiento de la información

function normalizar(nom,pass,tel,hobbies,nacionalidad){
    let datos = {
        //El nombre debe comenzar con mayús, y el resto en minús
        //Silvina
        nombre: nom[0].toUpperCase() + nom.slice(1).toLowerCase(),
        password: pass,
        telefono: tel,
        hobbies: hobbies,
        nacionalidad: nacionalidad
    }

    return datos
}

//desarrollar una funcion que valide el nombre
// -> Recibe el nombre
//  -> Tiene que ser una sola palabra
//  -> no puede tener mas de 20 caracteres
//  -> no puede contener números
//  <-Devuelte un booleano , true si el nombre cumple con el formato, false si no cumple
//Luegfo probar la validacion del nombre antes de normalizar 

function validarNombre(nombre){}