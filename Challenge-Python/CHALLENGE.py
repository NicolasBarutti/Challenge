import re
from datetime import datetime


def criar_cadastro(cad):
    print("\nCriando Cadastro\n")
    nome = input("Digite seu nome: ").strip()
    while not re.match("^[A-Za-z ]+$", nome):
        print("Nome inválido. Por favor, digite um nome válido.")
        nome = input("Digite seu nome: ").strip()

    cpf = input("Digite seu CPF (apenas números): ").strip()
    while not re.match("^\d{11}$", cpf):
        print("CPF inválido. O CPF deve conter 11 dígitos.")
        cpf = input("Digite seu CPF (apenas números): ").strip()

    telefone = input("Digite seu telefone (apenas números com DDD): ").strip()
    while not re.match("^\d{10,11}$", telefone):
        print("Telefone inválido. O telefone deve conter 10 ou 11 dígitos.")
        telefone = input("Digite seu telefone (apenas números com DDD): ").strip()

    email = input("Digite seu e-mail: ").strip()
    while not re.match(r"^[\w\.-]+@[\w\.-]+\.\w+$", email):
        print("E-mail inválido. Por favor, digite um e-mail válido.")
        email = input("Digite seu e-mail: ").strip()

    senha = input("Crie uma senha: ").strip()
    cad.append([nome, cpf, telefone, email, senha])
    print("\nCadastro criado com sucesso!\n")
    return email


def entrar_cadastro(cad, email=None):
    while True:
        print("\nEntrando no Cadastro\n")
        if not email:
            email = input("Digite seu e-mail: ").strip()
        senha = input("Digite sua senha: ").strip()
        for usuario in cad:
            if usuario[3] == email and usuario[4] == senha:
                print("\nLogin bem-sucedido.")
                return usuario[0]
        print("\nE-mail ou senha incorretos.")
        opcao = input("Deseja tentar novamente (T) ou criar um novo cadastro (C)? ").lower().strip()
        if opcao == 'c':
            email = criar_cadastro(cad)
    return None


def validar_placa(placa):
    pattern = "^[A-Z]{3}[0-9][0-9A-Z][0-9]{2}$"
    return re.match(pattern, placa) is not None


def validar_ano(ano):
    ano_atual = datetime.now().year
    return ano.isdigit() and 1900 <= int(ano) <= ano_atual


def veiculo(vei):
    print("\nCriando Cadastro de Veículo\n")
    modelo = input("Digite o nome do veículo: ").strip()
    marca = input("Digite a marca: ").strip()
    ano = input("Digite o ano do veículo: ").strip()
    while not validar_ano(ano):
        print("Ano inválido. Por favor, digite um ano entre 1900 e o ano atual.")
        ano = input("Digite o ano do veículo: ").strip()
    placa = input("Digite a placa do seu veículo: ").upper().strip()
    while not validar_placa(placa):
        print("Placa inválida. A placa deve seguir o formato ABC1234 ou ABC1D23.")
        placa = input("Digite a placa do seu veículo: ").upper().strip()
    combustivel = input("Digite o tipo de combustível (Gasolina, Álcool, Diesel, etc.): ").strip()
    cor = input("Digite a cor do veículo: ").strip()

    vei.append([modelo, marca, ano, placa, combustivel, cor])
    print("\nVeículo cadastrado com sucesso!\n")


def peca():
    pecas_disponiveis = {
        1: {"nome": "Pneu", "valor": 300, "local": "Loja AutoTech Repair Solucion, Rua Manoel, 123",
            "pagamento": "Pagamento no Local em até 12 vezes"},
        2: {"nome": "Bateria", "valor": 450, "local": "Loja AutoTech Repair Solucion, Avenida Emanuel , 456",
            "pagamento": "Pagamento no Local em até 12 vezes"},
        3: {"nome": "Parabrisa", "valor": 800, "local": "Loja AutoTech Repair Solucion, Rua Diogo Gomes, 789",
            "pagamento": "Pagamento no Local em até 12 vezes"},
        4: {"nome": "Retrovisor", "valor": 200,
            "local": "Loja AutoTech Repair Solucion, Avenida Eliseu de Almeida, 101",
            "pagamento": "Pagamento no Local em até 12 vezes"},
        5: {"nome": "Farol", "valor": 600, "local": "Loja AutoTech Repair Solucion, Rua Oscar freire, 112",
            "pagamento": "Pagamento no Local em até 12 vezes"},
        6: {"nome": "Óleo do motor", "valor": 150,
            "local": "Loja AutoTech Repair Solucion, Avenida Inter Continental, 131",
            "pagamento": "Pagamento no Local em até 12 vezes"}
    }

    print("\nPeças disponíveis:")
    for numero, detalhes in pecas_disponiveis.items():
        print(
            f"{numero}. {detalhes['nome']}: Valor: R${detalhes['valor']}, Local para buscar: {detalhes['local']}, Forma de pagamento: {detalhes['pagamento']}")

    escolha = int(input("\nDigite o número da peça que deseja ver os detalhes: ").strip())

    detalhes = pecas_disponiveis.get(escolha)

    if detalhes:
        print(f"\nPeça: {detalhes['nome']}")
        print(f"Valor: R${detalhes['valor']}")
        print(f"Local para buscar: {detalhes['local']}")
        print(f"Forma de pagamento: {detalhes['pagamento']}\n")
    else:
        print("\nPeça não encontrada. Tente novamente.\n")


def exibir_menu(nome_usuario):
    print(f"\n-MENU- (Logado como: {nome_usuario if nome_usuario else 'Deslogado'})")
    print("1. Criar Cadastro")
    print("2. Cadastro Veículo")
    print("3. Entrar")
    print("4. Ver Valor e Local de Peças")
    print("5. Acessar o Bot da AutoTech Rapair Solution")
    print("6. Sair\n")


cad = []
vei = []

nome_usuario = None

while True:
    exibir_menu(nome_usuario)
    escolha = int(input("Escolha uma opção: ").strip())

    if escolha == 1:
        email = criar_cadastro(cad)
        nome_usuario = entrar_cadastro(cad, email)
    elif escolha == 2:
        if nome_usuario:
            veiculo(vei)
        else:
            print("Por favor, faça login primeiro.")
    elif escolha == 3:
        nome_usuario = entrar_cadastro(cad)
    elif escolha == 4:
        peca()
    elif escolha == 5:
        print("\nEntre nesse link para conversar com nosso Bot Assistente:")
        print('https://auto-rapair-solution.netlify.app/')
        print("\nRedirecionando...")
    elif escolha == 6:
        print("Saindo...")
        break
    else:
        print("Opção inválida. Tente novamente.")
