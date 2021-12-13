//Impotar modos do React
import React from 'react';

//Importar atividades
import Atividade1 from './Atividade1';
import Atividade2 from './Atividade2';
import Atividade3 from './Atividade3';
import Atividade4 from './Atividade4';
import Atividade5 from './Atividade5';
import Atividade6 from './Atividade6';

//classe
class App extends React.Component{
  
  //Retorno - render para exibir a mensagem
  render(){
    return(<Atividade6/>)

    // var texto = "O resultado de 5+5 é ";
    // var exibir = false;
    // var nomes = ['Anderson','Bruna','Caio','Daniel','Ellen'];
    // var dados = [
    //   {'nome': 'Anderson', 'idade':32},
    //   {'nome': 'Bruna', 'idade':24},
    //   {'nome': 'Caio', 'idade':43}
    // ];

    // return(
    //   <div>
    // <h1>Aprendendo React</h1>    
    // <p>Hello world</p> 
    // <p>{texto}{5+5}</p>

    // {/*operador ternario */}
    // {exibir ? <p>Alguma coisa...</p> : ''};

    // <ul>
    //   {nomes.map(n => <li>{n}</li>)}
    // </ul>
    // <table>
    //   {dados.map(obj => (
    //       <tr>
    //         <td>{obj.nome}</td>
    //         <td>{obj.idade}</td>
    //       </tr>
    //   ) )}
    // </table>

    // </div>
   // )  
}
}
//Exportar
export default App;
