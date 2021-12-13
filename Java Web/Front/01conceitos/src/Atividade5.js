//Importar o modulo React
import React from "react";

//Imprtar o css
import './Atividade5.css';

//classe

class Atividade5 extends React.Component{
    
    //construtor
    constructor (props){
    super (props);
    //para  cada input eu vou ter um state, é a variavel que recebe a informação do usuario e ter a informação p retorno.
    this.state ={peso:''}
    this.state ={altura:''}
    this.state ={imc:''}
    this.state ={situacao:''}

    }

    //função p Enviar dados p states (padrao* mesmo com varios campos a estrutura será essa)
    enviarDados = (e)=>{
        let nomeCampo = e.target.name;
        let valorCampo = e.target.value;
        this.setState({[nomeCampo] : valorCampo});
    }

    //função p Realizar calculo de imc e situação

    calculo=()=>{

    //var imc = this.state.peso / (this.state.altura * this.state.altura)
    var imc = (this.state.peso /Math.pow(this.state.altura,2)).toFixed(2); // função para elevado

    //situação
    var situacao = 'Abaixo do peso';
    if(imc>=18.6 && imc <=25){
        situacao= "Peso normal"
    }else if(imc>=25.1 && imc <=30){
        situacao= "Acima do peso"
    }else if(imc>=30.1 && imc <=35){
        situacao= "Obesidade I"
    }else if(imc>=35.1 && imc <=40){
        situacao= "ObesidadeII"
    }else if(imc>40){
        situacao= "ObesidadeIII"
    }
    //Atribuir os valores para os states (padrao*)
    this.setState({
        imc:imc,
        situacao:situacao
    });

    }



    //Retorno
    render(){
        return(
            <form className='form5'>
                {this.state.imc !== ''?

                <p>{this.state.situacao} com IMC de : {this.state.imc}</p>
                :''
            }

                {this.state.altura} - {this.state.peso}
                <input type= 'number' name='peso' placeholder ='Peso'className='form-control' onChange={this.enviarDados}></input>
                <input type= 'number' name='altura' placeholder ='Altura'className='form-control' onChange={this.enviarDados}></input>
                <input type= 'button'value = 'Calcular' onClick={this.calculo} className='btn btn-outline-primary'></input>
            </form>
        )
    }

}
export default Atividade5;