//importar modulo do React

import React from 'react';

//componente é uma classe para herdar os componentes do react
class Atividade1 extends React.Component{

//contrutor = método que executa automaticamente quando chamado o componente
constructor(props){

    //contrutor do componente
    super(props);

    //State = para visualizar em tempo real as alteraçoes

    this.state= {texto: ''}
}
//Função para alterar o valor do state
acao =(e) => {
    this.setState({texto:e.target.value});

}

//retorno
render(){
    return(
        <form>
            <h1>{this.state.texto ===''?'Preencha o campo':this.state.texto}</h1>
            <input type = 'text'placeholder = 'Digite algo...' onChange={this.acao}/>
        </form>
    )
}
}
//Exportar
export default Atividade1;

