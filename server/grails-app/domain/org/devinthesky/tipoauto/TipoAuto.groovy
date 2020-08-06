package org.devinthesky.tipoauto

import grails.rest.*

@Resource
class TipoAuto {

    String designacao
    String uuid

    static mapping = {
        uuid generator: 'uuid'
    }

    static constraints = {
        designacao nullable: false
    }

    @Override
    String toString() {
        return designacao
    }
}
