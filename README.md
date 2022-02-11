# App-Agendamento-Membros-API
API de membros/cliente para o App Agendamentos

# Classes
- Membro
- Detalhe

# Atributos Detalhe

- Detalhe {
- email	string
- id	integer($int32)
- telefone	integer($int64)
}

# Atributos Membro

- Membro {
- detalhe	Detalhe
- id	integer($int32)
- nome	string
- sobrenome	string
}
