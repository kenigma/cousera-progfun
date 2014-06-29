package forcomp

object ws1 {
  type Occurrences = List[(Char, Int)]
  type Word = String
  type Sentence = List[Word];import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(164); 
  
  val sentence = List("I", "love", "you");System.out.println("""sentence  : List[String] = """ + $show(sentence ));$skip(39); val res$0 = 
	
	Anagrams.sentenceAnagrams(sentence);System.out.println("""res0: List[forcomp.Anagrams.Sentence] = """ + $show(res$0))}

}
  
  