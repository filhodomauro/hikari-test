import hikari.test.Item
import hikari.test.Pessoa

class BootStrap {

    def init = { servletContext ->
        new Pessoa(name:"Mauro", idade: 31).save flush:true
        new Item(name: "Item 1").save flush: true
        new Item(name: "Item 2").save flush: true
    }
    def destroy = {
    }
}
