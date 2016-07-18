import org.atilika.kuromoji.Tokenizer

/**
 */
fun tokenize(message : String) {
    val tokenizer = Tokenizer.builder().build()
    val tokens = tokenizer.tokenize(message)
    tokens.forEach {
        println(it.surfaceForm)
        println(it. allFeatures)
    }
}