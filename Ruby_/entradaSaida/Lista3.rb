# frozen_string_literal: true

print "Digite seu peso em kg: "
pesoKg = gets.to_f
print "Digite sua altura em m: "
altura = gets.to_f

imc = pesoKg / (altura * altura)
puts "O seu IMC é de %.2f" %imc