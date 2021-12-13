//importar modulo do React
import React from "react";

//importar css
import './Atividade3.css';

//Componente
class Atividade3 extends React.Component{

    //contrutor
    constructor(props){
        super(props);

        this.state = {
            nota1:'',
            nota2:'',
            nota3:'',
            media:'',
            situacao:'',
            exibir : 'none'
        };
    }

    //Enviar as notas para os states
    enviarNotas = (e)=> {
        let nomeCampo = e.target.name;
        let valorCampo = e.target.value;
        this.setState({[nomeCampo] : valorCampo});
    }

    //Função p calcular
    calcular = () => {
        
        let calculoMedia = (
            parseFloat(this.state.nota1)+
            parseFloat(this.state.nota2)+
            parseFloat(this.state.nota3)
        )/3;

        let verificarSituacao = calculoMedia >=7 ? 'Aprovado(a)': 'Reprovado(a)';

        this.setState({
            nota1:'',
            nota2:'',
            nota3:'',
            media:calculoMedia.toFixed(1),
            situacao:verificarSituacao,
            exibir : 'block'
        });



    }




    //REtorno
    render(){
        return(
            <form className = 'formularioAtividade3'>
                <h1 style={{display:this.state.exibir}}>{this.state.situacao} com média {this.state.media}</h1>
                
                <input type ='nuber' placeholder= 'nota1'className= 'form-control' name='nota1'onChange={this.enviarNotas} value={this.state.nota1}/>
                <input type ='nuber' placeholder= 'nota2'className= 'form-control' name='nota2'onChange={this.enviarNotas} value={this.state.nota2}/>
                <input type ='nuber' placeholder= 'nota3'className= 'form-control' name='nota3'onChange={this.enviarNotas} value={this.state.nota3}/>
                <input type ='button' value= 'calcular'className= 'btn btn-primary' onClick={this.calcular}  />
            </form>
        )
    }

}

//Exportar
export default Atividade3;
