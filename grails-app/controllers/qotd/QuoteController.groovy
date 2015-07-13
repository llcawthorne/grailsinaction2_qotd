package qotd

class QuoteController {

    static scaffold = true
    def quoteService

//    def index() {
//        render "<h1>Real Programmers like to fix their wife Quiche"
//    }

    def random = {
        [ quote: quoteService.getRandomQuote() ]
    }

    def ajaxRandom() {
        def randomQuote = quoteService.getRandomQuote()
        render {
            q(randomQuote.content)
            p(randomQuote.author)
        }
    }
}
