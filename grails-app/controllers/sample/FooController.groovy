package sample

class FooController {

    def index() {}


    def save() {
        print "In save going to render view"
        println()
        render view: 'savedpage'
    }

    def saveNew() {
        print "In new save going to forward to save"
        println()
        forward(action: "save")
    }
}
