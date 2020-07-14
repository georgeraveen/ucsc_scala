object CaesarCipher extends App{

  println("Hello, Caesar Cipher!")
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  val inputString = "Hello"

  val EncryptChar = (c:Char, shiftKey:Int, alpha:String) => alpha((alpha.indexOf(c.toUpper)+shiftKey) % alpha.size)
  val DecryptChar = (c:Char, shiftKey:Int, alpha:String) => alpha((alpha.indexOf(c.toUpper)-shiftKey) % alpha.size)
  val cipher = (algo:(Char,Int,String)=>Char,text:String,shiftKey:Int,alpha:String)=>text.map(algo(_,shiftKey,alpha))
//  val cipher = (algo:(Char,Int,String)=>Char,text:String,shiftKey:Int,alpha:String)=>text.map(B=>algo(B,shiftKey,alpha))
  val Encrypt=cipher(EncryptChar,inputString,5,alphabet)
  val Decrypt=cipher(DecryptChar,Encrypt,5,alphabet)
  println("Encrypt Text:"+inputString+" => "+Encrypt)
  println("Decrypt Text:"+Encrypt+" => "+Decrypt)
 
}

