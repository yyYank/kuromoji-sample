import com.atilika.kuromoji.ipadic.Tokenizer

/**
 */
fun tokenize(message : String) {
    val tokenizer = Tokenizer()
    val tokens = tokenizer.tokenize(message)
    tokens.forEach {
        println(it.surface)
        println(it.allFeatures)
    }
}