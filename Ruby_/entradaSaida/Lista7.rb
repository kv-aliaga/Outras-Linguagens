# frozen_string_literal: true

salarioMinimo = 1518
print "Digite seu salário: R$"
salario = gets.to_f

qtdSalMin = salario / salarioMinimo

puts "Com um salário de R$#{salario}"
puts "Você ganha %.2f salários mínimos" %qtdSalMin