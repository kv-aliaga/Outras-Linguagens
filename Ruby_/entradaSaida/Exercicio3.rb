# frozen_string_literal: true

cotacaoUSBR = 5.56
taxaUS = 20
pacoteViagemUS = 200

print "Digite a quantidade de pacotes de viagem: "
qtdPacotes = gets.to_i

totalUS = (taxaUS * qtdPacotes) + (pacoteViagemUS * qtdPacotes)
totalBR = totalUS * cotacaoUSBR

puts "Comprando #{qtdPacotes} pacotes de viagem, você gastará: "
puts "US$ #{totalUS}"
puts "R$ %.2f" % totalBR