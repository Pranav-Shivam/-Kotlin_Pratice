import java.util.Scanner
fun main() {
  var sc=Scanner(System.`in`)
  println("\n")
  println("Enter a,b and c so that we can find out the nature of the root ")
  println("Where Equation is ax^2+bx+c =0 ")
  println("Enter a ")
  var a:Int=sc.nextInt()
  println("Enter b ")
  var b:Int=sc.nextInt()
  println("Enter c ")
  var c:Int=sc.nextInt()
  val D=b*b-4*a*c
  if(D!=0)
  {
    if(D>0)
    {
      println("Root are real and distinct.")
    }
    else
    {
      println("Root are not real means complex and distinct.")
    }
  }
  else
  {
      println("Root are real and equal")
  }

}