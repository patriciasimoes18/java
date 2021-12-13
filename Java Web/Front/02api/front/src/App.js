//modulo React
import React from 'react';

//importar css
import './App.css';

//componente 
class App extends React.Component{

  //construtor
  constructor(props){
    super(props);

    this.state = {
      indiceProduto:'',
      produtos:[],
      botaoCadastrar:true,
      produto:'',
      marca:'',
      valor:''
    }
  }
  //função para obter os produtos, assim que renderizar o componente
  componentDidMount(){

    //Requisição
    fetch('http://localhost:3000/produtos')
    .then(retorno => retorno.json())
    .then(produtos => this.setState({produtos:produtos}));
  }
  //funçao para pegar o nome e o valor digitado
  aoDigitar =(e)=>{
    var nome = e.target.name;
    var valor = e.target.value;

   // console.log(nome+'-'+valor)
   this.setState({[nome]:valor})
  }
  //cadastrar produto
  cadastrar=()=>{
    let obj={
      'produto':this.state.produto,
      'marca':this.state.marca,
      'valor':this.state.valor
    }
    //requisição
    fetch('http://localhost:3000/produtos',{
      method:'post', 
      headers:{
        'accept':'application/json', 
        'content-type':'application/json'
      },
      bory:JSON.stringify(obj) //converter o json para string
    })
    .then(retorno=> retorno.json())
    .then((retorno)=>{
      let copiaVetor=[...this.state.produtos];
      copiaVetor.push(retorno);
      this.setState({produtos:copiaVetor});

      this.resetFormulario();
    });

  }
  //selecionar o produto pelo indice
  selecionar = (indice) =>{

    let obj= this.state.produtos[indice];

    this.setState({
      produto:obj.produto,
      marca:obj.marca,
      valor:obj.valor,
      indiceProduto:indice,
      botaoCadastrar:false
    })   
  }
  //limpar campos e alterar visibilidade dos botoes
  resetFormulario = ()=>{
    this.setState({
      produto:'',
      marca:'',
      valor:'',
      botaoCadastrar:true
    })
  }
  //remover produto
  remover=()=>{
    let obj = this.state.produtos[this.state.indiceProduto];
    fetch('http://localhost:3000/produtos'+obj.id, {method:'delete'})
    .then(()=>{
      let copiaVetor =[...this.state.produtos];
      copiaVetor.splice(this.state.indiceProduto,1);
        this.setState({
          produtos:copiaVetor
        })
this.resetFormulario();
    })
  
  }
  //alterar produto
  alterar=()=>{
    //objeto
    let indice = this.state.produtos[this.state.indiceProduto].id;

    let obj={
      'produto':this.state.produto,
      'marca':this.state.marca,
      'valor':this.state.valor
    }


    //requisição
    fetch('http://localhost:3000/produtos/'+indice,{
      method:'put', 
      headers:{
        'accept':'application/json', 
        'content-type':'application/json'
      },
      body:JSON.stringify(obj) //converter o json para string
    })
    .then(retorno=> retorno.json())
    .then((retorno)=>{
      let copiaVetor=[...this.state.produtos];
      copiaVetor[this.state.indiceProduto]=retorno;
      this.setState({produtos:copiaVetor});

      this.resetFormulario();
    });

  }
  //render
  render(){
    return(
      <div>
      <form>
        <input type ='text'name='produto'value={this.state.produto} onChange={this.aoDigitar} placeholder='Produto' className='form-control'/>
        <input type ='text'name='marca'  value={this.state.marca}   onChange={this.aoDigitar} placeholder='Marca'   className='form-control'/>
        <input type ='text'name='valor'  value={this.state.valor}   onChange={this.aoDigitar} placeholder='Valor'   className='form-control'/>

        {this.state.botaoCadastrar===true?

        <input type='button' value='Cadastrar' className='btn btn-primary'disabled={!this.state.produto||!this.state.marca||!this.state.valor} onClick={this.cadastrar}/>
        :
        <div>
        <input type='button' value='Alterar'   className='btn btn-warning'onClick={this.alterar}/>
        <input type='button' value='Remover'   className='btn btn-danger'onClick={this.remover}/>
        <input type='button' value='Cancelar'  className='btn btn-secondary' onClick={this.resetFormulario}/>
        </div>
      }
      </form>
        <table className='table'>
        <thead>
          <th>Produto</th>
          <th>Marca</th>
          <th>Valor</th>
          <th>Selecionar Produto</th>
        </thead>
          <tbody>
            {this.state.produtos.map((p,i) =>(
              <tr>
                <td>{p.produto}</td>
                <td>{p.marca}</td>
                <td>{p.valor}</td>
                <td><button className='btn btn-info' onClick={()=>this.selecionar(i)}>Selecionar</button></td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    )
  }
}
//exportar
export default App;