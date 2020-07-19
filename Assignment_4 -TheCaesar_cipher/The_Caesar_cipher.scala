object The_Caesar_cipher extends App{
	println("The Caesar cipher");

	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ "

	val Encrypt =(c:Char,shiftkey:Int,a:String)=>a((a.indexOf(c.toUpper)+shiftkey) % a.size)
	val Decrypt =(c:Char,shiftkey:Int,a:String)=>a((a.indexOf(c.toUpper)-shiftkey+a.size) % a.size)	

	val Cipher=(algo:(Char,Int,String)=>Char,s:String,shiftkey:Int,a:String)=>s.map(algo(_,shiftkey,a))
	val shiftkey=scala.io.StdIn.readLine("Shift key value ").toInt;
	val text= scala.io.StdIn.readLine("Enter the Massage to Encrypt ")

	var Encrypt_text =Cipher(Encrypt,text,shiftkey,alphabet)
	var Decrypt_text =Cipher(Decrypt,Encrypt_text,shiftkey,alphabet)

	println("The Encrypt Text : "+ text+" == > " + Encrypt_text)
	println("The Decrypt Text : "+ Encrypt_text +" == > " + Decrypt_text)
	//THE Encrypt_text : Hello world ==>MJQQTEATWQI shiftkey is 5
	//The Decrypt Text : MJQQTEATWQI == > HELLO WORLD
	println("\nThe Method of Julius Caesar (shiftkey is 1 )")

	Encrypt_text = Cipher(Encrypt,text,1,alphabet)
	Decrypt_text = Cipher(Decrypt,Encrypt_text,1,alphabet)
	println("The Encrypt Text : "+ text+" == > " + Encrypt_text)
	println("The Decrypt Text : "+ Encrypt_text +" == > " + Decrypt_text)
	// The Encrypt Text : HELLO WORLD == > IFMMPAXPSME
	// The Decrypt Text : IFMMPAXPSME == > HELLO WORLD

}