# frozen_string_literal: true

print "Digite a altura do aquário (cm): "
altura = gets.to_f
print "Digite o comprimento do aquário (cm): "
comprimento = gets.to_f
print "Digite a profundidade do aquário (cm): "
profundidade = gets.to_f

volume = (altura * comprimento * profundidade) / 1000
puts "O volume do aquário equivale a: #{volume}l"