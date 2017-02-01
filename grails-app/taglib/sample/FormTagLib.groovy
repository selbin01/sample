package sample

class FormTagLib {

    static namespace = 'il'

    def body = { attrs, body ->

        print 'Hits taglib to build body'
        println()
        out << body()
//        first time from RequestForwarder - dispatcher.forward(request, response);
//        second time from RequestForwarder - return fowardURI
    }
}
