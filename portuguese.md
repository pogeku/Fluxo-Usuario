# Fluxo-Usuario
#### [Swagger](http://localhost:8080/swagger-ui/index.html)

### <div align="center"> Usuario Controller</div>

Recebe uma requisição do tipo `GET` para retornar todos os usuários cadastrados.
<img src="./images/findAll.png">

<br>
<br>

Recebe uma requisição do tipo `GET` para retornar o usuario cadastrado a partir do login informado, quando for o caso.
<img src="./images/findById.png">

<br>
<br>

Recebe uma requisição do tipo `POST` para `CADASTRAR` usuario e responde com o usuario cadastrado.
Caso o usuario tentar se `CADASTRAR` e retornar com o usuario existente, ja existe um usuario com informações requisitadas ja em uso no banco.
<img src="./images/createUser.png">

<br>
<br>

Recebe uma requisição do tipo `DELETE` para excluir o usuario a partir do login informado e responde com a confirmação da exclusão.
<br>
Ou quando acontece um erro ele retorna com a impossibilidade de exclusão e a justificativa do erro.
<img src="./images/deleteUser.png">
</div>

<br>

### <div align="center">Postman em manutenção </div>
<div align="center">

👨🏾‍🔧[Postman Documentação](https://documenter.getpostman.com/view/38340143/2sAY4vi3vF) 👨🏾‍🔧 <br>
Todo o teste da API e seu funcionamento.
<br>
Quando você clicar iniciar o programa, 
acesse o mapeamento do utilizando o site acima. 
<br>

</div>