# frozen_string_literal: true

print "Digite seu saldo: "
saldo = gets.to_f

saldo += saldo * 0.03

puts "Seu saldo com 3% de reajuste é igual a: R$#{saldo}"