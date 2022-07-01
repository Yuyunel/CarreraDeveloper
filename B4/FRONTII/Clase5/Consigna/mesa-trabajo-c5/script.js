//let cambiarTema = window.confirm('Desea cambiar el tema a oscuro')

//let fondoOscuro = document.querySelector('body')
//fondoOscuro.classList.remove('backgroundOscuro')
//fondoOscuro.classList.add('backgroundOscuro')
//let miTitulo = document.querySelector('h1')
//miTitulo.classList.remove('FamiliaFelinos')
//miTitulo.classList.add('FamiliaFelinos')
//let misItem = document.querySelectorAll('div.item')
//misItem.classList.remove('itemOscuro')
//misItem.classList.add('itemOscuro')
//let misTitulos = document.querySelectorAll('p')
//misTitulos.classList.remove('colorTexto')
//misTitulos.classList.add('colorTexto')

let body = document.querySelector('body')
let h1 = document.querySelector('h1')
let item = document.querySelectorAll('div.item')
let texto = document.querySelectorAll('p')
let h2 = document.querySelectorAll('h2')


if(confirm('Desea el tema oscuro?')){
    //body.classList.remove('body')
    body.classList.add('body-black')
    //h1.classList.remove('h1')  
    h1.classList.add('h1-black')
    
}

for(let i of item){
    i.classList.add('item-black')
    
}
for(let i of texto){
    i.classList.add('texto-black')
}

for(let i of h2){
    i.classList.add('h2-black')
}