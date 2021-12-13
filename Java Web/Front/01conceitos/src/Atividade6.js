
import React from "react";

import './Atividade6.css';


class Atividade6 extends React.Component{
    constructor(props){
    super (props);

    this.state = {
        numero:'',
        tabuada:[]}
    }
    //enviar dados
    enviarDados = (e)=>{
        this.setState({numero:e.target.value});
    }
    //calculo tabuada
    calculo=() => {

        let calculoTabuada=[]
        for(let i=0; i<11;i++){

            calculoTabuada.push(this.state.numero*i)
        }
        this.setState({tabuada:calculoTabuada})
        }
    render(){
        return(
            <form>
                <input type= 'number' placeholder='Informe um valor'onChange={this.enviarDados}></input>
                <input type='button' value='Calcular' onClick={this.calculo} />

                <ul>
                    {this.state.tabuada.map((valor, indice)=>(
                    <li>{this.state.numero} x {indice} = {valor}</li>
                    ))}
                </ul>
                
            </form>
        )
    }
}
export default Atividade6;
