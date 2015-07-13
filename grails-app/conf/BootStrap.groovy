import qotd.*

class BootStrap {

    def init = { servletContext ->
        if(Quote.count()==0) {
            createSampleData()
        }
    }
    def destroy = {
    }

    def createSampleData() {
        println "||Creating sample data"
        println "........................................"

        new Quote(author: "Peter Ledbrook", content: "Time waits for no main").save(failOnError: true)
        new Quote(author: "Glen Smith", content: "Groovy solves all problems").save(failOnError: true)
        new Quote(author: "Larry Wall", content: "There is more than one method to our madness.").save(failOnError: true)
        new Quote(author: "Chuck Norris Facts",
                content: "Chuck Norris always uses his own design patterns, and his favorite is the Roundhouse Kick.").save(failOnError: true)
        new Quote(author: "Eric S Raymond",
            content: "Being a social outcast helps you stay concentrated on the really important things, like thinking and hacking.").save(failOnError: true)
    }
}
