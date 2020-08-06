package org.devinthesky.tipoOrgao

class TipoOrgao {

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
