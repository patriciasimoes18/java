//Importar modulo do React
import React from "react";

//Componente
class Atividade2 extends React.Component{

    //construtor
    constructor(props){
        super(props);

        this.state= {contador : 0}
          
    }
//Incrementar
incrementar = ()=>{
    var valor = parseInt(this.state.contador)+1;
    
    this.setState({contador :valor});
 
}
//Decrementar
 decrementar = ()=>{
 var valor = parseInt(this.state.contador) -1;

 this.setState({contador:valor});


}


//Retorno
render(){
    return(
        <div>
            <h1> {this.state.contador}</h1>
            <button onClick = {this.incrementar}>Incrementar</button>
            <button onClick = {this.decrementar}>Decrementar</button>
        </div>
    )
}
}
//Exportar
export default Atividade2;