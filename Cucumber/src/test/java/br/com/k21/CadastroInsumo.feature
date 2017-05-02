# language: pt
Funcionalidade: Cadastro de insumos
    Eu, enquanto usuario seguro, gostaria de cadastrar um insumo tipo material
 
Cenario: Cadastro insumo tipo material
    Dado que logado na tela de cadastro de insumo
    Quando informo descricao "descricao"
    E unidade de medida "kg"
    E grupo insumo do tipo Material de Consumo "27.001" (Aglomerantes) 
    E salvo
    Entao deve existir mensagem de cadastro com sucesso
    
    
    


    