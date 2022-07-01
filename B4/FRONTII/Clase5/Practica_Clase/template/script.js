let primerItem = document.querySelector('li')
let elementosLi = document.querySelectorAll('li')


elementosLi[1].style.color = 'blue'
primerItem.style.color = 'blue'
console.log(primerItem)
 primerItem.classList.add('orange-black')

 if(confirm('desea eliminar la negrita'))
 primerItem.classList.add('bold')

 function cambiarNegrita(){
    primerItem.classList.toggle('bold')
 }




 for( item of elementosLi){
     item.classList.add('bold')
 }
 primerItem.classList.remove('bold')