
//Importar o modulo React
import React from "react";


//Imprtar o css

import './Atividade4.css';

//Class
class Atividade4 extends React.Component{

    //contrutor
    constructor (props){
        super(props);

        this.state = { valor:''}
    }
    //Realizar o calculo
    calculo = (e) =>{
        let moeda = parseInt(e.target.value);

        switch(moeda){
            case 1:
                alert((this.state.valor/5.48).toFixed(2))
            break;

            case 2:
                alert((this.state.valor/6.21).toFixed(2))
            break;

            case 3:
                alert((this.state.valor/7.35).toFixed(2))
            break;

            case 4:
                alert((this.state.valor* 18.32).toFixed(2))
            break;
        }
    }

    //Render
    render(){
        return(
            <form className= 'form4'>
              
                <input type= 'number' placeholder= 'valor' className= 'form-control'onChange={e=> this.setState({valor:parseFloat(e.target.value)})}/>
                <select onChange={this.calculo}>
                    <option value ='0'>Imforme um tipo de moeda</option>
                    <option value ='1'>Dólar</option>
                    <option value ='2'>Euro</option>
                    <option value ='3'>Libra</option>
                    <option value ='4'>Peso Argentino</option>
                </select>
                </form>
        )
    }
}

//Exportar 
export default Atividade4;
