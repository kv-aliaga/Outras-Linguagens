# frozen_string_literal: true

# em ruby, print não pula a linha
print "Digite a quantidade de km andados: "
km = gets.to_f # faz o input e transforma o resultado em float
print "Digite a quantidade de horas: "
qtdHoras = gets.to_f

media = km / qtdHoras

puts "A média de quilômetros é #{media}km/h"