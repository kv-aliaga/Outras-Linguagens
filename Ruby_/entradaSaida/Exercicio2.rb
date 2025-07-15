# frozen_string_literal: true

banhoDez = 10
lPorMin = 120
lPorMin /= banhoDez

print "Digite a quantidade de minutos do banho: "
qtdMinutos = gets.to_i

totalLitros = qtdMinutos * lPorMin

puts "Um banho de #{qtdMinutos} minutos gasta #{totalLitros}l"