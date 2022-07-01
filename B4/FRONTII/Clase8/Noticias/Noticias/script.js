//Entrada de datos(repositorio) - procesamiento - Salida de datos

const noticias = [
    {
        titulo: 'Noticia 1',
        cuerpo: ' Lorem ipsum dolor sit amet consectetur adipisicing elit. Libero commodi voluptatum explicabo veroreiciendis consequatur nostrum fuga quis, exercitationem ab esse neque adipisci minus cupiditate quae voluptatibus aliquam itaque saepe!Aut ut molestiae pariatur inventore eaque enim alias possimus ea obcaecati cumque optio maiores nullanisi laborum, est quo necessitatibus deleniti ratione.Architecto alias laborum culpa maiores saepeeaque facilis?'
    }, 
    {
        titulo: 'Noticia 2',
        cuerpo: ' Lorem ipsum dolor sit amet consectetur adipisicing elit. Libero commodi voluptatum explicabo veroreiciendis consequatur nostrum fuga quis, exercitationem ab esse neque adipisci minus cupiditate quae voluptatibus aliquam itaque saepe!Aut ut molestiae pariatur inventore eaque enim alias possimus ea obcaecati cumque optio maiores nullanisi laborum, est quo necessitatibus deleniti ratione.Architecto alias laborum culpa maiores saepeeaque facilis?'
    }, 
    {
        titulo: 'Noticia 3',
        cuerpo: ' Lorem ipsum dolor sit amet consectetur adipisicing elit. Libero commodi voluptatum explicabo veroreiciendis consequatur nostrum fuga quis, exercitationem ab esse neque adipisci minus cupiditate quae voluptatibus aliquam itaque saepe!Aut ut molestiae pariatur inventore eaque enim alias possimus ea obcaecati cumque optio maiores nullanisi laborum, est quo necessitatibus deleniti ratione.Architecto alias laborum culpa maiores saepeeaque facilis?'
    }, 
    {
        titulo: 'Noticia 4',
        cuerpo: ' Lorem ipsum dolor sit amet consectetur adipisicing elit. Libero commodi voluptatum explicabo veroreiciendis consequatur nostrum fuga quis, exercitationem ab esse neque adipisci minus cupiditate quae voluptatibus aliquam itaque saepe!Aut ut molestiae pariatur inventore eaque enim alias possimus ea obcaecati cumque optio maiores nullanisi laborum, est quo necessitatibus deleniti ratione.Architecto alias laborum culpa maiores saepeeaque facilis?'
    }
]

function listarNoticias(listaDeNoticias){
    let contenedor = document.querySelector('.contenedor')

    for(let noticia of listaDeNoticias){
        let textTitulo = document.createTextNode(noticia.titulo)
        let textCuerpo = document.createTextNode(noticia.cuerpo)
      
        let divNoticia = document.createElement('div')
        divNoticia.classList.add('noticia')
        let tituloNoticia = document.createElement('h4')
        tituloNoticia.classList.add('titulo')
        let cuerpo = document.createElement('p')

        tituloNoticia.appendChild(textTitulo)
        cuerpo.appendChild(textCuerpo)
        divNoticia.appendChild(tituloNoticia)
        divNoticia.appendChild(cuerpo)
        contenedor.appendChild(divNoticia)
    }

}

listarNoticias(noticias)

