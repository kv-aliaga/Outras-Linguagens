# Hello World
puts "Hello World!"

# Variáveis
nome = "Jones"
idade = 15
puts nome
puts idade

# Condicionais
if idade >= 18
  puts "Maior"
else
  puts "Menor"
end

# Repetições
c = 0
while c < 5
  puts "Contador é #{c}"
  c += 1
end

for i in 1..3
  puts "Número: #{i}"
end

# Métodos
def saudacao(nome)
  puts "Olá #{nome}!"
end

saudacao(nome)

# Listas
frutas = ["Maçã", "Uva", "Banana"]
puts frutas[0] # mostra Maçã
frutas << "Uva" # adiciona Uva a lista
puts frutas