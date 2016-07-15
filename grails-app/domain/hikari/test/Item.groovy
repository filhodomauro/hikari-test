package hikari.test

import grails.rest.Resource

/**
 * Created by maurofilho on 7/15/16.
 */
@Resource(uri="/items", formats=['json'])
class Item {
    static mapping = {
        datasource 'lookup'
    }

    String name
}
