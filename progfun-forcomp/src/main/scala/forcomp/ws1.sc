package forcomp

object ws1 {
  type Occurrences = List[(Char, Int)]
  type Word = String
  type Sentence = List[Word]
  
  val sentence = List("I", "love", "you")         //> sentence  : List[String] = List(I, love, you)
	
	Anagrams.sentenceAnagrams(sentence)       //> res0: List[forcomp.Anagrams.Sentence] = List(List(you, Io, Lev), List(you, L
                                                  //| ev, Io), List(you, olive), List(Io, you, Lev), List(Io, Lev, you), List(Lev,
                                                  //|  you, Io), List(Lev, Io, you), List(olive, you))

}
  
  