//let elh1 = document.querySelector("h1");

//console.log(elh1);

//let losParrafos = document.querySelectorAll("p");

//for (const unParrafo of losParrafos){
  //  console.log(unParrafo)
//}

//const nombre = "Mauro";
//const miTemplate = `Mi nombre es ${nombre}`;
//console.log(miTemplate);

//const miTemplate=`2*3 es ${2*3}`;
//console.log(miTemplate);

//function suma(var1, var2){
  //  return var1 + var2
//}
//const temp = `el resultado es ${suma(2,2)}`;
//console.log(temp);
let confimarCambios = confirm("¿quieres cambiar el color del titulo");

if(confimarCambios){
    let titulo = document.querySelector("h1");
titulo.innerHTML += "soy un contenido nuevo desde JS";
titulo.style.color = "red";
titulo.style.fontSize = "50px";

}




