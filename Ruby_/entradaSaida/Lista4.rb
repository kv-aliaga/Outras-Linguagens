# frozen_string_literal: true

print "Digite quantos anos você tem: "
anos = gets.to_i
print "Digite quantos meses faltam para seu próximo aniversário: "
meses = gets.to_i
print "Digite quantos dias faltam para o dia do próximo mês com o mesmo dia do seu aniversário: "
dias = gets.to_i

anos *= 365
meses *= 30

puts "Desde que você nasceu se passaram: #{anos + meses + dias}"