package qotd

import grails.transaction.Transactional

@Transactional
class QuoteService {

    def getStaticQuote() {
        return new Quote(author: "Anonymous",
            content: "Real Programmers fix their wife Quiche!")
    }

    def getRandomQuote() {
        def allQuotes = Quote.list()
        allQuotes.add getStaticQuote()

        def randomIdx = new Random().nextInt(allQuotes.size())
        def randomQuote = allQuotes[randomIdx]

        randomQuote
    }
}
