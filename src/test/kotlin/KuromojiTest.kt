import org.junit.Test

/**
 */
public class KuromojiTest {


    @Test
    fun `Kotlinスタートブック`(){
        tokenize("Kotlinスタートブック 新しいAndroidプログラミング")
    }

    @Test
    fun `Kotlinスタートブックの説明`(){
        tokenize(
                """Kotlinは、まさにJavaの代替言語として登場しました。
                静的型付け、オブジェクト指向、ラムダ式や高階関数、
                さらに拡張関数やNull安全といった特徴を保持。
                最も注目すべきJVM言語として2016年2月、
                いよいよ正式版がリリースされました。

                本書では日本Kotlinユーザグループ代表を務める著者が
                Kotlinの文法と機能を幅広く、かつ詳しく解説し
                Androidアプリの作例を示します。
                この1冊で、Androidプログラミングにおける
                Kotlinの活用術が身につくだけでなく、
                Webアプリやツールの開発にも応用できるようになるでしょう。"""
        )
    }

    @Test
    fun `こちょりん`(){
        tokenize("こちょりん")
    }

    @Test
    fun `ことりん`(){
        tokenize("ことりん")
    }

    @Test
    fun `Kotlin`(){
        tokenize("Kotlin")
    }

    @Test
    fun `JetBrains`(){
        tokenize("JetBrains")
    }

}
