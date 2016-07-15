package hikari.test

import grails.rest.Resource


/**
 * Created by maurofilho on 7/15/16.
 */
@Resource(uri='/pessoas', formats=['json'])
class Pessoa {
    String name
    Integer idade
}
