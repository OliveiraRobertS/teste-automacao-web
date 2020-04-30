Feature: cadastro novo fornecedor

Scenario: Cadastro fornecedor
	When que eu entrei no sistema
	And clique em Accounts
	And clique no Suppliers
	And clique no botão ADD
	And preencha o fomulário
	Then devo validar o email cadastrado na lista
