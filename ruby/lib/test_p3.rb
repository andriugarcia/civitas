# encoding:utf-8
require_relative('vista_textual')
require_relative('civitas_juego')
require_relative('dado')
require_relative('controlador')


module Civitas

    class TestP3
        def initialize
        end

        def self.main
            vista = Vista_textual.new
            juego = CivitasJuego.new(["Jugador 1", "Jugador 2", "Jugador 3", "Jugador 4"])
            Dado.instance.setDebug(true)
            controlador = Controlador.new(juego, vista)

            controlador.juega
        end

    end

    TestP3.main

end
