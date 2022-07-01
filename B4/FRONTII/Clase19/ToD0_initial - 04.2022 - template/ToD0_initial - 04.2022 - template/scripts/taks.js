// SEGURIDAD: Si no se encuentra en localStorage info del usuario
// no lo deja acceder a la página, redirigiendo al login inmediatamente.
if(!localStorage.jwt){
  alert("No hay usuraios logeados")
  //location.replace('./index.html')

}


/* ------ comienzan las funcionalidades una vez que carga el documento ------ */
window.addEventListener('load', function () {

  /* ---------------- variables globales y llamado a funciones ---------------- */
  const jwt = JSON.parse(this.localStorage.jwt)
  const urlUsuario = 'https://ctd-todo-api.herokuapp.com/v1/users/getMe'
  const formCrearTarea = document.querySelector('.nueva-tarea');
  const nuevaTarea = document.querySelector('#nuevaTarea');
  const btnCerrarSesion = document.querySelector('#closepApp')
  

  obtenerNombreUsuario()

  /* -------------------------------------------------------------------------- */
  /*                          FUNCIÓN 1 - Cerrar sesión                         */
  /* -------------------------------------------------------------------------- */

  btnCerrarSesion.addEventListener('click', function () {

    const cerrarSesion = confirm("¿Desea cerrar sesión?");

    if(cerrarSesion){
       //limpiamos el localstorage y redireccioamos a login
      localStorage.clear();
      location.replace('./index.html');
    }


  /* -------------------------------------------------------------------------- */
  /*                 FUNCIÓN 2 - Obtener nombre de usuario [GET]                */
  /* -------------------------------------------------------------------------- */

  function obtenerNombreUsuario() {
    const settings = {
      method: "GET",
      headers: {
        Authorization: jwt,
      },
    };

    console.log("Consultando mi usuario...")
    fetch(urlUsuario,settings)
      .then(response => response.json())
      .then(data => {
        console.table(data)
        const userInfo = document.querySelector("div.user-info p")
        userInfo.innerHTML = `${data.firstName} ${data.lastName}` 
      })
      .catch(error => console.error(error))


  



  };


  /* -------------------------------------------------------------------------- */
  /*                 FUNCIÓN 3 - Obtener listado de tareas [GET]                */
  /* -------------------------------------------------------------------------- */

  function consultarTareas() {
    
    
    



  };


  /* -------------------------------------------------------------------------- */
  /*                    FUNCIÓN 4 - Crear nueva tarea [POST]                    */
  /* -------------------------------------------------------------------------- */

  formCrearTarea.addEventListener('submit', function (event) {
    




  });


  /* -------------------------------------------------------------------------- */
  /*                  FUNCIÓN 5 - Renderizar tareas en pantalla                 */
  /* -------------------------------------------------------------------------- */
  function renderizarTareas(listado) {







  };

  /* -------------------------------------------------------------------------- */
  /*                  FUNCIÓN 6 - Cambiar estado de tarea [PUT]                 */
  /* -------------------------------------------------------------------------- */
  function botonesCambioEstado() {
    
    



  }


  /* -------------------------------------------------------------------------- */
  /*                     FUNCIÓN 7 - Eliminar tarea [DELETE]                    */
  /* -------------------------------------------------------------------------- */
  function botonBorrarTarea() {
   
    

    

  };

});